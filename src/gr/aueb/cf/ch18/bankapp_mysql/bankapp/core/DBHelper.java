package gr.aueb.cf.ch18.bankapp_mysql.bankapp.core;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBHelper {
    private static final HikariDataSource datasource;

    static {
        HikariConfig config = new HikariConfig();

        // Config DB
        config.setJdbcUrl("jdbc:mysql://localhost:3306/bankdbdev" +
                "?sslMode=preferred&serverTimeZone=UTC&allowPublicKeyRetrieval=true");
        config.setUsername("bankuser10");
        config.setPassword("C0d1ngF@");

        datasource = new HikariDataSource(config);
    }

    private DBHelper() {}

    public static Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }
}
