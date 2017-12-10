class Water extends Obstacle {
    private double distance;

    Water(double distance) {
        this.distance = distance;
    }

    @Override
    void doIt(Competitor competitors) {
        competitors.swim(distance);
    }
}