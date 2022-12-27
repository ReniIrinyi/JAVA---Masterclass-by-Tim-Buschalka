public class LeapYearCalculator {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1800);
        isLeapYear(1924);
    }

    public static boolean isLeapYear(int year){
        boolean leap=false;
        if(year >= 1 && year <= 9999 ) {
            if (year % 4 == 0 && year % 100 != 0) {
                leap = true;
            } else if(year % 400 == 0){
                leap=true;
            }

        }
        //System.out.println(leap);
        return leap;
    };
}
