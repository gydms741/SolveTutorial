package study.day14_Scope;
/*
Scope = Lifetime & Accessibility of a variable
Package = A group of similar classes
We import packages to get access to classes, methods, properties, etc.

Types of packages
1. user - defined packages : packages you create or find on the internet.
2. built-in packages : I don't have to download or make anything new to use it.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
