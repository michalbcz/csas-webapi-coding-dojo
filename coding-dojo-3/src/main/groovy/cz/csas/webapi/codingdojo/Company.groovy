package cz.csas.webapi.codingdojo

import cz.csas.webapi.codingdojo.CompanyInterface as CompanyInterface

class Company implements CompanyInterface {

    @Override
    Employee recruitEmployee(String position, BigDecimal salary, Person person) {
        throw new UnsupportedOperationException()
    }

    @Override
    void fireEmployee(String id) throws EmployeeNotFoundException {
        throw new UnsupportedOperationException()
    }

    @Override
    Collection<Employee> getAllEmployees() {
        throw new UnsupportedOperationException()
    }

    @Override
    int getNumberOfEmployees() {
        throw new UnsupportedOperationException()
    }

    @Override
    BigDecimal getTotalEmployeeCost() {
        throw new UnsupportedOperationException()
    }

    @Override
    Optional<Employee> getLongestWorkingEmployee() {
        throw new UnsupportedOperationException()
    }

    @Override
    Optional<Employee> getEmployeeById(String id) {
        throw new UnsupportedOperationException()
    }

    @Override
    Optional<Employee> getEmployeeByFullName(String fullName) {
        throw new UnsupportedOperationException()
    }
}
