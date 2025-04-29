# 🧪 UI Test Automation Framework

A Java-based, extensible **UI Test Automation Framework** built using **Page Object Model (POM)**, **TestNG**, and JSON-based configuration. This structure separates concerns between test data, page locators, and validation logic for better maintainability and scalability.

---

## 📁 Project Structure

```
.
├── logs/                          # Execution logs
│   └── application.log
├── pom.xml                        # Maven build configuration
├── src/
│   ├── main/
│   │   ├── configuration/         # JSON-based locator and validator configs
│   │   │   ├── homePage.json
│   │   │   ├── loginPage.json
│   │   │   ├── registerPage.json
│   │   │   └── validators/
│   │   │       ├── home.json
│   │   │       ├── login.json
│   │   │       └── register.json
│   │   ├── java/
│   │   │   ├── Example.java       # Sample usage/demo file
│   │   │   ├── testing/
│   │   │   │   ├── interfaces/    # Common interaction interfaces
│   │   │   │   │   └── baseActions.java
│   │   │   │   ├── pages/         # Page Object classes
│   │   │   │   │   ├── BasePage.java
│   │   │   │   │   ├── HomePage.java
│   │   │   │   │   ├── LoginPage.java
│   │   │   │   │   ├── RegisterPage.java
│   │   │   │   │   └── validators/ # Page validator classes
│   │   │   │   │       ├── ValidHomePage.java
│   │   │   │   │       ├── ValidLoginPage.java
│   │   │   │   │       └── ValidRegisterPage.java
│   │   │   │   └── register/      # Register form data management
│   │   │   │       ├── RegisterForm.java
│   │   │   │       ├── RegisterLocators.java
│   │   │   │       └── RegisterMapper.java
│   │   │   └── util/              # Utilities for JSON and locator loading
│   │   │       ├── JsonLoader.java
│   │   │       └── LocatorLoader.java
│   │   └── resources/
│   │       ├── logback.xml       # Logback logging config
│   │       └── test-data/
│   │           └── registeredInfo.json  # Test data for registration
│   └── test/
│       ├── java/                 # Test cases
│       │   ├── TestCase1.java
│       │   ├── TestCase2.java
│       │   └── TestCase26.java
│       └── suits/               # TestNG XML suite
│           └── test_suit_1.xml
```

---

## 🛠️ Features

- ✅ Page Object Model (POM) architecture
- ✅ JSON-based locator and validation configuration
- ✅ DTO and Mapper usage for form abstraction
- ✅ Modular test execution using TestNG
- ✅ Detailed logging via Logback
- ✅ Easy test data configuration and reuse

---

## 🚀 How to Run

### Prerequisites
- Java 11+
- Maven installed

### Build the project
```bash
mvn clean compile
```

### Run test suite
```bash
mvn test -DsuiteXmlFile=src/test/suits/test_suit_1.xml
```

### View logs
Execution logs are stored in:
```
logs/application.log
```

---

## 📦 Components Overview

| Component               | Purpose |
|------------------------|---------|
| `BasePage`             | Parent class for all page actions (click, sendKeys, etc.) |
| `JsonLoader`, `LocatorLoader` | Load JSON-based locators and validators |
| `RegisterForm`         | DTO for test form data |
| `Valid*Page.java`      | Page-level validation and assertions |
| `TestCase*.java`       | TestNG test cases |
| `*.json` (in configuration/) | Stores selectors and validation rules |

---

## ➕ Adding a New Page

1. **Create locators file** under `configuration/`
2. **Create validator JSON** under `configuration/validators/`
3. **Create Page Object class** under `testing/pages/`
4. **Create validator class** under `testing/pages/validators/`
5. **Write test case** under `src/test/java/`

---

## 📌 To-Do / Future Enhancements

- Integrate Allure for test reporting
- Add parallel execution support
- Connect to MongoDB for external test data and locator management
- Browser configuration through external properties

---

## 👨‍💻 Author

_Yousef Mohamed / Eagle0Eye

---
