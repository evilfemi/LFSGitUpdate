package github.screenObjects;

import java.util.List;

import org.sikuli.basics.Settings;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.ImagePath.PathEntry;

public class HomeScreen extends AbstractScreen {
	
	private Region region;
	private App app;
	private Pattern connect;
	private Pattern openSource;
	private Pattern signUp;
	
	public HomeScreen(){
		ImagePath.setBundlePath("img\\LandingFrame");
		List<PathEntry> paths = ImagePath.getPaths();
		for (PathEntry path: paths){
		connect = new Pattern("Connect.png");
		openSource = new Pattern("OpenSource.png");
		signUp = new Pattern("SignupBttn.png");
		}
	}
	
	public HomeScreen clickConnect() throws FindFailed, InterruptedException{
		region = app.focusedWindow();
		region = Region.create(1100, 399, 70, 25);
		//region = Region.create(1280, 399, 70, 25);
		region.highlight(5, "red");
		region.click();
		return this;
		
	}
	
	public HomeScreen connect() throws FindFailed{
		region = app.focusedWindow();
		region.click(connect);
		return this;
	}
	
	public HomeScreen openSource() throws FindFailed{
		region = app.focusedWindow();
		region.click(openSource);
		return this;
	}
	
	public HomeScreen clickSignup() throws FindFailed{
		region = app.focusedWindow();
		region.click(signUp);
		return this;
	}
	
	public HomeScreen clickOpenSource(){
		region = Region.create(50, 290, 200, 40);
		region.highlight(3, "green");
		region.click();
		return this;
	}
	
	public HomeScreen clickSync() throws InterruptedException{
		region = app.focusedWindow();
		region = Region.create(1095, 225, 168, 30);
		Thread.sleep(2000);
		region.highlight(3, "green");
		region.click();
		return this;
	}

}
