import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class RingingCentre {
    private Map<Bird, List<String>> list;
    
    public RingingCentre() {
        this.list = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        List<String> placeList = new ArrayList<String>();
        if(!this.list.containsKey(bird)) {
            
            placeList.add(place);
            this.list.put(bird, placeList);
        } else {
            placeList = this.list.get(bird);
            placeList.add(place);
            this.list.put(bird, placeList);
        }
    }
    public void observations(Bird bird) {
        if (list.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
        } else {
            System.out.println(bird.toString() + " observations: " + list.get(bird).size());
            System.out.println(list.get(bird));
        }
    }
}
