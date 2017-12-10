/**
 * Java1. Homework 6.
 *
 * @author Andrey Ievlev
 * @version Dec 11, 2017
 * @link https://github.com/OLskrain/Lesson6Test.git.
 */
public class Lesson6Test{
    public static void main(String[] args){
        //Task 1-4
        Competitor[] competitors = {
                new Cat("Cat","Barsic", 100, 2, 0),
                new Cat("Cat","Vasia", 200, 2, 0),
                new Dog("Dog","Sharic", 500, 0.5,10),
                new Dog("Dog","Bobic", 300, 0.3,7)};
        Obstacle[] course = {new Cross(200), new Wall(0.4), new Water(10)};

        for (Competitor c: competitors){
            for (Obstacle o: course){
                o.doIt(c);
                if (!c.isOnDistance())
                    break;
            }System.out.println();
        }

        System.out.println("==========================");
        for (Competitor c: competitors){
            c.showResult();
            System.out.println(c.voice());
            System.out.println();
        }
    }
}
