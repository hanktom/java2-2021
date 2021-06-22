package com.tom.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            List<Drink> drinks = new ArrayList<>();
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                System.out.println(id + "/" + name + "/" + price);
                drinks.add(new Drink(id, name, price));
            }
            //data collected
            //print drinks information
            System.out.println("Please insert coins for drinks:");
            for (Drink drink: drinks) {
//                System.out.println(drink);
                System.out.println(drink.id +") " + drink.name + "\t" + drink.price);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
