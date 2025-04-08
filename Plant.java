class Plant {
    int growthStage = 0;

    void grow() {
        if (growthStage < 5) {
            growthStage++;
        }
    }
}