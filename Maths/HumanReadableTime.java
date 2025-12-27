package Maths;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int sec;
        int mins;
        int hrs;
        String s = "00";
        String m = "00";
        String h = "00";
        sec = seconds % 60;
        mins = seconds / 60;
        hrs = mins/60;
        mins = mins % 60;
        
        if(sec < 10){
            s = "0"+sec;
        }
        else{
            s = String.valueOf(sec);
        }
        if(mins < 10){
            m = "0"+mins;
        }
        else{
            m = String.valueOf(mins);
        }
        if(hrs < 10){
            h = "0"+hrs;
        }
        else{
            h = String.valueOf(hrs);
        }

        String time = ""+h+":"+m+":"+s;
        return time;
  }

  public static void main(String[] args) {
    System.out.println(makeReadable(60));
  }
}
