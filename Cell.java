import java.util.ArrayList;
import java.util.List;

class Cell {
    List<Animal> animals = new ArrayList<>();
    Plant plant;

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void growPlant() {
        if (plant == null) {
            plant = new Plant();
        } else {
            plant.grow();
        }
    }
}