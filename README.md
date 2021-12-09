# base-android
Collection of common utility classes and setup I use in my Android apps

## Package Structure
    
    base android    # Root Package
    .
    ├── data                      # For data handling.
    │   ├── domain                # Responsible for representing the concepts of business
    |   │   ├── mapper            # For mapping entity or dto into domain models   
    |   |   ├── model             # Domain models will be viewmodel layer
    │   ├── persistance           # Local Persistence Database. Room (SQLite) database
    |   │   ├── dao               # Data Access Object for Room   
    |   |   ├── entity            # Entity models for room 
    |   |   ├── typeconverter     # Converts custom types to and from known types that Room can persist
    │   ├── remote                # Remote Data Handlers     
    |   │   ├── api               # Retrofit API for remote end point.
    |   │   ├── dto               # Data Transfer Object models for processing data from remote server
    │   └── repository            # Single source of truth for data.
    |
    ├── di                        # Dependency Injection             
    │   ├── intializers           # App Startup initializers   
    │   └── module                # DI Modules
    |
    ├── ui                        # View layer
    |   ├── adapter               # Adapter for RecyclerView
    |   └── activity              # Activity for single activity architecture  
    │   └── fragment              # Each screen is represented as fragments
    |
    ├── viewmodel                 # responsible for preparing and managing the data 
    |
    └── utils                     # Utility Classes / Kotlin extensions

## Complete the below TODOs while using this project

![Screenshot 2021-12-09 at 12 29 55 PM](https://user-images.githubusercontent.com/25390275/145349789-0af8510e-8e48-41c6-a442-0983eac22826.png)
