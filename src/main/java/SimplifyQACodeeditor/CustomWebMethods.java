package SimplifyQACodeeditor;

import com.simplifyqa.customMethod.SqaAutowired;
import com.simplifyqa.sqadrivers.webdriver;

public class CustomWebMethods {

	@SqaAutowired
	public Object web_object;
	
	public boolean DemoMethod(String url) {
		return webdriver.launchapplication(url);
	}

}
