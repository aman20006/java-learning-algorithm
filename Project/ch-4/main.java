import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        public static void main(String[] args) {
            Scanner year= new Scanner(System.in);
        System.out.println("Welcome to Leap Year Finder");
        System.out.println("Enter the Year: ");
        int yr=year.nextInt();
        if(yr%4 == 0) {
            if(yr%100 == 0) {
                if (yr % 400 == 0)
                System.out.format("%d Is leap year..",yr);
                else
                System.out.format("%d Is not leap year..",yr);
            }
            System.out.format("%d Is leap year..",yr);
        }
        else  {
            System.out.format("%d Is not leap year..",yr);
        }
        }      
    }
}
