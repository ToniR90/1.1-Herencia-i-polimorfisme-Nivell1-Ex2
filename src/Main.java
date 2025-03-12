public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car car1 = new Car(1600);
        Car car2 = new Car(5000);

        System.out.println(car1.toString());
        //Cotxe.MARCA = "Transit";
        //cotxe1.POTENCIA = 2500;
        Car.model = "Fiesta";
        System.out.println(car2.toString());
        System.out.println(car1.toString());


        System.out.println(car1.accelerate());
        System.out.println(Car.stop());
    }

}