import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ch6 {
    public static void main(String[] arg) {

        //Q-1
        // float sum=0;
        // float [] ar = {2.4f,3.2f,4.8f,4.5f};
        // int len=ar.length;
        // for(int i=1;i<=len;i++)
        // {
        //     sum +=ar[i];
        // }
        // System.out.println("Sum :" + sum);

        // Q-2
        // Scanner tr = new Scanner(System.in);
        // int flag=0;
        // System.out.println("Enter number: ");
        // int n=tr.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter Elements:- ");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=tr.nextInt();
        // }    
        // System.out.println("Enter the element : ");
        // int find=tr.nextInt();
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]==find) {
        //         flag=1;
        //         break;
        //     }
        //     else {
        //         flag=0;
        //     }
        // }  
        // if(flag==1) {
        //     System.out.println("Yes, Element is present!!");
        // }
        // else {
        //     System.out.println("No, Element is not present!!");
        // }

        //Q-3
        // Scanner marks=new Scanner(System.in);
        // int sum=0;
        // int n=marks.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=marks.nextInt();
        // }
        // for(int i=0;i<n;i++)
        // {
        //     sum += a[i];
        // }
        // float avg=sum/n;
        // System.out.println("Student Avg: " + avg);

        //Q-4
        // Scanner mat= new Scanner(System.in);
        // int a[][]= new int[2][3];
        // int b[][]= new int[2][3];
        // int c[][]= new int[2][3];
        // System.out.println("Matrix-A");
        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<3;j++) {
        //         a[i][j]=mat.nextInt();
        //     }
        // }
        // System.out.println("Matrix-B");
        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<3;j++) {
        //         b[i][j]=mat.nextInt();
        //     }
        // }
        
        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<3;j++) {
        //         c[i][j]=a[i][j]+b[i][j];
        //     }
        // }
        // System.out.println("Matrix-C");
        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<3;j++) {
        //         System.out.print(c[i][j] +" ");
        //     }
        //     System.out.print("\n");
        // }

        //Q-5
        // Scanner tr = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n=tr.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter Elements:- ");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=tr.nextInt();
        // }    
        // System.out.println("Original:- ");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(a[i]);
        // }  
        // System.out.println("\n\nReverse- ");
        // for(int i=n-1;i>=0;i--)
        // {
        //     System.out.print(a[i]);
        // }  

        //Q-6
        // Scanner tr = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n=tr.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter Elements:- ");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=tr.nextInt();
        // }    
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]>a[0])
        //     {
        //         a[0]=a[i];
        //     }
        // }    
        // System.out.println("Largest number:-" + a[0]);

        //Q-7
        // Scanner tr = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n=tr.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter Elements:- ");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=tr.nextInt();
        // }    
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]<a[0])
        //     {
        //         a[0]=a[i];
        //     }
        // }    
        // System.out.println("Largest number:-" + a[0]);

        //Q-8
        // Scanner tr = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n=tr.nextInt();
        // int flag=0;
        // int a[]=new int[n];
        // System.out.println("Enter Elements:- ");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=tr.nextInt();
        // }    
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]>a[i+1])
        //     {
        //         flag=0;
        //         break;
        //     }
        //     else {
        //         flag=1;
        //     }
        // }    
        // if(flag==1)
        // {
        //     System.out.println("Yes");
        // }
        // else {
        //     System.out.println("No");   
        // }

    }
}
