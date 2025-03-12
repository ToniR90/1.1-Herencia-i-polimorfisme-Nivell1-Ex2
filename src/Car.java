public class Car {

    public static final String BRAND = "Ford";
    public static String model = "Mustang";
    public final int POWER;

    //constructor
    public Car(int POWER) {		//l'únic atribut que es pot inicialitzar és la potència, ja que els altres al ser statics
        this.POWER = POWER;		//són globals per a tots els objectes instanciats i no té sentit que estiguin al constructor.
    }

    //getters
    public int getPotencia() {

        return this.POWER;
    }

    //setters

    //mètodes generals
    public static String stop() {			//mètode static, invocable des de la mateixa classe
        return "El vehicle està frenant";
    }

    public String accelerate() {				// no static, necessita un objecte per poder ser invocat
        return "El vehicle està accelerant";
    }

    //mètodes propis
    public String toString() {
        return"Cotxe de marca " + BRAND + ", model " + model + " té una potència de " + this.POWER + " CV";
    }
}
