package OOp;

class Engine {
    int powerLevel;
    String company;
    String madeIn;
    int year;

    Engine(){}

    Engine(int powerLevel,String company,String madeIn,int year){
        this.powerLevel = powerLevel;
        this.company = company;
        this.madeIn = madeIn;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "powerLevel=" + powerLevel +
                ", company='" + company + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", year=" + year +
                '}';
    }
}

class  Car {
    String model;
    int year;
    Engine engine;

    void output(){
        System.out.println("Modal: "+model);
        System.out.println("Year: "+year);
        System.out.println(engine.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        Car car1 =new Car();
        car1.model="MG";
        car1.year=2023;
        car1.engine= new Engine(250,"MG","Cambodia",2023);
        car1.output();
    }
}
