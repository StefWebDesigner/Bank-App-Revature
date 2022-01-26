import java.io.IOException;
import java.sql.SQLException;

public abstract class View {

    protected String viewName;
    protected ViewManager viewManager;

    public String getViewName() { //AN ALREADY PREMADE METHOD
        return viewName;
    }

    public abstract void renderView() throws SQLException, IOException;

}
