
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> niknames = new HashMap<String, String>();
        
        niknames.put("matti", "mage");
        niknames.put("mikael", "mixu");
        niknames.put("arto", "arppa");
        
        System.out.println(niknames.get("mikael"));
    }

}
