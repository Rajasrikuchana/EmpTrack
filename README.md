# 🚀 EmpTrack

**EmpTrack** is a modern employee management system designed to streamline tracking, managing, and organizing employee details in an organization.  
This project aims to simplify administrative tasks and improve productivity through a clean interface and robust features.  
It implements full **CRUD operations using Spring Boot**.

---

## 📌 Features

- 🧑‍💼 Add, update, and delete employee records  
- 🔍 Search and filter employee details  
- 🗃️ Department and role-wise classification  
- 📁 File storage or resume upload support  
- 🔐 Authentication for secure access  

---

## 🛠️ Tech Stack

| Category         | Tools Used                                 |
|------------------|---------------------------------------------|
| Frontend         | HTML, Tailwind CSS, JavaScript, React, Bootstrap |
| Backend          | Spring Boot, Java                          |
| Database         | MySQL                                      |
| Version Control  | Git & GitHub                               |
| UI/UX Tools      | Figma (designs, mockups)                   |
| Testing          | Postman (API testing)                      |
| IDEs             | VS Code, IntelliJ IDEA                     |

---

## 📁 Folder Structure

EmpTrack/<br>
├── .idea/           # IDE settings (from IntelliJ IDEA)<br>
├── backend/         # Backend Spring Boot microservices<br>
├── frontend/        # Frontend React application<br>
├── .gitattributes   # Git settings<br>
└── README.md        # Project documentation<br>


--- 

## 📦 Getting Started

1. **Clone the Repository**

    ```bash
    git clone https://github.com/Rajasrikuchana/EmpTrack.git
    cd EmpTrack

2. **Set Up Database**

   Make sure MySQL is installed and running.

   Create a database:
   ```bash
   CREATE DATABASE database_name;

3. **Set Up the Backend (Spring Boot)**

   Update `application.properties/`
   Run the backend
   ```bash
   cd backend
   mvnw.cmd spring-boot:run

4. **Set Up the Frontend (React)**

   ```bash
   cd ../frontend
   npm install
   npm start

5. 🧪 **Test the API**

   Use **Postman** or any API client to test the backend REST API endpoints.

   | Method | Endpoint                | Description             |
   |--------|-------------------------|-------------------------|
   | GET    | `/api/employees`        | Get all employees       |
   | POST   | `/api/employees`        | Add a new employee      |
   | PUT    | `/api/employees/{id}`   | Update employee by ID   |
   | DELETE | `/api/employees/{id}`   | Delete employee by ID   |

---

## **🔮 Future Enhancements**

   Here are some potential improvements and features planned for future development:
- ✅ Implement role-based access control (Admin, Manager, Employee)

- 🔐 Track changes made by users (created, updated, deleted)

- 🌍 Multi-language support for global usage

- 📬 Send emails on employee onboarding/offboarding


---
## 🤝 Contributing

Contributions are welcome! Here's how you can help:

- 💡 Suggest new features
- 🐛 Report bugs or issues
- 🛠️ Submit pull requests

> Make sure your code follows the project’s style and passes all tests.

---

## ⚠️ Known Issues

- 🔐 Frontend is under development
- 🧪 No unit tests yet for backend services


---

## 🙋‍♀️ Maintainer

**Rajasri Kuchana**  
📧 [E-mail](mailto:rajasrikuchana@gmail.com)  
🌐 [GitHub Profile](https://github.com/Rajasrikuchana)

---

## 📄 License

This project is licensed under the **MIT License**.  
Feel free to use and modify with attribution.


