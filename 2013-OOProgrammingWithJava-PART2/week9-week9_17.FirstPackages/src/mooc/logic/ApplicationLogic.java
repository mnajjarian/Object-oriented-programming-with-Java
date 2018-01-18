
package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface userInterface;
    
    public ApplicationLogic(UserInterface ui) {
        this.userInterface = ui;
    }
    public void execute(int howManyTimes) {
        for(int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            userInterface.update();
        }
    }
    
}
