package lesson45;

import java.sql.*;
import java.util.List;

//Data Access Object
public class SalesDao {
    private Connection conn;
    private static final String insert = "insert int salespeople values(?, ?, ?, ?);";
    private PreparedStatement insertStatement;
    private static final String URL = "jdbc:sqlite:shop.db"; //root of the project
    public SalesDao() throws SQLException {
                Connection conn = DriverManager.getConnection(URL);
                insertStatement = conn.prepareStatement(insert);
         }

    public Sales save(Sales sales) throws SQLException {
        insertStatement.setInt(1, sales.getId());
        insertStatement.setString(2, sales.getName());
        insertStatement.setString(3, sales.getCity());
        insertStatement.setInt(4, sales.getCommission());
        return sales;
    }

    public Sales delete(Sales sales){
        return null;
    }

    public List<Sales> getAll()
    {
        return null;
    }

    public List<Sales> getAllInCity(String city){
        return null;
    }
}
