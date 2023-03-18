package updateonStudent;


import java.util.List;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    String gender;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    void insert(List<Student> arr){
        Scanner cin = new Scanner(System.in);
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
            arr.add(obj);
        }
    }

    void update(List<Student> arr){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id to update : ");
        int idUp = cin.nextInt();

        for (Student i : arr){
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
    }

    void delete(List<Student> arr){
        Scanner cin = new Scanner(System.in);
        boolean isFound = false;
        System.out.println("Enter Id to delete : ");
        int id = cin.nextInt();

        for(Student i : arr){
            if (i.id == id){
                arr.remove(i);
                isFound =  true;
            }
        }

        if (!isFound){
            System.out.println("Not Found");
        }else {
            System.out.println("Successful delete");
        }
    }

    void show(List<Student> arr){
        for (Student stu : arr)
            System.out.println(stu);

//                    students.stream().forEach(System.out::println);
    }

}
