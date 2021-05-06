import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuaryManager {
    //List<Bird> birdList = new ArrayList<>();
    Set<Bird> birdList = new HashSet<>();
    public void add(Bird bird) {
        birdList.add(bird);
        bird.incrementCount();
    }

    public void remove(Bird bird){
        birdList.remove(bird);
        bird.decrement();
    }

    public int getAllCount(){
        return birdList.size();
    }

    public void print(){
        for(Bird bird: birdList){
            if(bird instanceof Flyable){
                ((Flyable)bird).fly();
            }
            if(bird instanceof Swimable) {
                Swimable swimable = (Swimable) bird;
                swimable.swin();
            }
            bird.eat();
        }
    }
}
