package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;

    public void mouseHoverOnWomenMenuTab() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Women Menu Tab");
        Reporter.log("Mouse Hover On Women Menu Tab " + WomenMenuOption.toString());
        mouseHoverToElement(WomenMenuOption);

    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;
    public void mouseHoverOnWomenTopMenuOption() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Women Top Menu Option");
        Reporter.log("Mouse Hover On Women Top Menu Option " + mouseHoverOnTopMenuOption.toString());
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;
    public void setJacketsOption() {
        CustomListeners.test.log(Status.PASS,"Set Jackets Option");
        Reporter.log("Set Jackets Option " + jacketsOption.toString());
        clickOnElement(jacketsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;
    public void productSortByProductName(String product) {
        CustomListeners.test.log(Status.PASS,"Products Sort By Product Name");
        Reporter.log("Products Sort By Product Name " + sortProductNameInDropDownOption.toString());
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;
    public void mouseHoverOnMenMenuTab() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Men Menu Tab");
        Reporter.log("Mouse Hover On Men Menu Tab " + menMenuOption.toString());
        mouseHoverToElement(menMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;

    public void mouseHoverOnMenBottomsMenuOption() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Men Bottoms Menu Option");
        Reporter.log("Mouse Hover On Men Bottoms Menu Option " + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;
    public void setPantsOption() {
        CustomListeners.test.log(Status.PASS,"Set Pants Option");
        Reporter.log("Set Pants Option " + pantsOption.toString());
        clickOnElement(pantsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;
    public void mouseHoverOnMenPantsProductNameOption() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Men Pants Product Name Option");
        Reporter.log("Mouse Hover On Men Pants Product Name Option " + mouseHoverOnProductNameOption.toString());
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Product Name Cronus Yoga Pant And Click On Size Option");
        Reporter.log("Mouse Hover On Product Name Cronus Yoga Pant And Click On Size Option " + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        CustomListeners.test.log(Status.PASS,"mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption");
        Reporter.log("mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption " + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        CustomListeners.test.log(Status.PASS,"mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption");
        Reporter.log("mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption " + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;
    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        CustomListeners.test.log(Status.PASS,"youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText");
        Reporter.log("youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText " + addedToYourShoppingCartMethodText.toString());
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;
    public void clickOnShoppingCartOption() {
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCartOption");
        Reporter.log("clickOnShoppingCartOption " + pantsOption.toString());

        clickOnElement(pantsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;
    public String shoppingCartText() {
        CustomListeners.test.log(Status.PASS,"shoppingCartText");
        Reporter.log("shoppingCartText " + shoppingCartTextMethod.toString());
        return getTextFromElement(shoppingCartTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;
    public String cronusPantText() {
        CustomListeners.test.log(Status.PASS,"cronusPantText");
        Reporter.log("cronusPantText " + pantTextMethod.toString());
        return getTextFromElement(pantTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;
    public String verifySizeText() {
        CustomListeners.test.log(Status.PASS,"verifySizeText");
        Reporter.log("verifySizeText " + sizeTextMethod.toString());
        return getTextFromElement(sizeTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;
    public String verifyColourOfPantText() {
        CustomListeners.test.log(Status.PASS,"verifyColourOfPantText");
        Reporter.log("verifyColourOfPantText " + colourTextMethod.toString());
        return getTextFromElement(colourTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;
    public void mouseHoverOnGearMenuOption() {
        CustomListeners.test.log(Status.PASS,"mouseHoverOnGearMenuOption");
        Reporter.log("mouseHoverOnGearMenuOption " + mouseHoverOnGearOption.toString());
        mouseHoverToElement(mouseHoverOnGearOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;
    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        CustomListeners.test.log(Status.PASS,"mouseHoverOnGearMenuAndClicksOnBagsOption");
        Reporter.log("mouseHoverOnGearMenuAndClicksOnBagsOption " + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;
    public void clickODuffleBagOption() {
        CustomListeners.test.log(Status.PASS,"clickODuffleBagOption");
        Reporter.log("clickODuffleBagOption " + duffleBagOption.toString());
        clickOnElement(duffleBagOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    public String verifyOvernightDuffleText() {
        CustomListeners.test.log(Status.PASS,"verifyOvernightDuffleText");
        Reporter.log("verifyOvernightDuffleText " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        CustomListeners.test.log(Status.PASS,"quantitySpaceOption");
        Reporter.log("quantitySpaceOption " + quantityOption.toString());

        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;
    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        CustomListeners.test.log(Status.PASS,"verifyYouAddedOvernightDuffleToYourShoppingCartText");
        Reporter.log("verifyYouAddedOvernightDuffleToYourShoppingCartText " + youAddedText.toString());
        return getTextFromElement(youAddedText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;
    public void clickOnShoppingCartLinkOption() {
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCartLinkOption");
        Reporter.log("clickOnShoppingCartLinkOption " + cartOption.toString());
        clickOnElement(cartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;
    public String verifyOvernightDuffleTextMethod() {
        CustomListeners.test.log(Status.PASS,"verifyOvernightDuffleTextMethod");
        Reporter.log("verifyOvernightDuffleTextMethod " + nightDuffleText.toString());
        return getTextFromElement(nightDuffleText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;
    public String verifyQuantityText() {
        CustomListeners.test.log(Status.PASS,"verifyQuantityText");
        Reporter.log("verifyQuantityText " + qtyText.toString());
        return getTextFromElement(qtyText);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;
    public String verifyProductPrice() {
        CustomListeners.test.log(Status.PASS,"verifyProductPrice");
        Reporter.log("verifyProductPrice " + priceText.toString());
        return getTextFromElement(priceText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;
    public void quantityUpdateText() {
        CustomListeners.test.log(Status.PASS,"quantityUpdateText");
        Reporter.log("quantityUpdateText " + qtyOption.toString());
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;
    public void clickOnShoppingCartButtonOption() {
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCartButtonOption");
        Reporter.log("clickOnShoppingCartButtonOption " + shopCartOption.toString());
        clickOnElement(shopCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;
    public String verifyUpdatedPriceText() {
        CustomListeners.test.log(Status.PASS,"verifyUpdatedPriceText");
        Reporter.log("verifyUpdatedPriceText " + priceTextMethod.toString());
        return getTextFromElement(priceTextMethod);
    }
}
