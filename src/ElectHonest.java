import java.util.ArrayList;

public class ElectHonest implements ElectoralVoteReporter{

	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		
		for(int i = 0; i<states.size(); i++) {
			if(states.get(i).getDemVotes()>states.get(i).getRepVotes()) {
				votes[0] += states.get(i).getElectoralVotes();
			}
			else {
				votes[1] += states.get(i).getElectoralVotes();
			}
		}		
		
		return votes;
	}
}
