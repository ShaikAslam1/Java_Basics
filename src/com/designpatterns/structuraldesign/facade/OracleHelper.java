package com.designpatterns.structuraldesign.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleConnection() {
        // get oracle connection using connection parameter
        System.out.println("ORACLE: get oracle connection using connection parameter");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection connection) {
        // get data and generate pdf report
        System.out.println("ORACLE: get data and generate pdf report");
    }

    public void generateOracleHtmlReport(String tableName, Connection connection) {
        // get data and generate html report
        System.out.println("ORACLE: get data and generate html report");
    }
}
