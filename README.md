# Task Managment

## Description
This is a small task managment system based in GTD the main objective is to create a little program that can do that
to do more easy for me and because is more useful to reuse the code my main objective is to create one or two small classes
that can be used to task Managment

## Technologies Used
- **Java**
- **Gradle** (Build Automation)
- **JUnit 5.8.1** (Testing Framework)

## Requirements
- **Java Development Kit (JDK) 17 or higher** I used JDK 23
- **Gradle** (Ensure it's installed or use the wrapper)

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/mesteryui/Task_Managmet.git
   cd Task_Managmet
   ```
2. Build the project using Gradle:
   ```sh
   ./gradlew build
   ```
3. Run the application:
   ```sh
   ./gradlew run
   ```

## Running Tests
To execute unit tests with JUnit 5.8.1, run:
```sh
./gradlew test
```

## Project Structure
```
/Task_Managment
│── src/
│   ├── main/java/org/main/ 
│   ├── main/java/org/taskmanagment/
│   ├── test/java/org/taskmanagment/
│── build.gradle
│── settings.gradle
│── README.md
```
## Objectives
This is a list of objectives that I want to achieve to do something that can be useful
- [ ] Scan the tasks for TaskList from a file with Tasks, specially something with structure as an XML or JSON.
- [ ] Save the tasks in the file when the program closes and if the file isn't exists create it.
## Contributing
Feel free to submit issues and pull requests.

## License

[GPL 3.0](LICENSE)
