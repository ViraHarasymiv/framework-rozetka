## Automation testing stack using Java, Selenium, TestNG, and Maven. 
It consists of:
- 'Page Component Object Model' design pattern. 
-  reports, created with Allure framework. 

The target website is [ROZETKA](https://rozetka.com.ua/ua/)

Automated tests:
1. Checking sorting notebooks by the price. 
2. Checking filtering notebooks by the valid, invalid brand's name (negative test) and by the price range.
3. Checking comparing of two notebooks. 
4. Checking adding notebooks to the cart. 
5. Checking redirection to the password recovery modal from the login modal after clicking the "Нагадати пароль" button.
6. Checking the hide/show password button in the login form shows/hides the password for an odd/even number of clicks.
7. Checking redirection to the registration modal from the login modal after clicking the "Зареєструватися" button
8. Checking the error "Введено невірну адресу ел. пошти або номер телефону" in the authorization form when entering an email without a domain name

## Executing the Tests

- Clone the repository:
```shell
git clone https://github.com/Test-Automation-Crash-Course-24-10-22/team_16.git
```
- Run all tests:
```shell
mvn clean test
```
- Generate the report:
```shell
allure serve target/allure-results
```
- Execute [test-case #10](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/10):
```shell
mvn -Dtest=LoginValidationTests#checkErrorInvalidEmail test
```
- Execute [test-case #11](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/11):
```shell
mvn -Dtest=LoginButtonTests#checkOpenSignInModalAfterClickingOnSignInButton test
```
- Execute [test-case #12](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/12):
```shell
mvn -Dtest=LoginButtonTests#checkHideShowPasswordButtonShowsPasswordOnEvenNumberClicks test
```
- Execute [test-case #13](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/13):
```shell
mvn -Dtest=LoginButtonTests#checkHideShowPasswordButtonShowsPasswordOnOddNumberClicks test
```
- Execute [test-case #14](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/14):
```shell
mvn -Dtest=LoginButtonTests#checkOpenPasswordRecoveryFormAfterClickingOnRemindPasswordButton test
```
- Execute [test-case #21](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/21):
```shell
mvn -Dtest=NotebooksFilteringTest#checkNotebooksFilteringByValidBrandName test
```
- Execute [test-case #22](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/22):
```shell
mvn -Dtest=NotebooksFilteringTest#checkNotebooksFilteringByInvalidBrandName test
```
- Execute [test-case #23](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/23):
```shell
mvn -Dtest=NotebooksSortingTest#checkSortingFromLowerToHigherPrice test
```
- Execute [test-case #24](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/24):
```shell
mvn -Dtest=NotebooksSortingTest#checkSortingFromHigherToLowerPrice test
```
- Execute [test-case #25](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/25):
```shell
mvn -Dtest=NotebooksFilteringTest#checkNotebooksFilteringByPriceRange test
```
- Execute [test-case #36](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/36):
```shell
mvn -Dtest=ComparingNotebooksTest#checkTwoNotebooksComparing test
```
- Execute [test-case #37](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/37):
```shell
mvn -Dtest=AddingProductsToCartTest#checkAddingNotebookItemToCart test
```
- Execute [test-case #38](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/38):
```shell
mvn -Dtest=AddingProductsToCartTest#checkAddingMultipleNotebooksToCart test
```
- Execute [test-case #39](https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/39):
```shell
mvn -Dtest=AddingProductsToCartTest#checkNotebooksPriceInCart test
```
