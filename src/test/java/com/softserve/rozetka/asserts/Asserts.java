package com.softserve.rozetka.asserts;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class Asserts {

    @Step(value = "Check if all items are sorted from lower to higher price")
    public static void checkSortingFromLowerToHigherPrice(List<Integer> actualPrices, List<Integer> expectedPrices){
        Assert.assertTrue(actualPrices.equals(expectedPrices),
                "The actual prices are: " + actualPrices + ", but should be  " + expectedPrices);
    }

    @Step(value = "Check if all items are sorted from higher to lower price")
    public static void checkSortingFromHigherToLowerPrice(List<Integer> actualPrices, List<Integer> expectedPrices){
        Assert.assertTrue(actualPrices.equals(expectedPrices),
                "The actual prices are: " + actualPrices + ", but should be  " + expectedPrices);
    }

    @Step(value = "Check if all items of the typed valid brand's name are shown")
    public static void checkFilteringByValidBrandName(List<String>actualResults, String validBrandName){
        Assert.assertTrue(actualResults
                        .stream()
                        .allMatch(el -> el.contains(validBrandName.toLowerCase())),
                "Not all items titles contain " + validBrandName);
    }

    @Step(value = "Check if all items are filtered by the selected price range")
    public static void checkFilteringByPriceRange(List<Integer>actualResults, String minPrice, String maxPrice){
        Assert.assertTrue(actualResults
                        .stream()
                        .allMatch(element -> element >= Integer.parseInt(minPrice) && element <= Integer.parseInt(maxPrice)),
                "Items price range should be between " + minPrice + " and " + maxPrice);
    }

    @Step(value = "Check if brand's checkboxes are not shown under the 'Бренд' field")
    public static void checkFilteringByInvalidBrandName(List<WebElement>allCheckBoxes){
        Assert.assertTrue(allCheckBoxes.isEmpty(),
                "The brand's name is invalid. Brand checkboxes shouldn't be shown");
    }

    @Step(value = "Check if the items titles are equal to the selected to compare ones")
    public static void checkTwoItemsComparing(String firstProductTitle, String secondProductTitle, List<String> actualResults){
        Assert.assertTrue(firstProductTitle.contains(actualResults.get(1)) &&
                secondProductTitle.contains(actualResults.get(0)),
                "Products titles in the Comparison Page: " + actualResults.get(1) + " and " + actualResults.get(0)
        + "should be equal to the selected to compare ones: " + firstProductTitle + " and " + secondProductTitle);
    }

    @Step(value = "Check if the product's quantity in the cart icon is equal to 1 in the page header")
    public static void checkAddingOneItemToCart(String actualProductCountInCart, String expectedProductCountInCart){
        Assert.assertEquals(actualProductCountInCart, expectedProductCountInCart,
                "Expected product count in the cart should be equal to " + expectedProductCountInCart);
    }

    @Step(value = "Check if the product's quantity in the cart icon is equal to 3 in the page header")
    public static void checkAddingThreeItemsToCart(String actualProductCountInCart, String expectedProductCountInCart){
        Assert.assertEquals(actualProductCountInCart, expectedProductCountInCart,
                "Expected product count in the cart should be equal to " + expectedProductCountInCart);
    }

    @Step(value = "Check if the product's price in the cart modal is equal to the the added notebook's item price, " +
            "check if the product's quantity in the cart icon is equal to actual product's count, " +
            "check if the price in the cart modal is equal to the the added notebook's item price multiplied by its actual count")
    public static void checkItemPriceInCart(Integer expectedProductPrice, Integer actualProductPrice,
                                            String actualProductCount, String expectedProductCount,
                                            Integer actualChangedPrice, Integer expectedChangedPrice){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedProductPrice, actualProductPrice);
        softAssert.assertEquals(actualProductCount,expectedProductCount);
        softAssert.assertEquals(actualChangedPrice,expectedChangedPrice);
        softAssert.assertAll();
    }
}
