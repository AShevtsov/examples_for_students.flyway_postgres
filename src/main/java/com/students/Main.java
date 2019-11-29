package com.students;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test_db",
                    "", // TODO: 29-Nov-19 username
                    ""// TODO: 29-Nov-19 password
                );

            PreparedStatement stmt = con.prepareStatement("select * from users");

            ResultSet rs = stmt.executeQuery();

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
