# Simple spring boot REST application with Maven

# Customer CURD operations
**Get Customer**
```html
    GET http://localhost:8080/customer/{id}
    Example : GET http://localhost:8080/customer/23
```
**Create Customer**
```html
    POST http://localhost:8080/customer
    Body: {
        "firstName": "First Name",
        "lastName": "Last Name",
        "address": "Customer Address",
        "email": "email@gmail.com"
    }
```
