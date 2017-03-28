package cz.csas.webapi.codingdojo

interface CompanyInterface {

    Employee recruitEmployee(String position, BigDecimal salary, Person person)

    void fireEmployee(String id) throws EmployeeNotFoundException

    Collection<Employee> getAllEmployees()

    int getNumberOfEmployees()

    BigDecimal getTotalEmployeeCost()

    Optional<Employee> getLongestWorkingEmployee()

    Optional<Employee> getEmployeeById(String id)

    Optional<Employee> getEmployeeByFullName(String fullName)
}