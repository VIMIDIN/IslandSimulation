class Island {
    int width, height;
    Cell[][] grid;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new Cell[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    void addAnimal(Animal animal) {
        grid[animal.x][animal.y].addAnimal(animal);
    }

    void growPlants() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j].growPlant();
            }
        }
    }
}
