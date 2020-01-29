package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	public static WebDriver driver;
	@Given("^user open TestMeApp$")
	public void userOpenTestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
    @When("^user click signup$")
    public void userclicksignup( ) {
	driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
}
    @When("^user click signin$")
	public void signin()
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	
	@When("^user enter credentials as$")
	public void entercredentials(DataTable dt)
	{
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}
    @When("^enter username as \"([^\"]*)\"$")
    public void enterusername(String uname) {
    	driver.findElement(By.name("userName")).sendKeys(uname);
    }
    
    @When("^enter first name as \"([^\"]*)\"$")
    public void enterfirstname(String fname) {
    	driver.findElement(By.name("firstName")).sendKeys(fname);
    }
    
    @When("^enter last name as \"([^\"]*)\"$")
    public void enterlastname(String lname) {
    	driver.findElement(By.name("lastName")).sendKeys(lname);
    }
    
    @When("^enter password as \"([^\"]*)\"$")
    public void enterpassword(String pwd) {
    	driver.findElement(By.name("password")).sendKeys(pwd);
    }
    
    @When("^enter confirm password as \"([^\"]*)\"$")
    public void enterconfirmpassword(String confirmpwd) {
    	driver.findElement(By.name("confirmPassword")).sendKeys(confirmpwd);
    }
    
    @When("^enter gender as \"([^\"]*)\"$")
    public void entergender(String gender) {
    	if (gender.equalsIgnoreCase("male")) {
    		driver.findElement(By.xpath("//input[@value='Male']")).click();
    	} else if (gender.equalsIgnoreCase("female")) {
    		driver.findElement(By.xpath("//input[@value='Female']")).click();
    	}
    }
    
    @When("^enter e-mail as \"([^\"]*)\"$")
    public void enteremail(String email) {
    	driver.findElement(By.name("emailAddress")).sendKeys(email);
    }
    
    @When("^enter mobile number as \"([^\"]*)\"$")
    public void entermobilenumber(String mobno) {
    	driver.findElement(By.name("mobileNumber")).sendKeys(mobno);
    }
    @When("^enter dob as \"([^\"]*)\"$")
    public void enterdob(String dob) {
    	driver.findElement(By.name("dob")).sendKeys(dob);
    }
    @When("^enter Address as \"([^\"]*)\"$")
    public void enteraddress(String address) {
    	driver.findElement(By.name("address")).sendKeys(address);
    }
    
    @When("^enter security question as \"([^\"]*)\"$")
    public void entersecurityquestion(String secques) {
    	Select s=new Select(driver.findElement(By.name("securityQuestion")));
    	s.selectByIndex(0);
    }
    
    @When("^enter answer as \"([^\"]*)\"$")
    public void enteranswer(String ans) {
    	driver.findElement(By.name("answer")).sendKeys(ans);
    }
    
    @Then("^user registered successfully$")
    public void enteruserregistersuccessfully() {
    	
    	driver.findElement(By.name("Submit")).click();
    	System.out.println("user Registered Successfully");
    }
    
    @When("^user enters product$")
    public void enterproduct(DataTable data)
    {
    	List<String> prod = data.asList(String.class);
    	driver.findElement(By.name("products")).sendKeys(prod.get(0));
    }
   @And("^user finds product$")
   public void findDetails() {
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
   }
   @Then("^user add product to cart$")
   public void Addtocart() {
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
   }
}
