import java.util.Scanner;

//exception handling
class AgeException extends Exception {
    int age;

    AgeException(int age) {
        this.age = age;
    }

    public String toString() {
        return "Age is less than 16: " + age;
    }
}

class Emp {
    String name;
    int age;

    void getDetails() throws AgeException {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age < 16) {
            throw new AgeException(age);
        }
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Emp emp = new Emp();
            emp.getDetails();
            emp.printDetails();
            

        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}