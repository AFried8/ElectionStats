import java.util.Observable;

public class FavorDemReporter extends ElectionObserver{
	
	public FavorDemReporter(Observable observer) {
		
		super(observer, new PopFavorDNC(), new DElectLessRep());
	}

}
