package cz.csas.webapi.codingdojo

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(String message) {
        super(message)
    }
}
