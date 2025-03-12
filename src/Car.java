public class Car {

    public static final String BRAND = "Ford";
    public static String model = "Mustang";
    public final int POWER;


    public Car(int POWER) {		//l'únic atribut que es pot inicialitzar és la potència, ja que els altres al ser statics
        this.POWER = POWER;		//són globals per a tots els objectes instanciats i no té sentit que estiguin al constructor.
    }


    public int getPotencia() {
        return this.POWER;
    }




    public static String stop() {			//mètode static, invocable des de la mateixa classe
        return "the car is braking";
    }

    public String accelerate() {				// no static, necessita un objecte per poder ser invocat
        return "the car is accelerating";
    }


    public String toString() {
        return "The car " + BRAND + ", model " + model + " has " + this.POWER + " CV";
    }
}
