import java.util.Scanner;

public class while1 {
    public static void main(String[] arg) {
        int a=100;
        int ab=100;

       //while loop
        while(a<=200)
        {
            System.out.println(a);
            a++;
        }

        //do-while loop
        do{
            System.out.println(ab);
            ab++;
        }while(ab<=200); 

        //for loop
        for(int g=200;g>=100;g--)
        {
            System.out.println(g);
        }
    }
}
