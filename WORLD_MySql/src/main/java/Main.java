import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String sqlSelectAllPersons = "SELECT * FROM city";
        String connectionUrl = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";

        try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "");
             PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
               // long id = rs.getLong("ID");
                String name = rs.getString("NAME");
                String countryCode = rs.getString("COUNTRYCODE");
                String district= rs.getString("DISTRICT");
                int population = rs.getInt("POPULATION");
                // do something with the extracted data...
                System.out.println( countryCode + " " + name + " " + district + " " + population );
            }
        } catch (SQLException e) {
            // handle the exception
            System.out.println(e);
        }
    }
}
