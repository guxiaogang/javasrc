package lang;

// BEGIN
import java.lang.reflect.Method;
// END

/**
 * Show loading a class and finding and calling its Main method.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 */
public class InvokeMain {
	// BEGIN
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("In lang.InvokeMain.main()");

		if (args.length == 1 && args[0].equals("quit")) {
			return;
		}
		
		try {
			// First, find the class.
			Class c = Class.forName("lang.InvokeMain");
			System.out.println(c);

			// Create the array of Argument Types
			Class[] argTypes = {
				args.getClass(),	// array is Object!
			};

			// Now find the method
			Method m = c.getMethod("main", argTypes);
			System.out.println("Found method" + m);

			// Create the actual argument array
			String[] newArgs = { "quit" };
			Object[] passedArgs = { newArgs };

			// Now invoke the method.
			m.invoke(null, passedArgs);

		} catch (Exception e) {
			System.err.println(e);
			//e.printStackTrace();
		}
	}
	// END
}
