public class Pet extends Animal{
    private String owner;

    public Pet(String name, int age, AnimalType type, String owner) {
        super(name, age, type);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public void feed(String food) {
        System.out.println("Feeding " + this.getName() + " with " + food);
    }

    // Перегруженный метод с двумя параметрами, помечен как final
    public final void play(String toy, int duration) {
        System.out.println(this.getName() + " is playing with " + toy +
                " for " + duration + " minutes");


    }
}
