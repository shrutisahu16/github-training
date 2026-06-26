import java.util.Scanner;

class Emp{
    String name;
    int age;
    void getDetails() throws AgeException
    {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        if(age<16)
        {
            throw new AgeException(age);
        }
    }
}


class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Emp emp = new Emp();
            emp.getDetails();

        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}