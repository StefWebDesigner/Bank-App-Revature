package Persistance;

import java.sql.SQLException;

public interface DataSourceCRUD {
    //CRUD - CREATE, READ, UPDATE, DELETE
    public T create(T t) throws SQLException;
    public T read(Integer id) throws SQLException;
    public T update(T t) throws SQLException;
    public void delete(Integer id) throws SQLException;



}
