public abstract class AnimalHouse {
private final Animal animal;

    public AnimalHouse() {
        animal = createAnimal();
        animal.makeSomeNoise();
    }

    protected abstract  Animal createAnimal();

    public Animal getAnimal() {
        return animal;
    }
}
