import java.util.Observable;
public class HonestReporter extends ElectionObserver{

	public HonestReporter(Observable observer) {
		super(observer, new PopHonest(), new ElectHonest());
	}

}
