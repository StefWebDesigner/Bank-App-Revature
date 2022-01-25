package Utils;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    public static Connection connection;

    private ConnectionManager() {  //don't want anyone copying the object

    }

    public static Connection getConnection() throws IOException, SQLException {
        if(connection == null) { //if it is null --- reconnect that connection
            connection = connect();
        }
            return connection;
    }

    private static Connection connect() throws IOException, SQLException {
        Properties props = new Properties(); //going to get the information
        FileReader fr = new FileReader("src/main/resources/jdbc.properties"); //it will read the file
        props.load(fr); //IT WILL LOAD THE FILE
        //THE HARDCORE STRING METHOD TO DO THIS >>> BETTER TO BREAK IT UP

        //this is the connection string retrieved from the props folder
       String connectionString = "jdbc:mariadb://" +
                props.getProperty("hostname") + ":" +
                props.getProperty("port") + "/" +
                props.getProperty("dbname") + "?user=" +
                props.getProperty("username") + "&password=" +
                props.getProperty("password");

       //The DriverManager is in charge of calling the method to connect to the database
       connection = DriverManager.getConnection(connectionString);
       return connection;
    }
}
