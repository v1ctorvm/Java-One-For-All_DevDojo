package javaoneforall.javacore.Sformatting.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main() {
        String pattern = "'Amsterdam' yyy.MMM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
