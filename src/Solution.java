
import java.time.LocalDate;
public class Solution {
    //Using Java.time.LocalDate package
    public static String findDay(int day,int month,int year){
        int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);
        int y = Integer.valueOf(year);
        LocalDate date=  LocalDate.of(y,m,d);
        return date.getDayOfWeek().toString();



    }
    public static void main(String[] args) {


        String day = findDay(17,02,2002);
        System.out.println(day);
        ZellersAlgorithm weekday = new ZellersAlgorithm(13,7,2022);


    }
}

//Using ZellersAlgorithm
class ZellersAlgorithm{
    int date;
    int month;
    int year;
    ZellersAlgorithm(int date,int month,int year){
        String week =findDay(date,month,year);
        System.out.println(week);

    }
    public static String findDay(int date, int month, int year){
        int d=date;
        if(month>2){
            month=month;
        }
        else {
            month=12+month;
            year = year-1;

        }
        int y =year%100;
        int c =year/100;
        int m =month;
        String[] weekdays = {"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
        int w = d + ((13*(m+1))/5) + y + (y/4) + (c/4) + 5*c;
        w=w%7;
        return weekdays[w];


    }

}
