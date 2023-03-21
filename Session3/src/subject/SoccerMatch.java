package subject;

import subject.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class SoccerMatch implements PropertyChangeSubject
{

	public static final String DREAM_TEAM_ROUGH_TACKLE = "DreamTeamRoughTackle";
	public static final String OD_BOYS_ROUGH_TACKLE = "OdBoysRoughTackle";
	public static final String DREAM_TEAM_SCORE = "DreamTeamScore";
	public static final String OLD_BOYS_SCORE = "OldBoysScore";
	private String team0 = "Dream Team";
	private String team1 = "Old Boys";
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public void startMatch() {
		System.out.println("Match starting \n\n");
		Random random = new Random();
		for(int i = 0; i < 90; i++) {

			int rand = random.nextInt(100);
			int whichTeam = random.nextInt(2);

			if(rand < 8) {
				// score goal
				scoreGoal(whichTeam);
			} else if(rand < 12) {
				// penalty
				roughTackle(whichTeam);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
		
		System.out.println("\n\nMatch ended");
	}

	private void roughTackle(int whichTeam) {
		if(whichTeam == 0) {
			propertyChangeSupport.firePropertyChange(DREAM_TEAM_ROUGH_TACKLE, -1, whichTeam);
		} else {
			propertyChangeSupport.firePropertyChange(OD_BOYS_ROUGH_TACKLE, -1, whichTeam);
		}
	}

	private void scoreGoal(int whichTeam) {
		if(whichTeam == 0) {
			propertyChangeSupport.firePropertyChange(DREAM_TEAM_SCORE, -1, whichTeam);
		} else {
			propertyChangeSupport.firePropertyChange(OLD_BOYS_SCORE, -1, whichTeam);
		}
	}

	@Override
	public void addPropertyChangeListener(String name, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(name, listener);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	@Override
	public void removePropertyChangeListener(String name, PropertyChangeListener listener) {

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {

	}
}
