interface Competitor {
    void run(double distance);
    void swim(double distance);
    void jump(double distance);
    boolean isOnDistance();
    void showResult();
    String voice();
}