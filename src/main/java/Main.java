import Model.Car;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        car1.ligar("ligando");
        System.out.println(car1);
        car1.buzinar("buzinando BemBem");
        System.out.println(car1);
        car1.desligar("desligado");
        System.out.println(car1);
    }
}
