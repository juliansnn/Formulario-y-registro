package co.edu.sena.demo_project.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL=
            "jdbc:mysql://127.0.0.1:3306/?user=root";
    private static final String USER = "Z4_user";
    private static final String PASS = "Z4_password";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance()throws SQLException{
        if (pool==null){
            pool=new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }
    public static Connection getConnection()throws SQLException{
        return getInstance().getConnection();
    }
}
