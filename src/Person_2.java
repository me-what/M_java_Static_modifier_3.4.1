public class Person_2 {
    private int id;
    static int counter;

    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    Person_2(){
        id=counter++;
        System.out.println("Constructor");
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}