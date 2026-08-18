# 🚗 Smart Garage

A simple **Java-based Smart Garage Billing System** that allows users to enter customer and vehicle details, select garage services, and generate a final bill.

## 📚 Features

* 👤 Customer & vehicle information
* 🔧 Multiple garage service selection
* 💰 Automatic bill calculation
* ⚠️ Basic exception handling
* 🧹 Proper resource handling using `finally`

## 🛠️ Concepts Used

* Java Classes & Objects
* Constructors
* Encapsulation
* Arrays
* Loops & Conditional Statements
* Getters & Setters
* Exception Handling
* Static Methods
* User Input using `Scanner`

## 📂 Structure

```text
Smart-Garage/
│
├── Customer.java
├── Service.java
├── BillCalculation.java
└── App.java
```

## 🔄 How It Works

```text
Customer Details
       ↓
Select Services
       ↓
Calculate Total
       ↓
Generate Final Bill
```

The `Customer` class stores customer and car details, while `Service` manages service information such as ID, name and price.
`BillCalculation` calculates the total price of the selected services, and `App` handles the complete user interaction and final bill generation.

## 🎯 Goal

To practice **Core Java concepts** by building a small real-world application with multiple classes working together.

> **Input → Select Services → Calculate → Generate Bill** 🚗💰
