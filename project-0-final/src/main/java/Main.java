import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        //TO TEST OUT THE CONNECTION
        Connection conn = ConnectionManager.getConnection();

    }

}
