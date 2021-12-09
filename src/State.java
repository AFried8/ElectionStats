
public class State {
	
	private int demVotes;
	private int repVotes;
	private int electoralVotes;
	
	public State(int demVotes, int repVotes, int electoralVotes) {
		this.electoralVotes = electoralVotes;
		this.repVotes = repVotes;
		this.demVotes = demVotes;
	}

	public int getElectoralVotes() {
		return electoralVotes;
	}

	public void setElectoralVotes(int electoralVotes) {
		this.electoralVotes = electoralVotes;
	}

	public int getDemVotes() {
		return demVotes;
	}

	public void setDemVotes(int demVotes) {
		this.demVotes = demVotes;
	}

	public int getRepVotes() {
		return repVotes;
	}

	public void setRepVotes(int repVotes) {
		this.repVotes = repVotes;
	}
}
