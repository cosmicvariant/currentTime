import java.text.SimpleDateFormat;
import java.util.Date;

public class currentTime {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE"); //EEEE for the full DAY format
        System.out.println(dayFormat.format(currentDate));

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss:SS a"); //SS milliseconds
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("k:mm "); // you can use k for 24-hour format
        System.out.println(clockFormat.format(currentDate));


    }
}
