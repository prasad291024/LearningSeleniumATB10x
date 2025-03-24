# Selenium UI Automation Project
**Author - Prasad Valiv**

## 📌 Project Overview
This repository contains an end-to-end UI automation framework using **Selenium with Java**. The framework is designed to be scalable, maintainable, and efficient for automating web applications. It follows industry best practices, integrates with CI/CD pipelines, and supports data-driven testing.

## 🛠️ Tech Stack
This project is built using the following tools and technologies:

- **Java** - Programming language for test scripts
- **Selenium WebDriver** - Browser automation
- **TestNG** - Test framework for parallel execution & reporting
- **Maven** - Dependency management and build automation
- **Allure Report** - Test execution reporting
- **Jenkins** - Continuous Integration & Continuous Deployment (CI/CD)
- **Git & GitHub** - Version control
- **Log4j** - Logging mechanism
- **Apache POI** - Data-driven testing (Excel-based test data management)
- **Test Data** - `TestData.xlsx` for parameterized tests

## 📂 Project Structure
```
├── src/test/java       # Test cases and test scripts
│   ├── testcases       # Contains test scripts for various scenarios
│   ├── utilities       # Utility classes (Excel, Config, Logs, etc.)
│   ├── base            # Base class with common setup and teardown methods
│   ├── listeners       # TestNG Listeners for reporting and logging
├── src/main/java       # Application-specific methods and configurations
├── test-output         # TestNG-generated reports
├── logs                # Log files for test execution
├── pom.xml             # Maven dependencies & project configurations
├── testng.xml          # Test suite execution configuration
├── README.md           # Project documentation
```

## ⚡ Getting Started
### 1️⃣ Clone the Repository
```sh
git clone [https://github.com/yourusername/your-repository.git](https://github.com/prasad291024/LearningSeleniumATB10x)
cd your-repository
```

### 2️⃣ Install Dependencies
Ensure **Maven** is installed and run:
```sh
mvn clean install
```

### 3️⃣ Configure Test Data & Environment
- Update `TestData.xlsx` for different test cases
- Modify `config.properties` for environment-specific settings

### 4️⃣ Run Test Cases
#### Execute all test cases using TestNG
```sh
mvn test
```
#### Run specific suite from `testng.xml`
```sh
mvn test -DsuiteXmlFile=testng.xml
```
#### Run tests in parallel
Modify `testng.xml` to set parallel execution.

### 5️⃣ Generate Reports
#### Allure Report
```sh
allure serve allure-results
```
#### TestNG Reports
Check `test-output/index.html`

## 🚀 CI/CD Integration
- **Jenkins:** Add `pom.xml` to Jenkins job and trigger build
- **GitHub Actions:** Can be configured for automated test execution

## 📖 Best Practices
✔ Follow **Page Object Model (POM)** for maintainability  
✔ Implement **Explicit Waits** instead of `Thread.sleep()`  
✔ Use **Data-Driven Testing** for scalability  
✔ Maintain logs using **Log4j** for better debugging  
✔ Execute tests in **headless mode** for faster runs  
✔ Use **CI/CD Pipelines** for automated execution

## 🔥 Contributing
1. Fork this repository
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Create a Pull Request

## 📌 Contact
For any issues or contributions, feel free to raise an **issue** or reach out to me. Happy Testing! 🎯

