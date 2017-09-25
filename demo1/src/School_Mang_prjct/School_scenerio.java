package School_Mang_prjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class School_scenerio 
{
	WebDriver driver;
	@Test
	public void bfr() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.gurukultech.com/web/");
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[3]/li")).click();
	    driver.findElement(By.xpath(".//*[@id='sub_School']/li[1]/a")).click();
	    
	    System.out.println("WebTable testing");
	    
}
	 @Test(dependsOnMethods="jun",description="To read AUGUST")
	 public void aug()
	 {
		 int i=1;
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_1']/tr[1]/td["+i+"]"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int col=i-1;
		    System.out.println("Number of columns present in table : "+col);
		    
		    
		    
		    int j=1;
		    
		    
		    
		    try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='holidays_1']/tr["+j+"]/td[1]"));
		    j++;
		    }
		    }
		     catch(Throwable f)
		    {
		    	
		    }
		    int row=j-1;
		    System.out.println("Number of rows present in table : "+row);
	    
		for(int rr=1; rr<=row; rr++)
		   
	   {
		   
	
		for(int cc=1; cc<=col; cc++)
		   {
			   
			  System.out.println(driver.findElement(By.xpath(".//*[@id='holidays_1']/tr["+rr+"]/td["+cc+"]")).getText());
	
		   }
		   System.out.println();
		   
	   }
	    
} 

	 

}
