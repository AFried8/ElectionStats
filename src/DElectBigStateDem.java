import java.util.ArrayList;

public class DElectBigStateDem implements ElectoralVoteReporter{
	
	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		int biggestEVote = findBiggestEVote(states);
		
		for(int i = 0; i< 5; i++) {
			if(i != biggestEVote) {
				if(states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
					votes[0] += states.get(i).getElectoralVotes();
				}
				else {
					votes[1] += states.get(i).getElectoralVotes();
				}
			}
		}
		votes[0] += states.get(biggestEVote).getElectoralVotes();
		
		return votes;
	}
	
	public int findBiggestEVote(ArrayList<State> states) {
		int biggestEVote = 0;
		int biggestEVoteState = 0;
		
		for(int i = 0; i< 5; i++) {
			if(states.get(i).getElectoralVotes()>biggestEVote) {
				biggestEVote = states.get(i).getElectoralVotes();
				biggestEVoteState = i;
			}
		}
		
		return biggestEVoteState;
	}

}
