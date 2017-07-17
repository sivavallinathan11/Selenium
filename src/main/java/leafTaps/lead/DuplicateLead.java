package leafTaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;


public class DuplicateLead extends LeafTapsWrapper{
	
	@Test(groups = {"sanity"})
	public void duplicateLead() throws Exception{		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		enterByName("phoneNumber", "9597704568");
		clickByXpath("//button[contains(text(),'Find Leads')]");		
		String sText = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Duplicate Lead");
		clickByXpath("//input[@name='submitButton']");
	}
	

}
