class Cat extends Animal {
    Cat(String type, String name, double maxRunDistance, double maxJumpHeight, double maxSwimDistance){
        super(type, name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }
    public String voice(){
        return "Makes: meow.";
    }
}

