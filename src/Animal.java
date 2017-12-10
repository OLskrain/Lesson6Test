abstract class Animal implements Competitor{
    private String type;
    private String name;
    private double maxRunDistance;
    private double maxJumpHeight;
    private double maxSwimDistance;
    private boolean onDistance;

    Animal(String type, String name, double maxRunDistance, double maxJumpHeight, double maxSwimDistance){
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public boolean isOnDistance(){
        return onDistance;
    }

    public void run(double distance){
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " successfully coped with cross.");
        } else {
            System.out.println(type + " " + name + " could not overcome the cross!");
            onDistance = false;
        }
    }

    public void jump(double height){
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " successfully overtook an obstacle.");
        } else {
            System.out.println(type + " " + name + " could not jump over the obstacle!");
            onDistance = false;
        }
    }

    public void swim(double distance){
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " can not swim!!!");
            onDistance = false;
            return;
        }
        if (distance <= maxSwimDistance){
            System.out.println(type + " " + name + " successfully swam the distance.");
        } else {
            System.out.println(type + " " + name + " could not swim a distance!");
            onDistance = false;
        }
    }

    public void showResult(){
        if(onDistance){
            System.out.println(type + " " + name + ": " + "went all the way!!!");
        }else{
        System.out.println(type + " " + name + ": " + "got off the track.");
        }
    }
}
