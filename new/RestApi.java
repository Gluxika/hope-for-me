package com.example.JavaServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class RestApi {

    @GetMapping("/server-test")
    public String serverTest() {
        return "Server is running!";
    }

    @GetMapping("/get-categories")
    public String getCategories() {
        String strCategories = "";

        try {
            ResultSet queryResult = DbConnect.sendQuery("SELECT * FROM `categories`");
            strCategories += DbUtil.getStringFromResultSet(queryResult);
        }
        catch (SQLException e) {
            // throw new RuntimeException(e);
        }
        return strCategories;
    }

    @GetMapping("/get-houses")
    public String getHouses() {
        String strCategories = "";

        try {
            ResultSet queryResult = DbConnect.sendQuery("SELECT * FROM `realestates` WHERE categoryId = 1");
            strCategories += DbUtil.getStringFromResultSet(queryResult);
        }
        catch (SQLException e) {
            // throw new RuntimeException(e);
            strCategories = "Operation failed...";
        }
        return strCategories;
    }

}
