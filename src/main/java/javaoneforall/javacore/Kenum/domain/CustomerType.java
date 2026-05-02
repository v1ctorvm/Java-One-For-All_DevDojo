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

    public static CustomerType getByReportValue(String reportValue){
        for (CustomerType customerType : values()) {
            if (customerType.REPORT_VALUE.equals(reportValue)){
                return customerType;
            }
        }
        return null;
    }
}
