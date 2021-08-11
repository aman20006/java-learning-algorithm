import java.util.Scanner;

public class Java_excercise1 {
    public static void main(String[] arg) {
        System.out.println("This is a program to calculate %");
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        int total=marks.nextInt();
        int tot=total*5;
        System.out.print("Enter Marks of Subject 1: ");
        int s1=marks.nextInt();
        System.out.print("Enter Marks of Subject 2: ");
        int s2=marks.nextInt();
        System.out.print("Enter Marks of Subject 3: ");
        int s3=marks.nextInt();
        System.out.print("Enter Marks of Subject 4: ");
        int s4=marks.nextInt();
        System.out.print("Enter Marks of Subject 5: ");
        int s5=marks.nextInt();

        int sum=s1+s2+s3+s4+s5;
        int prcntge=(sum*100)/tot;

        System.out.print("Percentage = ");
        System.out.print(prcntge);
        System.out.print(" %");


    }
}
