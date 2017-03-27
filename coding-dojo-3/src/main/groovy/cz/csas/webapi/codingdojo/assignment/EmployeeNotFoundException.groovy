package cz.csas.webapi.codingdojo.assignment

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(String message) {
        super(message)
    }
}
