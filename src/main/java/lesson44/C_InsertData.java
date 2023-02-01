package lesson44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class C_InsertData {
    public static void main(String[] args) {
        String url="jdbc:sqlite:shop.db"; //root of the project
        try (
                Connection conn = DriverManager.getConnection(url);
                //statement - query
                // Book Martin Gruber SQL
                Statement statement = conn.createStatement();
        )
        {
            statement.execute("insert into salespeople values (1001, 'Peel', 'London', 12);");
            statement.execute("insert into salespeople values (1002, 'Serres', 'San Jose', 13);");
            statement.execute("insert into salespeople values (1003, 'Motika', 'London', 11);");
            statement.execute("insert into salespeople values (1004, 'Rifkin', 'Barcelona', 15);");
            statement.execute("insert into salespeople values (1005, 'Axelrod', 'New York', 10);");

            statement.execute("insert into customers values (2001, 'Hofman', 'London', 100, 1001);");
            statement.execute("insert into customers values (2002, 'Giovanni', 'Rome', 200, 1003);");
            statement.execute("insert into customers values (2003, 'Liu', 'San Jose', 200, 1002);");
            statement.execute("insert into customers values (2004, 'Grass', 'Berlin', 300, 1002);");
            statement.execute("insert into customers values (2006, 'Clements', 'London', 100, 1001);");
            statement.execute("insert into customers values (2008, 'Gisner', 'San Jose', 300, 1007);");
            statement.execute("insert into customers values (2007, 'Peri', 'Rome', 100, 1004);");

            statement.execute("insert into orders values (3001, 1869, '1990-10-03', 2008, 1007);");
            statement.execute("insert into orders values (3003, 7671, '1990-10-03', 2001, 1001);");
            statement.execute("insert into orders values (3002, 1900, '1990-10-03', 2007, 1004);");
            statement.execute("insert into orders values (3005, 5160, '1990-10-03', 2003, 1002);");
            statement.execute("insert into orders values (3006, 1098, '1990-10-03', 2008, 1007);");
            statement.execute("insert into orders values (3009, 1713, '1990-10-04', 2002, 1003);");
            statement.execute("insert into orders values (3007, 7575, '1990-10-04', 2004, 1002);");
            statement.execute("insert into orders values (3008, 4723, '1990-10-05', 2006, 1001);");
            statement.execute("insert into orders values (3010, 1309, '1990-10-06', 2004, 1002);");
            statement.execute("insert into orders values (3011, 9891, '1990-10-07', 2002, 1001);");



            System.out.println("Insert ok");
        }
        catch (SQLException e)
        {
            System.out.println("SQLException " + e.getMessage());

        }
    }
}
