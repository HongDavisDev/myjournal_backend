# myjournal_backend
This repository contains the back-end code for the Journaling Website. The website is developed using Java SpringBoot.

**Features:**

- The website provides a REST API for creating and retrieving journal entries.
- The website has a feature that automatically populates Bible verses based on the keywords of emotions in the journal entry.

**System Requirements:**

- Java 11+
- Maven 3.8.1+

**Installation:**

```bash
# Clone the repository
git clone https://github.com/your-username/journaling-website-backend.git

# Install the dependencies
mvn clean install
```

**Usage:**

- Start the SpringBoot application by running the following command:
```bash
mvn spring-boot:run
```
- The application will be up and running on port `8080`.
- You can access the REST API endpoints at `http://localhost:8080/api`.

**Endpoints:**

- `/api/entries`: Create a new journal entry.
- `/api/entries`: Retrieve all journal entries.
- `/api/entries/{id}`: Retrieve a journal entry by its ID.
- `/api/verses/{emotion}`: Retrieve Bible verses based on an emotion keyword.
