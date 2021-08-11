import java.util.Scanner;

public class Practice {
    public static void main(String[] arg) {
        
        //Q-1

        //float a=7/4*9/2;
        //7/36/2

        //Q-2

        Scanner mar = new Scanner(System.in);
        int a=mar.nextInt();
        int b=mar.nextInt();
        int c=mar.nextInt();
        int total=(a+b+c);
        int nono=total+8;
        System.out.print("Encrypted:");
        System.out.println(nono);
        System.out.print("Decrypted:");
        System.out.println(total);

        //Q-3
        Scanner nu= new Scanner(System.in);
        int num1=nu.nextInt();
        int num2=nu.nextInt();
        if(num1>num2)
        {
          System.out.print("Larger Number: ");
            System.out.println(num1);
        }
        else if (num1==num2) {
          System.out.println("Both number are equal");
        }
        else {
            System.out.print("Larger Number: ");
            System.out.print(num2);
        }

        //Q-4

        Scanner vm = new Scanner(System.in);
        System.out.println("Enter value of v: ");
        int v = vm.nextInt();
        System.out.println("Enter value of u: ");
        int u = vm.nextInt();
        System.out.println("Enter value of a: ");
        int a = vm.nextInt();
        System.out.println("Enter value of s: ");
        int s = vm.nextInt();
        System.out.println("The equation :- ");
        System.out.println("(v*2-u*2)/2as");
        float ans=((v*v)-(u*u))/(2.0f*a*s);
        System.out.println("The answer is:");
        System.out.println(ans);

        

    }

}
