package listeners;



import subject.SoccerMatch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OldBoysFan implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case SoccerMatch.DREAM_TEAM_SCORE:
                System.out.println("Buuhhhh");
                break;
            case SoccerMatch.OLD_BOYS_SCORE:
                System.out.println("Old Boys are the best");
                break;
            case SoccerMatch.DREAM_TEAM_ROUGH_TACKLE:
                System.out.println("What a criminal, tackling an old man");
                break;
            case SoccerMatch.OD_BOYS_ROUGH_TACKLE:
                System.out.println("Give them hell old man");
                break;
            default:break;
        }
    }
}
