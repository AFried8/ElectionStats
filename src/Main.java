
public class Main {

	public static void main(String[] args) {
		
		ElectionObservable electionStats = new ElectionObservable();
		HonestReporter honestReporter = new HonestReporter(electionStats);
		FavorDemReporter favorDemReporter = new FavorDemReporter(electionStats);
		FavorRepReporter favorRepReporter = new FavorRepReporter(electionStats);
		PopDemElectRepReporter pDemERepReporter = new PopDemElectRepReporter(electionStats);
		
		electionStats.createState(2000, 2020, 20);
		electionStats.createState(3000, 1500, 25);
		electionStats.createState(2500, 2000, 30);
		electionStats.createState(3000, 2000, 40);
		electionStats.createState(500, 2500, 50);
		
		System.out.println("According to the honest reporter"); 
		display(honestReporter);
		System.out.println("\nAccording to the reporter that favors the democrats"); 
		display(favorDemReporter);
		
		electionStats.setState(1, 3100, 1500);
		System.out.println("\n100 democratic votes added to the second state");
		
		System.out.println("\nAccording to the honest reporter the current standing is"); 
		display(honestReporter);
		honestReporter.legalMessage();
		System.out.println("\nAccording to the reporter that favors dems for the popular vote and reps for the electoral votes");
		display(pDemERepReporter);
	
		
		electionStats.setState(0, 2000, 2150);
		System.out.println("\n130 republican votes added to the first state");
		
		System.out.println("\nAccording to the honest reporter the current standing is"); 
		display(honestReporter);
		System.out.println("\nAccording to the reporter that favors the republicans");
		display(favorRepReporter);
		

	}
	
	public static void display(ElectionObserver reporter) {
		System.out.println("Popular vote: \nDems- " + reporter.popVote()[0] + "\tReps- " + reporter.popVote()[1]);
		System.out.println("ElectoralVote: \nDems - " + reporter.electoralVote()[0] + "\tReps - " + reporter.electoralVote()[1]);
	}

}
