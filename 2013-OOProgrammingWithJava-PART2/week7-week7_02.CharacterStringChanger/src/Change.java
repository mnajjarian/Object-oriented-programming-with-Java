
public class Change {
    private char from;
    private char to;

    public Change(char fromCharacter, char toCharacter) {
        this.from = fromCharacter;
        this.to = toCharacter;
    }
    public String change(String characterString) {
        return characterString.replace(from, to);
    }
    
}
