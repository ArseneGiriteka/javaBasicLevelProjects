import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class FormaTest{
    public static void main(String[] args) {
        DateFormat myDate = new DateFormat();
        System.out.println(String.format("%,d",30000)+"\n");
        myDate.show();
    }
}

class DateFormat{
    private String s = "for %tc = "+String.format("%tc",new Date())+"\n for tr = "+String.format("%tr",new Date())
                        +"\n for td(day) = "+String.format("%td",new Date())+"\n day of the week(tA) = "
                        +String.format("%tA",new Date())+"\n month(tB)"+String.format("%tB",new Date())+"\n";

    public void show(){
        System.out.println(s);
        Calendar cal = Calendar.getInstance();
        cal.set(2022,0,5,22,30);
        long dayL = cal.getTimeInMillis();
        dayL += 900*60*60;
        cal.setTimeInMillis(dayL);
        System.out.println("new hour "+cal.get(cal.HOUR_OF_DAY));
        cal.add(Cal.DATE,35);
        System.out.println("Add 35 dys = "+cal.getTime());
        cal.
    }
}