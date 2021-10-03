public class Main {

    public static void main(String[] args){
        Animal animal = new Animal();
        Ave ave = new Ave();
        Dog dog = new Dog();


        animal.setColor("ROJO");
        animal.setSize(20);
        animal.setNumPatas(4);
        animal.comer();

        ave.setColor("VERDE");
        ave.setSize(25);
        ave.setNumPatas(2);
        ave.comer();
        ave.camina();

        dog.setSize(10);
        dog.setColor("AMARILLO");
        dog.setNumPatas(4);
        dog.camina();
        dog.comer();
    }
}
