package di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Controller {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext( "di.spring");
		View v = ctx.getBean("myView", View.class);
		v.displayMessage();
	}
}
