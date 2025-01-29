
---

# HealthApp

HealthApp is a simple Android app built using Kotlin that helps track basic health metrics like heart rate, steps, and water intake. The app follows the MVVM architecture and uses `LiveData` and `ViewModel` to handle UI updates. This app can be extended to include advanced features such as integrating with fitness APIs, sensors, or storing data in a database.

---

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Project Setup](#project-setup)
3. [Running the App](#running-the-app)
4. [Folder Structure](#folder-structure)
5. [App Features](#app-features)
6. [Troubleshooting](#troubleshooting)
7. [Contributing](#contributing)

---

## Prerequisites

Before setting up the project, ensure you have the following installed:

- **Android Studio**: Download from [here](https://developer.android.com/studio)
- **JDK (Java Development Kit)**: Ensure JDK 8 or higher is installed.
- **Kotlin Plugin**: Should be included by default with Android Studio.
- **Android Emulator or Physical Device**: You can run the app on an emulator or connect a real Android device for testing.

---

## Project Setup

Follow these steps to set up the project on your local machine:

1. **Clone the Repository**  
   Open your terminal or Git Bash and clone the repository:

   ```bash
   git clone https://github.com/your-username/HealthApp.git
   cd HealthApp
   ```

2. **Open the Project in Android Studio**  
   Open Android Studio and select **Open an Existing Project**. Navigate to the folder where the project was cloned and select the project folder.

3. **Sync Gradle**  
   Once Android Studio opens the project, it will automatically detect the Gradle configuration and ask you to sync the project. If it doesn't, click **File** > **Sync Project with Gradle Files**.

4. **Check for Dependencies**  
   In the `build.gradle` (App Module) file, make sure the dependencies are correct. If you're facing issues with dependencies, try updating them to the latest versions that are compatible with your Android Studio version.

5. **Build the Project**  
   Click on the **Build** option at the top of Android Studio to compile the app. If you face any issues during this step, check the **Logcat** (located at the bottom of Android Studio) for specific errors.

---

## Running the App

1. **Start an Emulator**  
   Open the **AVD Manager** (Android Virtual Device) in Android Studio and start an emulator that matches the minimum SDK version required (SDK 21 or higher). Alternatively, you can use a physical Android device for testing.

2. **Run the App**  
   Click on the **Run** button (a green triangle) at the top of Android Studio. The app should start on your emulator or connected device.

3. **App UI**  
   The app should display three health metrics:  
   - Heart Rate
   - Steps
   - Water Intake

---

## Folder Structure

Here's the project structure for HealthApp:

```text
HealthApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── healthapp/
│   │   │   │           ├── data/
│   │   │   │           │   ├── HealthRepository.kt
│   │   │   │           ├── ui/
│   │   │   │           │   ├── HealthActivity.kt
│   │   │   │           │   ├── HealthViewModel.kt
│   │   │   │           ├── model/
│   │   │   │           │   ├── HealthData.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_health.xml
│   │   │   ├── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

---

## App Features

1. **Health Data Display**  
   The app displays three basic health metrics:
   - **Heart Rate**: Displayed in beats per minute (BPM).
   - **Steps**: Displayed as the total step count.
   - **Water Intake**: Displayed in milliliters.

2. **LiveData & ViewModel**  
   The app uses `LiveData` to observe changes in health data and update the UI using `ViewModel`. This ensures separation of concerns and follows the MVVM architecture.

3. **Repository Pattern**  
   The `HealthRepository` class fetches the health data. Currently, the data is hardcoded, but you can replace it with data fetched from sensors or APIs in future updates.

---

## Troubleshooting

If something goes wrong during setup or running the app, here’s how you can fix common issues:

### 1. **Gradle Sync Issues**
   - **Issue**: Gradle fails to sync or displays errors related to dependencies.
   - **Solution**: Check for updates on your Android Studio and Gradle version. Make sure that the dependencies in `build.gradle` are compatible with your Android Studio version. You can also try clearing the Gradle cache:
     - Open terminal in Android Studio:  
       ```bash
       ./gradlew cleanBuildCache
       ```
     - Then sync the project again.

### 2. **Build Errors**
   - **Issue**: You get build errors related to missing imports or unresolved references.
   - **Solution**: Make sure that all necessary dependencies are added to your `build.gradle` file. Rebuild the project by selecting **Build** > **Rebuild Project** in Android Studio.

### 3. **App Not Running on Emulator or Device**
   - **Issue**: The app doesn’t launch on the emulator or physical device.
   - **Solution**: Check if your device is connected properly and USB debugging is enabled if using a physical device. Also, check if the emulator is set up correctly.
   - Make sure the device is running the minimum SDK version required (SDK 21 or higher).

### 4. **Permissions Not Requested**
   - **Issue**: If you plan to access sensors (e.g., heart rate or steps), you may need to request permissions such as `BODY_SENSORS` or `ACCESS_FINE_LOCATION`.
   - **Solution**: Add the required permissions in the `AndroidManifest.xml` file and request them at runtime if necessary.

### 5. **LiveData Not Updating UI**
   - **Issue**: The UI doesn't update when new data is fetched.
   - **Solution**: Ensure that `LiveData` is being observed properly. If the `LiveData` is not updating, ensure the `ViewModel` and `HealthActivity` are correctly set up to observe and handle changes.

---

## Contributing

Feel free to fork the repository and submit pull requests. If you find any bugs or want to add new features, please open an issue or create a pull request.

### Steps to contribute:

1. Fork this repository.
2. Clone your forked repository to your local machine.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Create a pull request to the main repository.

---
