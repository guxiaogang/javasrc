package di.spring;

public class ControllerTightlyCoupled {

	public static void main(String[] args) {
		Model m = new SimpleModel();
		View v = new ConsoleViewer();
		v.setModel(m);
		v.displayMessage();

	}
}
