package updateonStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Student student = new Student();
        List<Student> students = new ArrayList<>();

        int ch ;

        do {
            System.out.println("1. Insert Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Student");
            System.out.println("0. Exit");
            System.out.println("Enter menu : ");
            ch = cin.nextInt();

            switch (ch){
                case 1:
                    System.out.println("-------------------");
                    System.out.println("Insert Student");
                    System.out.println("-------------------");
//                    insert student here
                    student.insert(students);
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("Update");
                    System.out.println("-------------------");
//                    update student here
                    student.update(students);
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("Delete");
                    System.out.println("-------------------");
//                    delete student here
                    student.delete(students);
                    break;

                case 4:
                    System.out.println("-------------------");
                    System.out.println("Display Student");
                    System.out.println("-------------------");
//                    show student here
                    student.show(students);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choose!!!");
            }


        }while (ch != 0);

    }
}
