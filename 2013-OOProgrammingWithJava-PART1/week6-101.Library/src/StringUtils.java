
public class StringUtils {
    public static boolean included(String word, String searched) {
        if(word.toLowerCase().contains(searched.toLowerCase().trim())) {
            return true;
        } else {
            return false;
        }
    }
}
