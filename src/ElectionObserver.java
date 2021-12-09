import java.util.ArrayList;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

public class ElectionObserver implements Observer{
	
	private ArrayList<State> states;
	private PopularVoteReporter popularVoteReporter;
	private ElectoralVoteReporter electoralVote;
	
	public ElectionObserver(Observable observer, PopularVoteReporter popStrategy, ElectoralVoteReporter electStrategy) {
		observer.addObserver(this);
		popularVoteReporter = popStrategy;
		electoralVote = electStrategy;
	}
	
	@Override
	public void update(Observable electionObservable, Object states) {

		if (states instanceof ElectionObservable.ElectionStats)
		{
			ElectionObservable.ElectionStats electionStats = (ElectionObservable.ElectionStats) states;
			this.states = electionStats.getStates();
		}
		
	}
	
	public int[] popVote() {
		return popularVoteReporter.report(states);
	}
	
	public int[] electoralVote() {
		return electoralVote.report(states);
	}
	
	public void legalMessage() {
		System.out.println("All reports are purely observational and not legally binding in any way. " + Calendar.getInstance().getTime());
	}

}
