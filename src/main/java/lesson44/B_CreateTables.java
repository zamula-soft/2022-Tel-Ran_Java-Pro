package lesson44;

import java.sql.*;

public class B_CreateTables {
    public static void main(String[] args) {
        String url="jdbc:sqlite:shop.db"; //root of the project
        try (
                Connection conn = DriverManager.getConnection(url);
                //statement - query
                // Book Martin Gruber SQL
                Statement statement = conn.createStatement();
        )
        {
            statement.execute("create table if not exists salespeople (snum int primary key not null, sname text not null, city"+
                    "text not null, comm integer not null);");
            statement.execute("create table if not exists customers (cnum int primary key not null, cname text not null, city"+
                    "text not null, rating integer not null, snum int not null);");
            statement.execute("create table if not exists orders (onum int primary key not null, amt int not null, odate text"+
                    "not null, snum int not null, cnum int not null);");
            System.out.println("Tables ok");
        }
        catch (SQLException e)
        {
            System.out.println("SQLException " + e.getMessage());

        }
    }
}
