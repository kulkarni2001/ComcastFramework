package com.comcast.crm.objectrepositaryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProductImgBtn;

	public WebElement getCreateProductImgBtn() {
		return createProductImgBtn;
	}
	
	

}
