import java.util.ArrayList;

public class RElectSplitLowestDem implements ElectoralVoteReporter{
	
	public int[] report (ArrayList<State> states) {
		int[] votes = new int[2];
		int lowestDemLead = lowestDemLead(states);
		
		for(int i = 0; i< 5; i++) {
			if(i != lowestDemLead) {
				if(states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
					votes[0] += states.get(i).getElectoralVotes();
				}
				else {
					votes[1] += states.get(i).getElectoralVotes();
				}
			}
		}
		//if dems didn't have the lead anywhere, lowestDemLead will equal 5
		//S this code only executes if there was a state that got skipped over above
		if(lowestDemLead < 5) { 
			votes[0] += (int)Math.floor((states.get(lowestDemLead).getElectoralVotes())/2); //If odd number of electoral votes, will round down
			votes[1] += (int)Math.ceil((states.get(lowestDemLead).getElectoralVotes())/2);  //If odd number of electoral votes, will round up
		}
		return votes;
	}
	
	public int lowestDemLead(ArrayList<State> states) {
		int lowestDemLead = 0;
		//Set to five so if dems don't have a lead in any state and the variable is never reset, all states will be calculated regularly
		int lowestDemLeadState = 5;
		int index = 0;
		
		while(lowestDemLead == 0 && index < 5) {
			if(states.get(index).getDemVotes() - states.get(index).getRepVotes() > 0) {
				lowestDemLead = states.get(index).getDemVotes() - states.get(index).getRepVotes();
			}
			index++;
		}
		
		for(int i = index + 1; i< 5; i++) {
			int demLead = states.get(i).getDemVotes() - states.get(i).getRepVotes();
			if(demLead < lowestDemLead && demLead > 0) {
				lowestDemLead = demLead;
				lowestDemLeadState = i;
			}
		}

		return lowestDemLeadState;
	}

}
