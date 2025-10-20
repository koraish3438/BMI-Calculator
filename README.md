# BMI-Calculator

A modern, intelligent, and user-friendly Body Mass Index (BMI) Calculator built in Kotlin using Android MVVM architecture.

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the App](#running-the-app)
- [Architecture & Design](#architecture--design)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Overview
The BMI-Calculator app allows users to calculate their BMI based on height and weight and receive personalized health feedback.  
It follows modern Android best practices with Kotlin and the MVVM architecture, ensuring maintainability and scalability.

---

## Features
- Enter height (cm) and weight (kg)
- Calculate BMI and view health category (underweight, normal, overweight, obese)
- Clean and responsive UI
- MVVM architecture
- Easily extensible for future features

---

## Tech Stack
- **Language:** Kotlin  
- **Platform:** Android  
- **Architecture:** MVVM (Model-View-ViewModel)  
- **UI Components:** Android Jetpack (ViewModel, LiveData)  
- **Build Tool:** Gradle  
- **Version Control:** GitHub  

---

## Screenshots

<table>
  <tr>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-18-12-15-16-98_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-18-12-15-20-87_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-18-22-55-51-23_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
  </tr>
  <tr>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-18-22-56-09-88_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-20-09-41-18-36_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator/raw/master/Screenshot_2025-10-20-09-41-25-17_d42a44d2d823efc0f8e6c3f45fce69f5.jpg" width="200"></td>
  </tr>
</table>
---

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android SDK
- Git

### Installation
1. Clone the repository:

git clone https://github.com/koraish3438/BMI-Calculator.git

## Architecture & Design
- **Model:** Contains BMI calculation logic.
- **ViewModel:** Processes user input, performs calculations, and exposes LiveData.
- **View (Activity/Fragment):** Observes ViewModel and updates UI.

**Benefits:**
- Clean separation of concerns
- Easy testing
- Scalable and maintainable code

---

## Usage
1. Launch the app.
2. Input height and weight.
3. Tap **Calculate**.
4. View BMI value and health category.

---

## Contributing
Contributions are welcome!  
1. Fork the repository
2. Create a branch (`feature/my-feature` or `bugfix/my-bug`)
3. Commit your changes
4. Submit a Pull Request

---

## License
This project is licensed under the **MIT License**. See [LICENSE](LICENSE) for details.

---

## Contact
**Developer:** Koraish3438  
**GitHub:** [https://github.com/koraish3438](https://github.com/koraish3438)  

Feel free to reach out with questions or feedback.
