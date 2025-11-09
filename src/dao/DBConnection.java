/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ha
 */
public class DBConnection {
 private static final String URL = "jdbc:sqlite:C:\\sqlite\\sqlite-tools-win-x64-3510000\\students.db";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Ket noi CSDL thanh cong!");
        } catch (SQLException e) {
            System.out.println("Ket noi that bai: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }   
}
