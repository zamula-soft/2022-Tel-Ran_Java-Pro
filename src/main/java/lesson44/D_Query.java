package lesson44;

import java.sql.*;

public class D_Query {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db"; //root of the project
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement statement = conn.createStatement();
                //result set
                ResultSet rs = statement.executeQuery("select * from salespeople;");
                //compiled query with parametrs
                PreparedStatement ps = conn.prepareStatement("select * from salespeople where comm > ?");

            )
        {
            while (rs.next())
            {
                int snum = rs.getInt("snum");
                String sname = rs.getString("sname");
                String city = rs.getString("citytext");
                int comm = rs.getInt("comm");

                System.out.printf("%10d|%10s|%10s|%10d\n", snum, sname, city, comm);
            }

            ps.setInt(1, 12);
            ResultSet rs1 = ps.executeQuery();
            System.out.println("------------------");
            while (rs1.next())
            {
                int snum = rs1.getInt("snum");
                String sname = rs1.getString("sname");
                String city = rs1.getString("citytext");
                int comm = rs1.getInt("comm");


                System.out.printf("%10d|%10s|%10s|%10d\n", snum, sname, city, comm);
            }

            System.out.println("Query ok");
        } catch (SQLException e) {
            System.out.println("SQLException " + e.getMessage());

        }
    }
}
