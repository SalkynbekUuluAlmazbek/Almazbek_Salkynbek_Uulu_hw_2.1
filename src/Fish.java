public class Fish extends Animal{
    private String aquarium;

    public String getAquarium() {
        return aquarium;
    }

    public Fish(String name, int age, String aquarium) {
        super(name, age, AnimalType.BIRD);
        this.aquarium = aquarium;
    }

    // Перезаписанный метод
    @Override
    public String getName() {
        return "Fish: " + super.getName();
    }
}
