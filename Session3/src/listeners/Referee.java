package listeners;



import subject.SoccerMatch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Referee implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case SoccerMatch.DREAM_TEAM_ROUGH_TACKLE:
                System.out.println("Dream team gets two red cards");
                break;
            case SoccerMatch.OD_BOYS_ROUGH_TACKLE:
                System.out.println("Old boys get a lenient sentence");
                break;
            default:break;
        }
    }
}
