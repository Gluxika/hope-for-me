package com.example.JavaServer;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbUtil {

    public static String getStringFromResultSet(ResultSet queryResult) throws SQLException {
        String strCategories = "";

        ResultSetMetaData metaData = queryResult.getMetaData();
        int columnNum = metaData.getColumnCount();

        for (int i = 1; i <= columnNum; i++) {
            strCategories += metaData.getColumnName(i) + "; ";
        }

        strCategories += "<br>";

        while (queryResult.next()) {

            for (int i = 1; i <= columnNum; i++) {
                strCategories += queryResult.getString(i) + "; ";
            }

            strCategories += "<br>";
        }

        return strCategories;
    }

}
