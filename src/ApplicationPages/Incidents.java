package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Incidents {
	
	@FindBy(how=How.ID,using="incidentType")
	public WebElement dropdown_WhatHappened;
	
	@FindBy(how=How.ID,using="incidentDate")
	public WebElement textBox_IncidentDate;
	
	@FindBy(how=How.ID,using="addMore")
	public WebElement btn_AddAnotherIncident;
	
	@FindBy(how=How.ID,using="//*[@identity='rdDriverIncidents']/div/div/label")
	public WebElement checkbox_OhNoIncidents;
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
}
