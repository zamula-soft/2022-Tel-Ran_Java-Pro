package lesson1HomeWork;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", getYear(), getMonth(), getDay());
    }

    public void addDay(){
        int [] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int nextMonth;

        //last day of the month
        if (getDay() == days[getMonth()-1]){
            setDay(1);
            nextMonth = (getMonth()<12) ? getMonth()+1:1;
            if (nextMonth == 1) setYear(getYear()+1);
            setMonth(nextMonth);
            }
        else {
            setDay(getDay()+1);
        }

    }

    public static void main(String[] args) {
        Date date = new Date(2020, 8, 04);
        System.out.println(date.toString());
        Date date1 = new Date(2021, 12, 31);
        date1.addDay();
        System.out.println(date1.toString());

    }
}


