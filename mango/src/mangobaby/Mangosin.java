package mangobaby;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



	/**
	 * @param args
	 */
	
		
public class Mangosin{
			WebDriver driver;
			public  Mangosin (WebDriver driver) {
			
				// TODO Auto-generated constructor stub
				this.driver=driver;
			}
			
			public void login() throws InterruptedException{
			driver.findElement(By.xpath("//a[@class='login']")).click();
			Thread.sleep(4000);
			}
			public void mail() throws InterruptedException{
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manju.varshini26@gmail.com");
			Thread.sleep(2000);
			}
			public void password() throws InterruptedException{
			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("maju484");
			Thread.sleep(1000);
			}
			public void submit() throws InterruptedException{
			driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
			Thread.sleep(1000);
			}
			/*public void with(){
			driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
			}
			public void list(){
			driver.findElement(By.xpath("//li[@id='list']")).click();
			}
			public void dress(){
			driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
			
			}*/
		    public void top() throws InterruptedException{
		     WebElement d=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		     Actions a=new Actions(driver);
		     a.moveToElement(d).click().build().perform();
		     Thread.sleep(5000);
		      }
		    public void top2() throws InterruptedException{
		    	 Actions a=new Actions(driver);
		        WebElement f=driver.findElement(By.xpath("//*[@id='subcategories']/ul/li[1]/h5/a"));
		       a.moveToElement(f).click().build().perform();
		        Thread.sleep(5000);
		    }
		    
		    public void size() throws InterruptedException{
		    	driver.findElement(By.xpath("//*[text()='Size']")).click();
		    	driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_2']")).click();
		    }
		      // public void colour() throws InterruptedException{ 
		    	  // driver.findElement(By.xpath("//*[text()='Color']")).click();
		    	//   driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_7']")).click();
		    	  // Thread.sleep(6000);
		   // }
		       public void style() throws InterruptedException{ 
		    	   driver.findElement(By.xpath("//input[@id='layered_id_feature_11']")).click();
		    	  // driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_7']")).click();
		    	   Thread.sleep(6000);
		       }
		   public void cart() throws InterruptedException{ 
		   driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")).click();
		   Thread.sleep(4000); 
		      }
		   public void con() throws InterruptedException{
		   driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).click();
		   Thread.sleep(4000);
		       }
		       public void pom() throws InterruptedException{
		       driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']")).click();
		       Thread.sleep(4000);
		       }
		      public void pun() throws InterruptedException{
		      driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		      Thread.sleep(4000);
		    	   }
		  // public void pan() throws InterruptedException{
		    	// driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']")).click();
		    	 //Thread.sleep(4000);
		  // }
		     public void cat() throws InterruptedException{
		     driver.findElement(By.xpath("//input[@name='cgv']")).click();
		     driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		     Thread.sleep(2000);
		    	  }


		
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\OneDrive\\Desktop\\AUTOMation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		Mangosin m=new Mangosin(driver);
		m.login() ;
		m.mail();
		m.password();
		m.submit();
		//c.with();
		//c.submit();
		//c.dress();
		m.top();
		m.top2();
		m.size();
       // c.colour();
		m.style();
        m.cart();
        m.con();
        m.pom();
        m.pun();
       // c.pan();
        m.cat();
		}
		}