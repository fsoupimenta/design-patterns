```mermaid
classDiagram
    class Customer
    class Support
    class CustomerService
    class Manager
    class Department

    Customer --> CustomerService
    Manager --> CustomerService
    Support --> CustomerService
    Department <|.. Support

```