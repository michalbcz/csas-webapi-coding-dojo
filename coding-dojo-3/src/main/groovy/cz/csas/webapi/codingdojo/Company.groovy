package cz.csas.webapi.codingdojo

import cz.csas.webapi.codingdojo.CompanyInterface as CompanyInterface

class Company implements CompanyInterface {

    List<Employee> employees = []
    def id = 0

    @Override
    Employee recruitEmployee(String position, BigDecimal salary, Person person) {
        def employee = new Employee(id: id++, position: position, salary: salary, person: person)
        employees << employee
        return employee
    }

    @Override
    void fireEmployee(String id) throws EmployeeNotFoundException {
        employees.remove(getEmployeeById(id).get())
    }

    @Override
    Collection<Employee> getAllEmployees() {
        employees.asImmutable()
    }

    @Override
    int getNumberOfEmployees() {
        employees.size()
    }

    @Override
    BigDecimal getTotalEmployeeCost() {
        employees.inject(0, { accumulator, value -> accumulator += value.salary })
    }

    @Override
    Optional<Employee> getLongestWorkingEmployee() {
        Optional.of(employees[0])
    }

    @Override
    Optional<Employee> getEmployeeById(String id) {
        Optional.ofNullable(employees.find { it.id == id })
    }

    @Override
    Optional<Employee> getEmployeeByFullName(String fullName) {
        throw new UnsupportedOperationException()
    }
}
