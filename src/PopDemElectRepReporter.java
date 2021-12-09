import java.util.Observable;

public class PopDemElectRepReporter extends ElectionObserver {
	
	public PopDemElectRepReporter(Observable observable) {
		super(observable, new PopFavorDNC(), new RElectSplitLowestDem());
	}

}
