## Automation testing stack using Java, Selenium, TestNG, and Maven. 
It consists of:
- 'Page Component Object Model' design pattern. 
-  reports, created with Allure framework. 

The target website is https://rozetka.com.ua/ua/

Automated tests:
1. Checking sorting notebooks by price.
2. Checking filtering notebooks by the valid and invalid brand's name (negative test example).
3. Checking filtering notebooks by the price range.
4. Checking redirection to the password recovery modal from the login modal after clicking the "Нагадати пароль" button.
5. Checking the hide/show password button in the login form shows/hides the password for an odd/even number of clicks.
6. Checking redirection to the registration modal from the login modal after clicking the "Зареєструватися" button
7. Checking the error "Введено невірну адресу ел. пошти або номер телефону" in the authorization form when entering an email without a domain name

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
