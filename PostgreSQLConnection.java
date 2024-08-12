package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreSQLConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/MagazaYonetim";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Bağlantı başarılı!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver bulunamadı.");
            // e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Bağlantı kurulamadı.");
            //e.printStackTrace();
        }
        return connection;
    }


 /*  public void insertcode(
            String name,
            String lastname,String email,
            String adres) {
        Connection connection = getConnection();
        if (connection != null) {
            String insertSQL = "INSERT INTO musteri ( name , lastname ,email, adres) VALUES (?,?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lastname);
                preparedStatement.setString(3,email);
                preparedStatement.setString(4, adres);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " satır eklendi.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Veri eklenirken hata oluştu.");
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }
        }
    }

    public void deletecode(String name, String lastName,String email ,String address,int id) {
        Connection connection = getConnection();
        if (connection != null) {
            String deleteSQL = " INSERT INTO musteri ( name , lastname ,email , adres) VALUES (?,?,?,?)";
            try (PreparedStatement ps = connection.prepareStatement(deleteSQL)) {
                ps.setString(1, name);
                ps.setString(2, lastName);
                ps.setString(3,email);
                ps.setString(4, address);
                int rowsAffected = ps.executeUpdate();
                System.out.println("Satır silindi");
            } catch (SQLException e) {
                System.out.println("Veri eklenirken hata oluştu.");
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }


        }

    }

}




