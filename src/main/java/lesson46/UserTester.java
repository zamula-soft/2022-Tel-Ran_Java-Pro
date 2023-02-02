package lesson46;

import java.sql.*;

public class UserTester {

    private static final String URL = "jdbc:sqlite:shop.db"; //root of the project
    private static final String[] columns = {"id"}; //autoincrement
    private static final String insert = "insert into user (first, last, age) values(?, ?, ?);";
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(URL);
                PreparedStatement insertStatement = conn.prepareStatement(insert, columns); //to increment
                )
        {
            insertStatement.setString(1,"Max");
            insertStatement.setString(2, "Kotkov");
            insertStatement.setInt(3, 33);
            int affectedRows = insertStatement.executeUpdate();
            System.out.println("rows " + affectedRows);
            if (affectedRows > 0)
            {
                try (ResultSet rs = insertStatement.getGeneratedKeys();)
                {
                    if (rs.next())
                    {
                        long id = rs.getLong(1);
                        System.out.println("id" + id);
                    }

                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
