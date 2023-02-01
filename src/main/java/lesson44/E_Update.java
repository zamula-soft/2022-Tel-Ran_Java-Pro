package lesson44;

import java.sql.*;

public class E_Update {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db"; //root of the project
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement statement = conn.createStatement();
                //result set
                ResultSet rs = statement.executeQuery("select * from salespeople;");

        )
        {
            int rowAffected = statement.executeUpdate("update salespeople set comm=comm+2;");
            while (rs.next())
            {


                int snum = rs.getInt("snum");
                String sname = rs.getString("sname");
                String city = rs.getString("citytext");
                int comm = rs.getInt("comm");

                System.out.printf("%10d|%10s|%10s|%10d\n", snum, sname, city, comm);
            }

            System.out.println("Updated ok");
        } catch (SQLException e) {
            System.out.println("SQLException " + e.getMessage());

        }
    }
}

