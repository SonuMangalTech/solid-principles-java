# SOLID Principles in Java

A practical Java project demonstrating the **SOLID principles** using real-world **E-Commerce examples**.

The goal of this repository is to understand not only the definition of each SOLID principle, but also **why a design violates the principle, how to identify the problem, and how to refactor it into a clean and maintainable design**.

---

## 📚 What is SOLID?

**SOLID** is a set of five object-oriented design principles that help developers build software that is:

* Easy to understand
* Easy to maintain
* Easy to test
* Easy to extend
* Loosely coupled
* Less prone to breaking existing functionality

### SOLID stands for:

| Principle | Full Name                       |
| --------- | ------------------------------- |
| **S**     | Single Responsibility Principle |
| **O**     | Open/Closed Principle           |
| **L**     | Liskov Substitution Principle   |
| **I**     | Interface Segregation Principle |
| **D**     | Dependency Inversion Principle  |

---

# 🛒 E-Commerce Domain

The examples in this project use an E-Commerce domain so that the principles can be understood using practical business scenarios.

Common entities and components include:

```text
Customer
Product
Order
Payment
Discount
Inventory
Notification
Shipment
Repository
```

---

# 📂 Project Structure

```text
solid-principles-java/
│
├── 01-SRP-Single-Responsibility/
│   ├── problem/
│   └── solution/
│
├── 02-OCP-Open-Closed/
│   ├── problem/
│   └── solution/
│
├── 03-LSP-Liskov-Substitution/
│   ├── problem/
│   └── solution/
│
├── 04-ISP-Interface-Segregation/
│   ├── problem/
│   └── solution/
│
├── 05-DIP-Dependency-Inversion/
│   ├── problem/
│   └── solution/
│
└── 06-Final-Ecommerce-SOLID/
```

Each principle contains:

```text
Problem
   ↓
SOLID Violation
   ↓
Refactoring
   ↓
Solution
```

---

# 1️⃣ Single Responsibility Principle — SRP

### Definition

> A class should have only one reason to change.

### Problem

An `OrderService` is responsible for:

* Creating an order
* Processing payment
* Calculating discount
* Sending notifications

```java
public class OrderService {

    void createOrder(Order order) {
        // Create order
    }

    void processPayment(Order order) {
        // Process payment
    }

    void calculateDiscount(Order order) {
        // Calculate discount
    }

    void sendNotification(Order order) {
        // Send notification
    }
}
```

The class has multiple responsibilities and therefore multiple reasons to change.

### Solution

Separate responsibilities:

```text
OrderService
PaymentService
DiscountService
NotificationService
```

Each class now has a focused responsibility.

### Benefit

* Easier maintenance
* Easier testing
* Lower coupling
* Better readability

---

# 2️⃣ Open/Closed Principle — OCP

### Definition

> Software entities should be open for extension but closed for modification.

### Problem

A discount service contains multiple `if-else` conditions:

```java
if ("PREMIUM".equals(userType)) {
    return amount * 0.20;
} else if ("CORPORATE".equals(userType)) {
    return amount * 0.40;
} else if ("EMPLOYEE".equals(userType)) {
    return amount * 0.50;
}
```

Whenever a new discount type is introduced, the existing class must be modified.

### Solution

Create a `Discount` abstraction:

```java
public interface Discount {

    double calculateDiscount(Order order);
}
```

Different discount types implement the interface:

```text
Discount
   │
   ├── PremiumDiscount
   ├── CorporateDiscount
   ├── EmployeeDiscount
   └── NormalDiscount
```

Adding a new discount doesn't require modifying the existing discount logic.

### Benefit

* Easy extension
* Reduced modification of existing code
* Better maintainability
* Supports Strategy Pattern

---

# 3️⃣ Liskov Substitution Principle — LSP

### Definition

> Objects of a parent type should be replaceable with objects of its child type without breaking the application.

### Problem

Suppose every `Payment` is expected to support both payment and refund:

```java
public abstract class Payment {

    abstract void pay(Order order);

    abstract void refund(Order order);
}
```

But a particular payment implementation doesn't support refunds:

```java
public class GiftCardPayment extends Payment {

    @Override
    public void pay(Order order) {
        // Payment
    }

    @Override
    public void refund(Order order) {
        throw new UnsupportedOperationException();
    }
}
```

Now:

```java
Payment payment = new GiftCardPayment();

payment.refund(order);
```

causes a runtime exception.

The child cannot safely substitute the parent.

### Solution

Keep the base abstraction limited to behavior common to all payment types:

```java
public interface Payment {

    void pay(Order order);
}
```

Refund capability is separated:

```java
public interface Refundable {

    void refund(Order order);
}
```

Now:

```text
Payment
   │
   ├── CreditCardPayment
   ├── UpiPayment
   └── GiftCardPayment

Refundable
   │
   ├── CreditCardPayment
   └── UpiPayment
```

A payment implementation only supports capabilities that are valid for it.

### Benefit

* No unexpected runtime behavior
* Safe substitution
* Clear contracts
* Better object-oriented design

---

# 4️⃣ Interface Segregation Principle — ISP

### Definition

> Clients should not be forced to depend on methods they do not use.

### Problem

A large interface contains unrelated operations:

```java
public interface WarehouseOperation {

    void addProduct(Product product);

    void removeProduct(Product product);

    void importInventory();

    void exportInventory();
}
```

A warehouse implementation that doesn't support import/export is still forced to implement those methods.

### Solution

Split the large interface into smaller interfaces:

```java
public interface InventoryManager {

    void addProduct(Product product);

    void removeProduct(Product product);
}
```

```java
public interface InventoryImporter {

    void importInventory();
}
```

```java
public interface InventoryExporter {

    void exportInventory();
}
```

Classes implement only the interfaces they actually need.

### Benefit

* Smaller interfaces
* Less coupling
* No unnecessary methods
* Easier implementation and testing

---

# 5️⃣ Dependency Inversion Principle — DIP

### Definition

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

### Problem

`OrderService` directly creates a concrete payment implementation:

```java
public class OrderService {

    private final CreditCardPayment payment =
            new CreditCardPayment();
}
```

Now `OrderService` is tightly coupled to `CreditCardPayment`.

### Solution

Create an abstraction:

```java
public interface Payment {

    void pay(Order order);
}
```

Then inject the dependency:

```java
public class OrderService {

    private final Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void placeOrder(Order order) {
        payment.pay(order);
    }
}
```

Now `OrderService` can work with:

```text
Payment
   │
   ├── CreditCardPayment
   ├── UpiPayment
   └── PaypalPayment
```

### Benefit

* Loose coupling
* Easy testing
* Easy replacement of implementations
* Supports Dependency Injection

---

# 🏗️ Final E-Commerce Application

After understanding each principle separately, the final module combines all five SOLID principles.

### Order Flow

```text
Customer
   │
   ▼
OrderController
   │
   ▼
OrderService
   │
   ├── Discount
   │
   ├── Payment
   │
   ├── InventoryService
   │
   ├── NotificationService
   │
   └── OrderRepository
```

### Design

```text
                    ┌─────────────────┐
                    │  OrderService   │
                    └────────┬────────┘
                             │
             ┌───────────────┼────────────────┐
             │               │                │
             ▼               ▼                ▼
        Discount          Payment       OrderRepository
        Interface         Interface        Interface
             │               │                │
       ┌─────┼─────┐     ┌───┼────┐           │
       ▼     ▼     ▼     ▼   ▼    ▼           ▼
    Premium Corp Employee Card UPI PayPal   MySQL
```

The final application is designed around abstractions and follows the five SOLID principles.

---

# 🎯 SOLID Principles in the Final Project

| Principle | Implementation                                                                              |
| --------- | ------------------------------------------------------------------------------------------- |
| **SRP**   | Separate services for order, payment, discount, inventory and notification                  |
| **OCP**   | New discount/payment implementations can be added without modifying existing business logic |
| **LSP**   | Payment implementations can safely replace the `Payment` abstraction                        |
| **ISP**   | Small, focused interfaces instead of large interfaces                                       |
| **DIP**   | High-level services depend on interfaces rather than concrete implementations               |

---

# 🔧 Technologies

The examples are implemented using:

* Java
* Object-Oriented Programming
* Interfaces
* Abstraction
* Polymorphism
* Composition
* Dependency Injection concepts
* SOLID Principles

The final application can be extended with:

* Spring Boot
* Spring Data JPA
* MySQL
* REST APIs
* JUnit 5
* Mockito

---

# 🎓 Learning Objectives

After completing this project, you should be able to:

* Understand each SOLID principle
* Identify SOLID violations in existing code
* Refactor tightly coupled code
* Design loosely coupled Java applications
* Use interfaces effectively
* Apply Strategy Pattern
* Apply Dependency Injection
* Write maintainable and testable code
* Explain SOLID principles with real-world examples during interviews

---

# 💡 Interview Perspective

Instead of memorizing SOLID definitions, this project follows:

```text
Problem
   ↓
Why is the design bad?
   ↓
Which SOLID principle is violated?
   ↓
How can we refactor it?
   ↓
What benefits do we get?
```

This makes the principles easier to understand and explain in real-world software engineering interviews.

---

# 🚀 Future Enhancements

* Convert final project to Spring Boot
* Add REST APIs
* Add database persistence
* Add unit tests
* Add integration tests
* Add Docker support
* Add Kafka for order events
* Add Redis for caching
* Add API documentation using Swagger/OpenAPI

---

## Author
**Sonu Mangal**
---

⭐ If this repository helps you understand SOLID principles, consider giving it a star.
