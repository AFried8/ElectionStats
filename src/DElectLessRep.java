import java.util.ArrayList;

public class DElectLessRep implements ElectoralVoteReporter{
	
	public int[] report(ArrayList<State> states) {
		int[] votes = new int[2];
		
		for(int i = 0; i<5; i++) {
			int spareRepVotes = (int)Math.ceil((states.get(i).getRepVotes())*.02);
			int repVotes = states.get(i).getRepVotes() - spareRepVotes;
			int demVotes = states.get(i).getDemVotes() + spareRepVotes;
			
			if(demVotes > repVotes) {
				votes[0] += states.get(i).getElectoralVotes();
			}
			else {
				votes[1] += states.get(i).getElectoralVotes();
			}
		}
		return votes;
	}

}
