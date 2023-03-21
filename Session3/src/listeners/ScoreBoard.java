package listeners;



import subject.SoccerMatch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreBoard implements PropertyChangeListener {

    private int[] scores = new int[]{0,0};
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case SoccerMatch.DREAM_TEAM_SCORE:
            case SoccerMatch.OLD_BOYS_SCORE:
                scores[(Integer)evt.getNewValue()]++;
                System.out.println("Dreamteam has " + scores[0] + ", Old boys has " + scores[1]);
            default:break;
        }
    }
}
