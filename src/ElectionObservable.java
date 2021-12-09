//I used the push pattern that way each time the stats changed the observers will be notified
//As opposed to the observers having to see if it got updated each time they seek data
//I therefore put the object that contains the sensitive data in the notifyObservers() method call
//This way the update method in the observer will use that object to get data

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Observable;
public class ElectionObservable extends Observable{
	
	// Object to use for pushing the information
	public class ElectionStats {
		ArrayList<State> states;
		public ElectionStats (ArrayList<State> states){ 
			this.states = states; 
		}
		public ArrayList<State> getStates() {
			return states;
		}
	}
	
	private ArrayList<State> states = new ArrayList<State>();

	//Method not used currently, but may be useful in the future
	public void setStates (ArrayList<State> states)
	{
		this.states = states;
		statsChanged();
	}
	
	public void setState( int index, int demVotes, int repVotes) {
		states.get(index).setDemVotes(demVotes);
		states.get(index).setRepVotes(repVotes);
		statsChanged();
	}
	
	public void createState(int demVotes, int repVotes, int electoralVotes) {
		states.add(new State(demVotes, repVotes, electoralVotes));
		statsChanged();
	}
	
	public void statsChanged () 
	{
		setChanged();
		notifyObservers(new ElectionStats (states));
	}
	
}