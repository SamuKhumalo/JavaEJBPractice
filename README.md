# JavaEJBPractice

This project is a **Java EE Enterprise JavaBean (EJB)** module developed using **NetBeans** and **GlassFish**. It serves as a basic example of how to use stateless session beans and JPA entities in an EJB environment.

## Project Structure

- `src/java/ac/za/tut/model/bl/`: Contains business logic classes (facades, interfaces).
- `src/java/ac/za/tut/model/entity/`: Contains JPA entity classes (`Tossing.java`).
- `src/conf/`: Includes configuration files like `MANIFEST.MF` and `persistence.xml`.
- `nbproject/`: NetBeans project-specific files.
- `dist/`: Built JAR file (`Paper3EJBModule.jar`).
- `build/`: Compiled class files and generated sources.

##  Technologies Used

- **Java EE** (Enterprise Edition)
- **EJB** (Enterprise JavaBeans)
- **JPA** (Java Persistence API)
- **NetBeans IDE**
- **GlassFish Server**
- **Maven/Ant** (via NetBeans)
- **Git** for version control

##  Key Concepts Demonstrated

- Stateless session beans
- Persistence using JPA entities
- Dependency injection with `@EJB`
- Abstract facades for reusable database logic

##  How to Run

1. Open the project in **NetBeans**.
2. Make sure you have **GlassFish** installed and configured.
3. Clean and build the project.
4. Deploy it to the GlassFish server.


