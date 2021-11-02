package connectex;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){

        String databaseName = "microchip";
        String databaseUser = "root";
        String databasePass = "90090080zZ.";
        String url = "jdbc:mysql://localhost/" +databaseName;


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePass);

        }catch (Exception e){
            e.printStackTrace();
        }

        return databaseLink;

    }
}
