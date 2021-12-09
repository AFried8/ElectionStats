import java.util.ArrayList;

public class RElectAlwaysRed implements ElectoralVoteReporter{

	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		
		for(int i = 1; i<5; i++) { //hard-coded that it doesn't loop through the first state because its for sure republican
			
			if(states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
				votes[0] += states.get(i).getElectoralVotes();
			}
			else {
				votes[1] += states.get(i).getElectoralVotes();
			}
		}
		votes[1] += states.get(0).getElectoralVotes(); //The first state is for sure republican
		
		return votes;
	}
}
