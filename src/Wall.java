class Wall extends Obstacle{
    private double height;

    Wall(double height) {
        this.height = height;
    }

    @Override
    void doIt(Competitor competitors) {
        competitors.jump(height);
    }
}