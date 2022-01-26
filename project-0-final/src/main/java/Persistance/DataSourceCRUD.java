package Persistance;

import java.io.IOException;
import java.sql.SQLException;

public interface DataSourceCRUD <T>{
    //CRUD - CREATE, READ, UPDATE, DELETE
    public Integer create(T t) throws SQLException, IOException;
    public T read(Integer id) throws SQLException, IOException;
    public T update(T t) throws SQLException, IOException;
    public void delete(Integer id) throws SQLException, IOException;



}
