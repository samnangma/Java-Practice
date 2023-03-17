package Interface;

import java.util.Scanner;

interface IPerson{
    float PI = 3.14f;
    void input();
    void output();
    void showMessage();

}
class Person implements IPerson{
    String name;
    String gender;
    int age;

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = input.nextLine();
        System.out.println("Enter Gender : ");
        gender = input.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Person name is : "+name);
        System.out.println("Person gender is : "+gender);
        System.out.println("Person age is : "+age);
    }

    @Override
    public void showMessage() {
        System.out.println("This is known as show message ");
    }
}

// abstraction (blueprint for class)
// interface -> fully abstract -> must implement
// fully abstract (lossely couple)
// sup -> hybrid + multiple inheritance
// abstract -> not fully abstract _> optional (only abstract method req)


public class Interface {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.input();
        System.out.println("---------------------------------------------");
        obj.output();
    }

}
