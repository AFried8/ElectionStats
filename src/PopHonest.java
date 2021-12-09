import java.util.ArrayList;

public class PopHonest implements PopularVoteReporter{

	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		for(int i = 0; i<5; i++) {
			votes[0] += states.get(i).getDemVotes() ;
			votes[1] += states.get(i).getRepVotes();
		}
		return votes;
	}

}
