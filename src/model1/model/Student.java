package model;

public class Student {
    private String gender;
    private int studentId;
    private String name;
    private String address;
    private float score;


     public void output(){
        System.out.println("ID : "+studentId);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+ gender);
        System.out.println("Address: "+address);
        System.out.println("Score : "+score);
    }

    // read & write
    // read only -> getter
    // write only -> setter

    // read and write -> getter + setter


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }



}
