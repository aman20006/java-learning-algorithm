// Q-1
class Employee {
    int salary;
    string name;
    public void getsalary() {
        System.out.println("Salary :" + salary);
    }
    public void getname() {
        System.out.println("Name :" + name);
    }
    public int setname() {
        name = n;
    }
}

// Q-2
class cellphone {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }  
}
    
//Q-3
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

//Q-4
class Rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}

//Q-5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

// Q-6
class Circle{
    int radius;
    int pi=3.14;
    public int area(){
        return pi*radius*radius;
    }
    public int perimeter(){.
        return 2*pi*radius;
    }
}

public class ch8 {
    public static void main(String[] args) {
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();


        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();


    }
}