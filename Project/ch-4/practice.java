import java.util.Scanner;

import jdk.jshell.spi.SPIResolutionException;

public class practice {
    public static void main(String[] arg) {

        //Q-2
        Scanner marks= new Scanner(System.in);
        System.out.println("x-x-x-x-x-xWelcome to student result portalx-x-x-x");
        System.out.println("Enter marks of Subject 1: ");
        int a=marks.nextInt();
        System.out.println("Enter marks of Subject 2: ");
        int b=marks.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int c=marks.nextInt();
        System.out.println("Enter marks of Subject 4: ");
        int d=marks.nextInt();
        float avg=(a+b+c+d)/4.2f;
        if(avg>=40 && a>=33 && b>=33 && c>=33 && d>=33) {
            System.out.println("Party kaha hai!!!!");
        }
        else {
            System.out.println("Sorry Buddy!!!");
        }

        //Q-3
        Scanner tax= new Scanner(System.in);
        System.out.println("Welcome to tax calculator");
        System.out.println("Enter the amount: ");
        long sal=tax.nextInt();
        if(sal < 250000) {
            System.out.println("No Tax");
        }

        else if(sal>=250000 && sal<=500000) {
            int ta=sal/20;
            System.out.println("Tax:");
            System.out.println(ta);
        }

        else if(sal>=250000 && sal<=500000) {
            int ta=(sal*20)/100;
            System.out.println("Tax:");
            System.out.println(ta);
        }

        else if(sal<=100000) {
            int ta=(sal*30)/100;
            System.out.println("Tax:");
            System.out.println(ta);
        }

        else {
            System.out.println("Thik se daal nah!!!");
        }

        //Q-4
        Scanner days= new Scanner(System.in);
        System.out.println("Welcome to Day Finder");
        System.out.println("Enter the NUmber: ");
        int din=day.nextInt();
        if(din==1) {
            System.out.println("Monday");
        }
        else if(din==2) {
            System.out.println("Tuesday");
        }
        else if(din==3) {
            System.out.println("Wednesday");
        }
        else if(din==4) {
            System.out.println("Thursday");
        }
        else if(din==5) {
            System.out.println("Friday");
        }
        else if(din==6) {
            System.out.println("Saturday");
        }
        else if(din==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Thik se daal naah!!!");
        }

        //Q-5
        Scanner year= new Scanner(System.in);
        System.out.println("Welcome to Leap Year Finder");
        System.out.println("Enter the Year: ");
        int yr=year.nextInt();
        if(yr%4 == 0) {
            if(yr%100 == 0) {
                if (yr % 400 == 0)
                System.out.println("%d Is leap year..",yr);
                else
                System.out.println("%d Is not leap year..",yr);
            }
            System.out.println("%d Is leap year..",yr);
        }
        else  {
            System.out.println("%d Is not leap year..",yr);
        }      

        Question 6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
    }
}
