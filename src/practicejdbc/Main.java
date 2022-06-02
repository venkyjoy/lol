package practicejdbc;

import java.sql.*;
public class Main {
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lol","root","Venky@123");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("INSERT INTO marks(name, JAVA, SPRING, JDBC, TOTALMARKS) VALUES ('g',40,50,60)");
        while(rs.next())
        System.out.println(rs.getInt(3));
        con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}



