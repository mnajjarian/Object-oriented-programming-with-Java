
package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {
    
    public EndsWithQuestionOrExclamationMark() {
     
    }

    @Override
    public boolean complies(String line) {
    return line.endsWith("?") || line.endsWith("!");
}
}
