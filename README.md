# Minimal Library API


## System Actors

###### Book Issuer: A person who has a membership at this library and can issue books based on their availability
###### Librarian: A person who can has the ability to issue a book to a member, add new stock to the available Book stocks,etc


1. There is no connection to a database. The API returns dummy dtos
2. The api has three separate groups for a librarian, issuer and a controller for Books

## Running the application

1. Clone the repo
2. Make sure maven is installed
3. Go to project directory and run the following command - 'mvn clean install'
4. Once that is done, run the following command - 'mvn spring-boot:run'
5. Make sure port 8080 is not in use
6. hit the swagger endpoint of the application - http://localhost:8080/swagger-ui.html

