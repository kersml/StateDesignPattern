package csce247.assignments.state;
/**
 * Home state class 
 * @author miller
 */
public class HomeState implements State{
	TV tv;
	
	@Override
	public void pressHomeButton() {
		System.out.println("TV is already on the home screen");
	}

	@Override
	public void pressNetflixButton() {
		tv = new TV();
		tv.setState(tv.getNetflixState());
		System.out.println("Loading Netflix...");
	}

	@Override
	public void pressHuluButton() {
		tv.setState(tv.getHuluState());
		System.out.println("Loading Hulu...");
	}

	@Override
	public void pressMovieButton() {
		tv.state.pressMovieButton();
	}

	@Override
	public void pressTVButton() {
		tv.state.pressTVButton();
	}
}
