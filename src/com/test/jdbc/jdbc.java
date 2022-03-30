package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Member {
    private String userid;
    private String username;
    private int age;

    Member(String userid, String username, int age) {
        this.userid = userid;
        this.username = username;
        this.age = age;
    }

    static class Builder {
        private String userid;
        private String username;
        private int age;

        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Member build() {
            if(userid == null || username == null || age == 0)
                throw new IllegalStateException("멤버 클래스가 생성이 안됩니다.");
            return new Member(userid, username, age);
        }
    }

    public String getUserid() { return userid; }
    public String getUsername() { return username; }
    public int getAge() { return age; }
}


//stream
class MemberDTO {
    private String userid;
    private String username;
    private int age;

    public String getUserid() { return userid; }
    public String getUsername() { return username; }
    public int getAge() { return age; }

    MemberDTO(Member member) {
        this.userid = member.getUserid();
        this.username = member.getUsername();
        this.age = member.getAge();
    }
}

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw = "123456789";
        String query = "select userid, username, age from tbl_test";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("org.mariadb.jdbc.Driver");
        con = DriverManager.getConnection(url, userid, userpw);
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        List<Member> list = new ArrayList<>();
        List<MemberDTO> listDTO = new ArrayList<>();

        while(rs.next()) {
            //list.add(new Member(rs.getString("userid"), rs.getString("username"), rs.getInt("age")));
            list.add(new Member.Builder()
                        .userid(rs.getString("userid"))
                        .username(rs.getString("username"))
                        .age(rs.getInt("age"))
                        .build());
        }

        /*
        for(Member member : list) {
            System.out.println("아이디 : " + member.getUserid() + ", "
                             + "이름 : " + member.getUsername() + ", "
                             + "나이 : " + member.getAge());
        }
        */

        //stream
        listDTO = list.stream().map(MemberDTO::new).collect(Collectors.toList());
        for(MemberDTO member : listDTO) {
            System.out.println("아이디 : " + member.getUserid() + ", "
                             + "이름 : " + member.getUsername() + ", "
                             + "나이 : " + member.getAge());
        }

        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
    }
}
