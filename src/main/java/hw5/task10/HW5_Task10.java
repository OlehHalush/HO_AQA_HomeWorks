package hw5.task10;

/*
Create enum for days of the week.
 Write a program which will be printing the number of a day according to day of the week.
 Example:
If today is Sunday - print 1;
If today is Monday - print 2
...
1) Use switch(day of the week) to pass the day of the week.
*/
public class HW5_Task10 {
    public static void main(String[] args) {
        printDaynumber(Days.Friday);
    }

    public static void printDaynumber(Days day) {
        switch (day) {
            case Monday:
                System.out.println("Today is Monday: day number 1");
                break;
            case Tuesday:
                System.out.println("Today is Tuesday: day number 2");
                break;
            case Wednesday:
                System.out.println("Today is Wednesday: day number 3");
                break;
            case Thursday:
                System.out.println("Today is Thursday: day number 4");
                break;
            case Friday:
                System.out.println("Today is Friday: day number 5");
                break;
            case Saturday:
                System.out.println("Today is Saturday: day number 6");
                break;
            case Sunday:
                System.out.println("Today is Sunday: day number 7");
                break;
        }
    }
}
