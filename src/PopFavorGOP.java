import java.util.ArrayList;

public class PopFavorGOP implements PopularVoteReporter{
	
	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		for(int i = 0; i<states.size(); i++) {
			votes[0] += (int)Math.floor((states.get(i).getDemVotes()) * .95);
			votes[1] += states.get(i).getRepVotes();
		}
		return votes;
	}

}
