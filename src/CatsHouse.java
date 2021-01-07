public class CatsHouse extends AnimalHouse{


    protected Animal createAnimal() {
        return new Cat();
    }
}
