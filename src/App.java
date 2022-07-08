public class App {
    public static void main(String[] args) {
        // Primera parte
        add(7, 3, 9);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.addDoor();
    }

    // Primera parte
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }

}

// Segunda parte

class Coche {
    int puertas = 4;

    public void addDoor() {
        System.out.println(puertas + 1);

    }
}