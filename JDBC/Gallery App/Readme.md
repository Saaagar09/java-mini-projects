# 🖼️ GalleryApp (Java + JDBC + MySQL)

A simple **console-based Java application** that allows users to **store, retrieve, delete, and list images** using a MySQL database.

--------------------------------------------

## 📚 What This Project Demonstrates

- JDBC connectivity
- Handling binary data (images) using BLOB
- File input/output in Java
- Menu-driven console applications

--------------------------------------------

## 🚀 Features

- 📥 Insert image into database  
- 💾 Retrieve and save image to local system  
- 🗑️ Delete image by ID  
- 📋 List all stored images  
- 🔄 Interactive console menu  

--------------------------------------------

## 🛠️ Technologies Used

- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL
- File Handling (`FileInputStream`, `FileOutputStream`)

--------------------------------------------

## 📁 Project Structure

gallery-app/
│
├── GalleryApp.java
├── README.md
└── schema.sql (optional)


--------------------------------------------

## ⚙️ Prerequisites

Make sure you have:

- Java JDK (8 or above)
- MySQL Server installed
- MySQL Connector/J (JDBC Driver)

👉 Download MySQL Connector/J:  
https://dev.mysql.com/downloads/connector/j/

--------------------------------------------

## 🗄️ Database Setup

### Step 1: Create Database

```MySQL 

CREATE DATABASE gallery;
USE gallery;

### Step 2: Create Table

CREATE TABLE images (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    image LONGBLOB
);

--------------------------------------------

🔧 Configuration

Update database credentials in GalleryApp.java:

static final String URL = "jdbc:mysql://localhost:3306/gallery";
static final String USER = "root";
static final String PASSWORD = "password1";
--------------------------------------------

📌 Menu Options

===== GALLERY MENU =====
1. Insert Image
2. Save Image by ID
3. Delete Image
4. List Images
5. Exit

--------------------------------------------

🧠 How the Program Works

🔹 1. Insert Image
Takes image name and file path
Reads image using FileInputStream
Stores it in database as binary data (BLOB)

🔹 2. Save Image
Takes image ID
Retrieves image from database
Converts binary data into byte array
Saves it using FileOutputStream to a given folder

🔹 3. Delete Image
Deletes image from database using ID

🔹 4. List Images
Displays all image IDs and names stored in database

--------------------------------------------

⚠️ Important Notes

Folder path must exist before saving images
Use correct path format
Example (Windows): E:\\Images
Large images may consume more memory (byte array usage)

--------------------------------------------

❗ Common Errors

   Error	         Reason	                 Solution
SQL Exception	    DB not connected	    Check URL, username, password

File Not Found	    Wrong image path	    Provide correct file path

Empty path issue    Scanner newline bug	    Use sc.nextLine() after nextInt()

--------------------------------------------

🚀 Future Improvements
Use streaming instead of byte[] for large files
Add validations (file type, size)
--------------------------------------------

🙌 Author (SAGAR BOHARA )

This project is built for learning:

JDBC
File handling
Database operations in Java