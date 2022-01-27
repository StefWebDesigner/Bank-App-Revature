import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        //TO TEST OUT THE CONNECTION
        Connection conn = ConnectionManager.getConnection();

        ViewManager viewManager = ViewManager.getViewManager();

        viewManager.registerView(new MainInitialMenu());
        viewManager.registerView(new MainInitialLoginMenu());
        viewManager.registerView(new MainInitialCreateMenu());
        viewManager.registerView(new BankAppMenu());

                viewManager.navigator("MainInitialMenu");

        //in case I need it
//        viewManager.navigator("MainInitialLoginMenu");


//        viewManager.navigator("MainInitialCreateMenu");

//        viewManager.navigator("BankAppMenu");




        while(viewManager.isRunning()) {
            viewManager.render();
        }




    }

    }