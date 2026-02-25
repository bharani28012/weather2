🌦 Weather Data Processing & API System
📌 Project Overview

This project processes a comprehensive dataset containing nearly two decades of weather forecast details for Delhi. The dataset includes:

Temperature

Humidity

Pressure

Heat Index

Weather Conditions

The system performs:

CSV data transformation and structured storage

Efficient data storage for retrieval

API development to access and filter weather details

The project is designed with modular code structure for scalability and maintainability.

📂 Dataset

File used: test.csv

The CSV file contains historical weather data for Delhi across 20 years.

Each record includes weather-related parameters such as temperature, humidity, pressure, heat index, date, and weather condition.

🛠 Technologies Used

Python / Java (mention what you used)

Flask / Spring Boot (if API built)

MySQL / PostgreSQL / MongoDB (your datastore)

Pandas (if used for CSV processing)

REST API

⚙️ Setup & Run Instructions
1️⃣ Clone the Repository
git clone https://github.com/your-username/weather-data-api.git
cd weather-data-api
2️⃣ Install Dependencies

If using Python:

pip install -r requirements.txt

If using Java (Spring Boot):

mvn clean install
3️⃣ Configure Database

Create a database:

CREATE DATABASE weather_db;

Update database configuration in:

application.properties (Spring Boot)
or

.env file (Flask)

Example:

DB_NAME=weather_db
DB_USER=root
DB_PASSWORD=your_password
4️⃣ Run the Application

For Python:

python app.py

For Spring Boot:

mvn spring-boot:run

Application runs at:

http://localhost:8080
🔄 Data Processing

The test.csv file is read and validated.

Data is cleaned and transformed into structured format.

Records are stored in the database.

Code is divided into modules:

Data ingestion

Data transformation

Database layer

API layer

🌐 API Endpoints
📅 1. Get Weather Details by Date

GET

/api/weather?date=YYYY-MM-DD

Returns:

Weather condition

Temperature

Humidity

Pressure

📆 2. Get Weather Details by Month

GET

/api/weather?month=MM&year=YYYY

Returns weather details for the specified month across dataset.

🌡 3. Monthly Temperature Statistics

GET

/api/weather/stats?year=YYYY

Returns for each month:

Highest temperature

Median temperature

Minimum temperature

🏗 Project Structure
weather-data-api/
│
├── test.csv
├── src/
│   ├── controllers/
│   ├── services/
│   ├── models/
│   ├── repository/
│   └── utils/
│
├── app.py / WeatherApplication.java
├── requirements.txt / pom.xml
└── README.md
📊 Features

✔ Modular code structure
✔ Efficient data storage
✔ RESTful API design
✔ Supports filtering by date and month
✔ Temperature statistical analysis

