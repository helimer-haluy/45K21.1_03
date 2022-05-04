/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.account;
import entity.empAccount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class employeeAccountDAO {

    public static List<empAccount> emp = new ArrayList<>();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public empAccount EmpLogin(String user, String pass) {
        String query = "select * from EmpAccount \n"
                + "where [username] = ?\n"
                + "and [password]=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public empAccount getUserByUsername(String username) {

        String query = "select * from [dbo].[EmpAccount] where username=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public empAccount checkAccountExist(String user) {
        String query = "select * from EmpAccount \n"
                + "where [username] = ?\n";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public empAccount checkEmailExist(String email) {
        String query = "select * from EmpAccount \n"
                + "where [email] = ?\n";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void Register(String name, String username, String email, String phonenumber, String password, String district, String city, String icard, String license, String des, String ficard, String bicard) {
        String query = "insert into EmpAccount\n"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,0)";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, phonenumber);
            ps.setString(5, password);
            ps.setString(6, city);
            ps.setString(7, district);
            ps.setString(8, icard);
            ps.setString(9, license);
            ps.setString(10, des);
            ps.setString(11, ficard);
            ps.setString(12, bicard);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<empAccount> getAllAccount() {
        List<empAccount> list = new ArrayList<>();
        String query = "Select * from EmpAccount";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public empAccount getUserByEmail(String email) {

        String query = "select * from [dbo].[EmpAccount] where email=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void resetPasswordByEmail(String email, String password) {
        String query = "UPDATE EmpAccount SET password=? where email=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void resetPasswordByUsername(String username, String password) {
        String query = "UPDATE EmpAccount SET password=? where username=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<empAccount> getAllEmployees() {
        List<empAccount> list = new ArrayList<>();
        String query = "Select * from EmpAccount";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new empAccount(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13), 
                        rs.getString(14)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public static void main(String[] args) {
        employeeAccountDAO cdao = new employeeAccountDAO();
        List<empAccount> e = cdao.getAllEmployees();
        System.out.println(e);
    }

}
