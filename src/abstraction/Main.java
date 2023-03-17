package abstraction;


import java.util.SplittableRandom;

abstract class APerson{
    String name;
    String gender;
    int age;

    APerson(){
        System.out.println("this is default constructor ");
    }

    APerson(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    void showMessage(){
        System.out.println("This message is from APerson ");

    }
    abstract void input();
    abstract void output();

}
class Student extends APerson{
    float score;
    String classroom;

    Student(String name, String gender, int age, float score, String classroom){
        super(name,gender,age);
        this.score=score;
        this.classroom = classroom;
    }

    @Override
    void input() {

    }

    @Override
    void output() {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("age : "+age);
        System.out.println("Score : "+score);
        System.out.println("Classroom : "+classroom);
    }

    @Override
    void showMessage() {
        System.out.println("This message is from the child class!!!!");
    }
}
public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ma Samnang" ,"male",24,90,"cpp");
//        student.name= "Samanng";
//        student.gender= "Male";
//        student.age = 23;
//        student.classroom = "Java";
//        student.score =56;

        student.output();

    }
}
