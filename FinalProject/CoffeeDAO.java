package com.evergent.corejava.rakshitha.finalproject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CoffeeDAO {

    Connection con = null;
    PreparedStatement pstmt = null;

    public int addCoffee(CoffeeBean coffeeBean) {
        try {
            con = CoffeeDBConnection.getConnection();
            String insertStr = "insert into Coffee_inventory1 values(?,?,?,?)";
            pstmt = con.prepareStatement(insertStr);
            pstmt.setInt(1, coffeeBean.getCoffeeId());
            pstmt.setString(2, coffeeBean.getCoffeeName());
            pstmt.setLong(3, coffeeBean.getSupplierContact());
            pstmt.setDouble(4, coffeeBean.getPrice());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public double getPrice(int coffeeId) {
        try {
            double price = 0;
            con = CoffeeDBConnection.getConnection();
            String selectStr = "select price from coffee_inventory where coffeeId=?";
            pstmt = con.prepareStatement(selectStr);
            pstmt.setInt(1, coffeeId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                price = rs.getDouble(1);
            }
            con.close();
            return price;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int updatePrice(int coffeeId, double newPrice) {
        try {
            con = CoffeeDBConnection.getConnection();
            String updateStr = "update coffee_inventory set price=? where coffeeId=?";
            pstmt = con.prepareStatement(updateStr);
            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, coffeeId);
            int rs = pstmt.executeUpdate();
            con.close();
            return rs;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int placeOrder(int coffeeId, int quantity) {
        try {
            con = CoffeeDBConnection.getConnection();
            String insertStr = "insert into coffee_orders values(?, ?)";
            pstmt = con.prepareStatement(insertStr);
            pstmt.setInt(1, coffeeId);
            pstmt.setInt(2, quantity);
            int rs = pstmt.executeUpdate();
            con.close();
            return rs;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public String getLog(int coffeeId) {
        try {
            String log = "";
            con = CoffeeDBConnection.getConnection();
            String selectStr = "select transaction from coffee_transactions where coffeeId=?";
            pstmt = con.prepareStatement(selectStr);
            pstmt.setInt(1, coffeeId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                log += rs.getString(1) + "\n";
            }
            con.close();
            return log;
        } catch (Exception e) {
            System.out.println(e.toString());
            return "0";
        }
    }

    public void addLog(int coffeeId, String log) {
        try {
            con = CoffeeDBConnection.getConnection();
            String insertStr = "insert into coffee_transactions values(?, ?)";
            pstmt = con.prepareStatement(insertStr);
            pstmt.setInt(1, coffeeId);
            pstmt.setString(2, log);
            pstmt.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}