import Utils.ConnectionManager;
import View.*;

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
        viewManager.registerView(new BankAppMainMenu());
        viewManager.registerView(new DepositCheckingMenu());
        viewManager.registerView(new DepositSavingMenu());
        viewManager.registerView(new WithdrawCheckingMenu());
        viewManager.registerView(new WithdrawSavingMenu());
        viewManager.registerView(new CheckBalanceMenu());


        viewManager.navigator("menu.MainInitialMenu");

        //in case I need it
//        viewManager.navigator("menu.MainInitialLoginMenu");


//        viewManager.navigator("menu.MainInitialCreateMenu");

//        viewManager.navigator("BankAppMenu");


        while (viewManager.isRunning()) {
            viewManager.render();
        }


    }

}