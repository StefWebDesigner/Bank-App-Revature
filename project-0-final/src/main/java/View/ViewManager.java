package View;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ViewManager {
    private static ViewManager viewManager; //A STATIC CLASS
    private final Scanner scanner; //?????
    List<View> viewList; //?? THIS A CLASS i THINK BUT WHY IS IT A TYPE SPOT
    View nextView;
    private boolean running;

    private ViewManager() {
        //SETTING UP THE VALUES AND REFERENCES
        running = true;
        scanner = new Scanner(System.in);
        viewList = new LinkedList<>();
    }

    public static ViewManager getViewManager() { //??for all static methods, is it required to add the class?
        if (viewManager == null) {
            viewManager = new ViewManager(); //IF ITS NOT WORKING, RESET IT AND GET THAT THING WORKING MAN!
        }
        return viewManager;

    }

    public void navigator(String destination) {
        for (View view : viewList) {
            if (view.viewName.equals(destination)) { //VARIABLES COME FROM AN ABRACT CLASS
                nextView = view;
            }

        }
    }


    public void registerView(View view) {
        viewList.add(view);
    }

    public void render() throws SQLException, IOException {
        nextView.renderView();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void quit() {
        running = false;
    }


    public boolean isRunning() {
        return running;
    }

}


