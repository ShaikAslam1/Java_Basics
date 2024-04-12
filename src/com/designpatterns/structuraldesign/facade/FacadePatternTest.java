package com.designpatterns.structuraldesign.facade;

import java.sql.Connection;

public class FacadePatternTest {
    /*
    The facade pattern is used to help client applications easily interact with the system.
     */
    public static void main(String[] args) {
        String tableName = "Employee";

        // generating MySql HTML report and Oracle PDF report without using Facade
        Connection connection = MySqlHelper.getMySqlConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHtmlReport(tableName, connection);

        Connection con1 = OracleHelper.getOracleConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        // generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
