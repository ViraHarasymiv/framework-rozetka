## Automation testing stack using Java, Selenium, TestNG, and Maven. 
It consists of:
- 'Page Component Object Model' design pattern. 
-  reports, created with Allure framework. 

The target website is https://rozetka.com.ua/ua/

Automated tests:
1. Checking sorting notebooks by price.
2. Checking filtering notebooks by the valid and invalid brand's name (negative test example).
3. Checking filtering notebooks by the price range.

## Executing the Tests

- Clone the repository.

```shell
git clone https://github.com/Test-Automation-Crash-Course-24-10-22/team_16.git
```

- Run the test.

```shell
mvn clean test
```

- Generate the report.

```shell
allure serve target/allure-results
```
