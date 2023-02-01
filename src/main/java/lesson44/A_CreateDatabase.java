package lesson44;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_CreateDatabase {
    public static void main(String[] args) {
        // all data in db in url
        // https://www.ru
        // tel:123
        // jdbc:sqlite:/path/to/store.db
        String url="jdbc:sqlite:shop.db"; //root of the project
        try (
        Connection conn = DriverManager.getConnection(url);
        )
        {
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Driver "+meta.getDriverName());
            System.out.println("DB created");
        }
        catch (SQLException e)
        {
            System.out.println("SQLException " + e.getMessage());

        }
    }
}
