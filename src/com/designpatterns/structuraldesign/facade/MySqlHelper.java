package com.designpatterns.structuraldesign.facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlConnection() {
        // get mySql connection using connection parameter
        System.out.println("MYSQL: get mySql connection using connection parameter");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection connection) {
        // get data and generate pdf report
        System.out.println("MYSQL: get data and generate pdf report");
    }

    public void generateMySqlHtmlReport(String tableName, Connection connection) {
        // get data and generate html report
        System.out.println("MYSQL: get data and generate html report");
    }
}
