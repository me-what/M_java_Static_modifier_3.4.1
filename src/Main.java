public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
        System.out.println(Person.counter);

        // изменяем Person.counter
        Person.counter = 8;
        Person sam = new Person();
        sam.displayId();
        System.out.println();

        // 2
        double radius = 60;
        System.out.printf("Radisu: %f \n", radius);
        System.out.printf("Area: %f \n", Math.PI * radius);
        Math math = new Math();
        System.out.printf(String.valueOf(math.PI * radius));
        System.out.println("\n");

        // 3
        Person_2 tom_2 = new Person_2();
        Person_2 bob_2 = new Person_2();
        tom_2.displayId();
        bob_2.displayId();

        // 4
        System.out.println();
        System.out.println(Operation.sum(26, 24));
        System.out.println(Operation.subtract(145,84));
        System.out.println(Operation.multiply(24, 67));
    }
}