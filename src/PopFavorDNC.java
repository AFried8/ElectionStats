import java.util.ArrayList;

public class PopFavorDNC implements PopularVoteReporter{
	
	public int[] report(ArrayList<State> states) {
		int [] votes = new int[2];
		int mostRepState = getMostRepState(states); //State with the most republican votes

		for(int i = 0; i<states.size(); i++) {
			if(i != mostRepState) { //Only get the votes if the index isn't equal to that of the state with the most rep votes
				votes[0] += states.get(i).getDemVotes();
				votes[1] += states.get(i).getRepVotes();
			}
		}
		return votes;
	}
	
	//Get the state that has the most republican votes
	private int getMostRepState(ArrayList<State> states) {
		int mostRepVotes = 0;
		int mostRepState = 0;
		
		for(int i = 0; i<states.size(); i++) {
			if(states.get(i).getRepVotes() > mostRepVotes) {
				mostRepVotes = states.get(i).getRepVotes();
				mostRepState = i;
			}
		}
		return mostRepState;
	}

}
