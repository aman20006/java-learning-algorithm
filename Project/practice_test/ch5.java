import java.util.Scanner;

public class ch5 {
    public static void main(String[] arg) {
        
        // //Q-1
        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter number of rows: ");
        // int a = num.nextInt();
        // for(int i=a;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("x");
        //     }
        //     System.out.print("\n");
        // }

        // //Q-2
        // Scanner till = new Scanner(System.in);
        // int sum=0;
        // System.out.println("Enter the number: ");
        // int til=till.nextInt();
        // for(int i=0;i<=til;i++)
        // {
        //     sum+=i;
        // }
        // System.out.println("Sum of the number: " + sum);

        //Q-3
        // Scanner tab = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int tabl=tab.nextInt();
        // System.out.println("Table");
        // for(int i=1;i<=10;i++)
        // {
        // System.out.println(tabl + " x " + i + " = " + tabl*i); 
        // }

        //Q-4
        // Scanner tab = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int tabl=tab.nextInt();
        // System.out.println("Table");
        // for(int i=10;i>=1;i--)
        // {
        // System.out.println(tabl + " x " + i + " = " + tabl*i); 
        // }

        // Q-5
        // Scanner fac = new Scanner(System.in);
        // int total=1;
        // System.out.println("Enter the number: ");
        // int fact=fac.nextInt();
        // System.out.println("Table");
        // for(int i=1;i<=fact;i++)
        // {
        //     total=total*i; 
        // }
        // System.out.println("Factorial of " + fact + " :" + total); 
        
        //Q-9
        Scanner tab = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number: ");
        int tabl=tab.nextInt();
        System.out.println("Table");
        for(int i=1;i<=10;i++)
        {
            int temp = tabl*i;
            sum += temp; 
        }
        System.out.println("Sum:" + sum); 
    }
}
