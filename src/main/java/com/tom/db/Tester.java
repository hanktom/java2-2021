package com.tom.db;

import java.sql.*;

public class Tester {
    public static void main(String[] args) {
        try {
            //Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection
            Connection conn = DriverManager
                    .getConnection("jdbc:mariadb://localhost:3306/demo?user=user&password=fj123&useUnicode=true&characterEncoding=UTF-8");
            Statement statement = conn.createStatement();
//            statement.executeUpdate("insert into students values('000123', 'Hank')");
            ResultSet rs = statement.executeQuery("SELECT * FROM drinks");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                System.out.println(id + "/" + name + "/" + price);
            }
            //data collected


            //print drinks information


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
