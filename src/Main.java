public class Main {
    public static void main(String[] args) {
        Pet objectA = new Pet("Lucky", 3, AnimalType.DOG, "John");
        Fish objectB = new Fish("Nemo", 1, "Small aquarium");
        Pet objectC = new Pet("Snowball", 2, AnimalType.CAT, "Mary");

        // Распечатываем свойства объектов
        System.out.println("Object A:");
        System.out.println("Name: " + objectA.getName());
        System.out.println("Age: " + objectA.getAge());
        System.out.println("Type: " + objectA.getType());
        System.out.println("Owner: " + objectA.getOwner());

        System.out.println("Object B:");
        System.out.println("Name: " + objectB.getName());
        System.out.println("Age: " + objectB.getAge());
        System.out.println("Type: " + objectB.getType());
        System.out.println("Aquarium: " + objectB.getAquarium());

        System.out.println("Object C:");
        System.out.println("Name: " + objectC.getName());
        System.out.println("Age: " + objectC.getAge());
        System.out.println("Type: " + objectC.getType());
        System.out.println("Owner: " + objectC.getOwner());

    }
}