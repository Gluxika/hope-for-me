package com.example.JavaServer;

import java.sql.*;

public class DbConnect {

    static final String dbUrl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11590842";
    static final String username = "sql11590842";
    static final String password = "9Gj4Efq4Ti";
    static Connection dbConnection;
    static Statement dbStatement;

    public static ResultSet sendQuery(String query) throws SQLException {

        if ( DbConnect.dbConnection == null || DbConnect.dbStatement == null ) {
            DbConnect.dbConnection = DriverManager.getConnection(DbConnect.dbUrl, DbConnect.username, DbConnect.password);

            DbConnect.dbStatement = dbConnection.createStatement();
        }

        return DbConnect.dbStatement.executeQuery(query);
    }

}
