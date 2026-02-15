# 🏥 PATIENT REGISTRATION SYSTEM

A Full Stack Patient Registration System built using **Spring Boot (Backend)** and **HTML, CSS, JavaScript (Frontend)**.  
This application allows users to register patients, view doctors, and manage patient records using REST APIs.

---

## 🚀 Technologies Used

### 🔹 Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

### 🔹 Frontend
- HTML5
- CSS3
- JavaScript (Fetch API)

---

## ✨ Features

✔ Add New Patient  
✔ View All Doctors  
✔ View Registered Patients  
✔ Store Data in MySQL Database  
✔ REST API Integration  
✔ Dynamic Table Rendering using JavaScript  
✔ Delete Patient Records  

---

## 📁 Project Structure

```
PATIENT_REGISTRATION_SYSTEM
│
├── README.md
│
├── PRSbackend
│   ├── src
│   │   └── main
│   │       └── java
│   ├── pom.xml
│   └── application.properties
│
└── PRSfrontend
    ├── index.html
    ├── style.css
    └── script.js
```

---

## ⚙️ Backend Setup (Spring Boot)

1. Open backend folder in IDE (IntelliJ / VS Code)
2. Configure MySQL in `application.properties`

Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/patientdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Run the Spring Boot application
4. Server runs on:

```
http://localhost:8080
```

---

## 🌐 Frontend Setup

1. Open `index.html` in browser  
OR  
2. Use Live Server extension (VS Code)

Make sure backend is running before using frontend.

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /doctors | Get all doctors |
| GET    | /patients | Get all patients |
| POST   | /register | Register new patient |
| DELETE | /patients/{id} | Delete patient |

---

## 🗄️ Database

Database Name:
```
patientdb
```

Tables:
- doctor
- patientregistry

---

## 📌 Future Improvements

- Add Doctor Registration
- Add Update Patient Feature
- Add Validation
- Add Authentication (Login System)
- Deploy to Cloud (Render / Railway / AWS)

---

## 👨‍💻 Author

**Thirumurugan**

GitHub: https://github.com/THIRUMURUGAN152005

---


