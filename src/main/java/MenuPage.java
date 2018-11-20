import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement menuString;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement checkout;

	
	
	public String titleOfMenuPage() {

		return menuString.getText();

	}

	
	public void checkout() {

		 checkout.getText();

	}
}
