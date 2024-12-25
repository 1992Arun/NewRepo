package org.newpack;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POMClass extends Search {
	
	POMClass(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	private WebElement search;
	
	
	 @FindBys({ @FindBy(xpath="//input[@class='gNO89b']")})
	private List<WebElement> searchbutton;
	 
	 @FindBy(xpath="//div[text()='Images']")
	 private WebElement imgbutton;
	 
	 @FindBys( { @FindBy(xpath="//div[@jsname='dTDiAc']") })
	 private List<WebElement> images;

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public List<WebElement> getSearchbutton() {
		return searchbutton;
	}

	public void setSearchbutton(List<WebElement> searchbutton) {
		this.searchbutton = searchbutton;
	}

	public WebElement getImgbutton() {
		return imgbutton;
	}

	public void setImgbutton(WebElement imgbutton) {
		this.imgbutton = imgbutton;
	}

	public List<WebElement> getImages() {
		return images;
	}

	public void setImages(List<WebElement> image) {
		this.images = image;
	}
			 
	
	
	

}
