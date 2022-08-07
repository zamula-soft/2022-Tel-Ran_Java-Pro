package lesson1.lesson1HomeWork;

public class Date {
    private int year, month, day;
    int [] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        if (!checkDate())
            System.out.println(this + " Illegal date!");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
        if (!checkDate())
            System.out.println(this + " Illegal date!");

    }

    public void setMonth(int month) {
        this.month = month;
        if (!checkDate())
            System.out.println(this + " Illegal date!");
    }

    public void setDay(int day) {
        this.day = day;
    }

    private boolean isLeapYear(){
        if (getYear() % 400 == 0)
            return true;
        if (getYear() % 4 == 0 && getYear() % 100 != 0)
            return true;
        return false;
    }

    private boolean checkDate()
    {

        if (month > 12 || month <1)
            return false;
        if (getMonth() == 2 && day == 29 && isLeapYear())
            return true;
        if (day > days[getMonth()-1])
            return  false;
        if (day <0 || day > 31 | year <= 0)
            return   false;
        return true;


    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", getYear(), getMonth(), getDay());
    }

    public void addDay(){

//        int nextMonth;
//        if (getDay() == days[getMonth()-1]){
//            setDay(1);
//            nextMonth = (getMonth()<12) ? getMonth()+1:1;
//            if (nextMonth == 1) setYear(getYear()+1);
//            setMonth(nextMonth);
//            }
//        else {
//            setDay(getDay()+1);  }

        Date d1 = new Date(year, month, day+1);
        if (!d1.checkDate()){
            day =1;
            if (month == 12){
                year++;
                month = 1;
            }
            else
                month++;
                day=1;
        }
        else day++;

    }

    public static void main(String[] args) {
        Date date = new Date(2020, 8, 04);
        System.out.println(date);
        Date date1 = new Date(2021, 12, 31);
        date1.addDay();
        System.out.println(date1);
        Date date2 = new Date(2021, 13, 31);
        Date date3 = new Date(2021, 02, 31);

        Date date4 = new Date(2000, 02, 28);
        date4.addDay();
        System.out.println(date4);
        date4.addDay();
        System.out.println(date4);

    }
}


