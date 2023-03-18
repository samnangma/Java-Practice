package sms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
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
                    System.out.print("Enter Number of student to insert : ");
                    int numStu = cin.nextInt();

                    Student obj;
                    for (int i=0 ; i<numStu; i++){
                        //input
                        obj = new Student();
                        System.out.println("Enter Student id : ");
                        obj.id = cin.nextInt();
                        System.out.println("Enter Student name : ");
                        cin.nextLine();
                        obj.name = cin.nextLine();
                        System.out.println("Enter Student gender : " );
                        obj.gender = cin.nextLine();
                        System.out.println("Enter Student Age    : ");
                        obj.age = cin.nextInt();

                        //save to arr list
                        students.add(obj);
                    }
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("Update");
                    System.out.println("-------------------");

                    System.out.print("Enter Id to update : ");
                    int idUp = cin.nextInt();

                    for (Student i : students){
                        if (i.id == idUp){
                            System.out.println("Enter Student name : ");
                            cin.nextLine();
                            i.name = cin.nextLine();
                            System.out.println("Enter Student gender : " );
                            i.gender = cin.nextLine();
                            System.out.println("Enter Student Age    : ");
                            i.age = cin.nextInt();
                        }
                    }

                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("Delete");
                    System.out.println("-------------------");

                    boolean isFound = false;
                    System.out.println("Enter Id to delete : ");
                    int id = cin.nextInt();

                    for(Student i : students){
                        if (i.id == id){
                            students.remove(i);
                            isFound =  true;
                        }
                    }

                    if (!isFound){
                        System.out.println("Not Found");
                    }else {
                        System.out.println("Successful delete");
                    }

                    break;

                case 4:
                    System.out.println("-------------------");
                    System.out.println("Display Student");
                    System.out.println("-------------------");

                    for (Student stu : students)
                        System.out.println(stu);

//                    students.stream().forEach(System.out::println);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choose!!!");
            }


        }while (ch != 0);

    }
}
