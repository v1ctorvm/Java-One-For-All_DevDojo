package javaoneforall.javacore.Kenum.domain;

public enum CustomerType {
    COMPANY(1,"Company"),
    INDIVIDUAL(2,"Individual");

    public final int DB_VALUE;
    public final String REPORT_VALUE;

    CustomerType(int dbValue, String reportValue){
        this.DB_VALUE = dbValue;
        this.REPORT_VALUE = reportValue;
    }
}
