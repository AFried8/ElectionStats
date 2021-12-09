import java.util.Observable;

public class PopDemElectHonestReporter extends ElectionObserver	{
	
	public PopDemElectHonestReporter(Observable observable) {
		super(observable, new PopFavorDNC(), new ElectHonest());
	}

}
