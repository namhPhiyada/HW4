

final class Time2{
 private int hour;
 private int minute;
 private int second;
 
 public Time2(){
     this(0,0,0);
 }
 public Time2 (int hour){
     this(hour,0,0);
 }
 public Time2(int hour , int minute ){
     this(hour,minute,0);
     
 }
 public Time2(int hour , int minute ,int second ){
      setTime(hour,minute,second);
 }
 public Time2(Time2 time){
     this(time.getHour(),time.getMinute(),time.getSecond());
 }
 public int getHour(){
     return hour;
 }
  public int getMinute(){
      return minute;
  } 
  public int getSecond(){
      return second;
  }
 public void setHour(int hour){
     this.hour= ( (hour >= 0 && hour < 24) ? hour:0) ;
 }
 public void setMinute(int minute){
     this.minute = ((minute >= 0 && minute < 60) ? minute:0) ;
 }
 public void setSecond(int second){
     this.second = ((second >= 0 &&second < 60) ? second:0);
 }
 public void setTime(int hour , int minute ,int second){
     setHour(hour);
     setMinute(minute);
     setSecond(second);

 }
 
 @Override
 public String toString(){
     String toString = String.format("%02d:%02d :%02d ", hour,minute,second);
     
 return toString;
 }
 public String toUniversalString(){
    String toUniversalString =String.format("%02d : %02d : %02d ", hour,minute,second);
 return toUniversalString;
 }

    }
 
public class Time2Test {
    public static void main(String[] args) {
      Time2 t1 = new Time2();
      Time2 t2 = new Time2(2);
      Time2 t3 = new Time2(21,34);
      Time2 t4 = new Time2(12,25,42);
      Time2 t5 = new Time2(27,74,99);
       Time2 t6= new Time2(t4);
       Time2 t7 = new Time2(12,30); 
       Time2 t8 = new Time2(30,8,6);
        System.out.println(t1.toUniversalString());
        System.out.println(t2.toUniversalString());
        System.out.println(t3.toUniversalString());
        System.out.println(t4.toUniversalString());
        System.out.println(t5.toUniversalString());
        System.out.println(t6.toUniversalString());
        System.out.println(t7.toUniversalString());
         System.out.println(t8.toUniversalString());
    }
}
