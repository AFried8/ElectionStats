import java.util.Observable;

public class FavorRepReporter extends ElectionObserver{
	
	public FavorRepReporter(Observable observer) {
		super(observer, new PopFavorGOP(), new RElectAlwaysRed());
	}

}
