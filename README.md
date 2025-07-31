# EIST Project Repository

This repository contains a collection of Java projects for the course "Einführung in die Softwaretechnik" (EIST) at the Technical University of Munich (TUM).

## About
This repository is a workspace for various EIST exercises, assignments, and exam preparation tasks. Each subfolder represents a separate Java project, typically corresponding to a specific exercise, homework, or exam topic. The projects cover a wide range of software engineering concepts, including:
- Object-oriented programming
- Design patterns
- Testing and mocking
- Gradle build management
- Java application structure
- Group and individual assignments

## 📚 Course Content

### Topics Covered
- **Object-Oriented Programming:** Classes, inheritance, interfaces, polymorphism
- **Design Patterns:** Bridge, Observer, Strategy, Adapter, and more
- **Data Structures & Algorithms:** Arrays, lists, recursion, searching, sorting
- **Java GUI Development:** Swing and JavaFX applications
- **File I/O and Exception Handling**
- **Testing and Mocking:** JUnit and test-driven development
- **Build Automation:** Gradle usage and configuration

### Example Projects

- **H01E02-Object-Oriented-Programming-Exercise:**  
  Practice core OOP concepts such as classes, inheritance, and encapsulation through hands-on Java exercises.

- **ExamSystem (eist22l06e03-ge42bax):**  
  Explore the Bridge design pattern and hashing strategies by implementing a system that hashes exam files using different algorithms.

- **Temperature Application (eist22l07e03-ge42bax):**  
  Build a multi-GUI temperature converter using the Observer pattern, with real-time updates across Celsius, Fahrenheit, Kelvin, and graphical views.

- **University App (eist22l10e03-ge42bax):**  
  Develop a simple JavaFX application simulating university system interactions, including GUI controls and logging.

- **PEV Rental System (eist22l12e02-ge42bax):**  
  Model a personal electric vehicle (PEV) rental system, including riders, rentals, and observer pattern for notifications.

- **Tutor Group Management (eist22l11e02-ge42bax):**  
  Simulate tutor group meetings, student registration, and skill practice, focusing on OOP and group management logic.

- **Search Strategies (eist22h07e01-ge42bax):**  
  Implement and compare linear and binary search algorithms using the Strategy pattern.

*...and many more, each focusing on a specific concept or pattern in software engineering!*

## Structure
- Each directory (e.g., `eist22exambridgepatterntest-ge42bax`, `eist22h01e02-ge42bax`, etc.) is a standalone Java project.
- Most projects use Gradle for build and dependency management.
- Some projects include test directories with example unit tests.

## Technologies Used
- Java (various versions, typically Java 8+)
- Gradle (for building and dependency management)
- JUnit (for testing, in some projects)

## Getting Started
1. **Clone the repository:**
   ```sh
   git clone https://github.com/tusharkh12/eist.git
   cd eist
   ```
2. **Open in your favorite IDE** (e.g., IntelliJ IDEA, Eclipse, VS Code).
3. **Navigate to a project folder** and use Gradle to build and run the project:
   ```sh
   cd eist22h01e02-ge42bax
   ./gradlew build
   ./gradlew run
   ```
   (On Windows, use `gradlew.bat` instead of `./gradlew`.)

## Contributing
This repository is primarily for educational purposes and personal study. Contributions are welcome for improvements, bug fixes, or additional documentation.

## License
This repository is intended for educational use. Please respect the academic integrity policies of your institution.

---

If you have any questions or suggestions, feel free to open an issue or contact the maintainer.