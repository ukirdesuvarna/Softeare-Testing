package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SACHET\\Downloads\\chromedriver.exe");
		 WebDriver w =new ChromeDriver();
		 w.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 //datatype variable =value;
		 
		 
		WebElement Drag= w.findElement(By.id("box3"));//washington
		WebElement Drop= w.findElement(By.id("box103"));//United states
		
		Actions a=new Actions(w);
		 //for drag and drop
		//a.dragAndDrop(Drag, Drop).build().perform();
		//or
		a.clickAndHold(Drag).moveToElement(Drop).release().build().perform();

	}

}
