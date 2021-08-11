import java.util.Scanner;

public class rps {
    public static void main(String[] arg) {
        Scanner number= new Scanner(System.in);
        System.out.println("Welcome To rock paper scissor game...");
        System.out.println("Option Available \n 1)Scissors \n 2)Rock \n 3)Paper \n\n Enter your option:");
        int user = number.nextInt();
        double ram=Math.random() * (4 - 1)+1;
        int con=(int)ram;
        System.out.println(con);
        if(user==con) {
            System.out.println("Draw.....");
        }
        else if(user==1 && con==3) {
            System.out.println("User Won!!");
        }

        else if(user==2 && con==1) {
            System.out.println("User Won!!");
        }

        else if(user==3 && con==1) {
            System.out.println("User Won!!");
        }
        else {
            System.out.println("Computer Won!!");
        }
      }
}