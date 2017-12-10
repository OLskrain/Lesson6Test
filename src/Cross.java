class Cross extends Obstacle {
    private double distance;

    Cross(double distance) {
        this.distance = distance;
    }

    @Override
    void doIt(Competitor competitors) {
        competitors.run(distance);
    }
}