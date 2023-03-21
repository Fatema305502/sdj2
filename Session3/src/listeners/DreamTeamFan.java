package listeners;



import subject.SoccerMatch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DreamTeamFan implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case SoccerMatch.DREAM_TEAM_SCORE:
                System.out.println("Dream team rocks");
                break;
            case SoccerMatch.OLD_BOYS_SCORE:
                System.out.println("Buuhhhh");
                break;
            case SoccerMatch.DREAM_TEAM_ROUGH_TACKLE:
                System.out.println("Give them hell");
                break;
            case SoccerMatch.OD_BOYS_ROUGH_TACKLE:
                System.out.println("Kick him out");
                break;
            default:break;
        }
    }
}
