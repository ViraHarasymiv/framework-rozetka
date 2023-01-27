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

5. Checking sorting computers by the price.
6. Checking filtering computers by the valid, invalid brand's name (negative test) and by the price range.
7. Checking comparing of two computers.
8. Checking adding computers to the cart.

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


