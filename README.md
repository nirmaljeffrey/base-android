# base-android
Collection of common utility classes and setup I use in my Android apps

# Package Structure
    
    price Tracker    # Root Package
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
