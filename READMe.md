# ASSIGNMENT 1, 2

## 1. Payment Processing System

### Overview
This Java project is a flexible and maintainable payment processing system that supports multiple payment methods (e.g., Credit Card, PayPal, and Bank Transfer). The system is built using SOLID principles, ensuring that it can be easily extended to support new payment methods without modifying existing code.

### Features
- **Multiple Payment Methods**: Currently supports Credit Card, PayPal, and Bank Transfer payments.
- **Extendable Design**: New payment methods can be added by simply creating a new class that implements the `PaymentMethod` interface, adhering to the Open/Closed Principle.
- **Loose Coupling**: The system depends on abstractions (PaymentMethod interface) rather than concrete classes, ensuring flexibility and scalability.

### SOLID Principles Applied
- **Single Responsibility Principle (SRP)**: Each class has a focused responsibility, such as processing payments for a specific payment method or handling the payment process.
- **Open/Closed Principle (OCP)**: The system is open for extension but closed for modification. You can add new payment methods without altering existing code.
- **Liskov Substitution Principle (LSP)**: The system is designed so that any payment method class can be substituted without affecting the correctness of the program.
- **Interface Segregation Principle (ISP)**: The `PaymentMethod` interface contains only relevant methods needed for processing payments.
- **Dependency Inversion Principle (DIP)**: High-level classes like `PaymentProcessor` depend on abstractions (`PaymentMethod`) instead of concrete implementations.

### Project Structure
- **PaymentMethod (interface)**: Defines the structure for payment methods.
- **CreditCardPayment, PayPalPayment, BankTransferPayment**: Implement the `PaymentMethod` interface to process different types of payments.
- **PaymentProcessor**: Processes payments using any `PaymentMethod`.
- **Main**: The main class for running the system with different payment methods.

### How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Build the project to ensure all files are compiled.
4. Run the `Main` class to test different payment methods.

---

## 2. Notification System

### Overview
This project implements a flexible and maintainable notification system in Java, capable of sending notifications via multiple channels: SMS, Email, and Push Notification. The system is designed following SOLID principles, ensuring that new notification types can be easily added without modifying existing code. Additionally, the system supports sending bulk notifications to multiple recipients via any notification channel.

### Features
- **Multiple Notification Channels**: Currently supports sending notifications via SMS, Email, and Push Notification.
- **Extendable Design**: New notification channels (e.g., Slack, WhatsApp) can be added by simply implementing the `Notification` interface, without modifying existing code.
- **Bulk Notification Support**: The system can send notifications to multiple users in one go via any supported notification channel.

### SOLID Principles Applied
- **Single Responsibility Principle (SRP)**: Each notification class is responsible for sending notifications via a specific channel. The `NotificationService` class handles sending notifications in bulk.
- **Open/Closed Principle (OCP)**: The system is open for extension (adding new notification types) but closed for modification, ensuring that existing code doesn't need to change for new features.
- **Dependency Inversion Principle (DIP)**: The high-level `NotificationService` depends on the `Notification` interface, which decouples the system from specific notification types and ensures flexibility.

### Design Pattern Used
- **Factory Method**: This design pattern is used to handle the creation of different notification types. It centralizes object creation and makes it easy to extend the system by adding new notification channels.

### Project Structure
- **Notification (interface)**: Defines the `send(String message, String recipient)` method, which all notification types must implement.
- **SMSNotification, EmailNotification, PushNotification**: Concrete implementations of the `Notification` interface, each handling notifications via a specific channel.
- **NotificationService**: A service class responsible for sending notifications to single or multiple recipients using any notification type.
- **Factory Method**: Used to instantiate the correct notification type based on the user's choice.

### How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Build the project and run the `Main` class.

---

## 3. Document Creation System

### Overview
This project implements a flexible system for creating different types of documents, such as PDF and Word files, using the Factory Method design pattern. The system is designed to easily support the addition of new document types (e.g., Excel, PowerPoint) without changing the existing code. Each document type has its own creation process, ensuring that the system remains maintainable and extendable.

### Features
- **Supports Multiple Document Types**: Currently, the system can generate PDF and Word documents.
- **Easy Extensibility**: New document types can be added by creating new document classes and factories, without modifying the existing system.
- **Follows SOLID Principles**: The system adheres to the Open/Closed Principle, ensuring the system is open for extension but closed for modification.

### Design Pattern
- **Factory Method**: The creation logic for each document type is encapsulated in its own factory class. This allows for the flexible and scalable creation of different document types.

### Project Structure
- **Document (interface)**: Represents the common interface that all document types implement.
- **PDFDocument, WordDocument**: Concrete implementations of the `Document` interface, each handling the specific creation process for that type.
- **DocumentFactory (abstract class)**: Defines the factory method (`createDocument()`) for creating documents.
- **PDFDocumentFactory, WordDocumentFactory**: Concrete factories that instantiate PDF and Word documents, respectively.

### How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Build the project and run the `Main` class.

---

## 4. Theme Selection System

### Overview
This project implements a theme selection system using the Abstract Factory design pattern in Java. It allows users to choose between different themes (Light Theme and Dark Theme) and displays the corresponding UI components (buttons and checkboxes).

### Features
- **Theme Options**: Choose between Light and Dark themes.
- **Modular Design**: Each theme has its own specific components.
- **Extensibility**: Easily add new themes without modifying existing code.

### Technologies Used
- Java

### Structure
The project is structured into several classes:
- **Interfaces**:
    - `Button`: Interface for button components.
    - `Checkbox`: Interface for checkbox components.
- **Concrete Components**:
    - `LightButton`: Light-themed button implementation.
    - `LightCheckbox`: Light-themed checkbox implementation.
    - `DarkButton`: Dark-themed button implementation.
    - `DarkCheckbox`: Dark-themed checkbox implementation.
- **Factory Interfaces**:
    - `ThemeFactory`: Abstract factory interface for creating components.
- **Concrete Factories**:
    - `LightThemeFactory`: Factory for creating light-themed components.
    - `DarkThemeFactory`: Factory for creating dark-themed components.
- **Main Class**:
    - `Main`: Entry point of the application that interacts with the user and displays the chosen theme components.

### How It Works
1. The user is prompted to select a theme (1 for Light Theme or 2 for Dark Theme).
2. The program instantiates the corresponding factory based on the user's choice.
3. The selected factory creates the theme-specific components (button and checkbox).
4. The program displays the names of the created components in the console.

### How to Run
1. Clone this repository.
2. Navigate to the project directory.
3. Compile the Java files:
   ```bash
   javac *.java
