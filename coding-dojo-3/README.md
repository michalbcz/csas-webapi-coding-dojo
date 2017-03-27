# Coding Dojo #3 (29.3.2017)
 
## Form
 1. sit at computer
 2. fix failing test
 3. refactor
 4. make sure all tests are green (ok)
 5. write new (failing) test
 6. switch computer driver 
 7. repeat
 
## Constraints
 1. use Groovy language
 2. use Spock Framework

## Links
* http://groovy-lang.org
* http://spockframework.org

## Problem 
Implement methods of the company below.


```groovy
interface Company {

    Employee recruitEmployee(String position, BigDecimal salary, Person person)

    void fireEmployee(String id) throws EmployeeNotFoundException

    Collection<Employee> getAllEmployees()

    int getNumberOfEmployees()

    BigDecimal getTotalEmployeeCost()

    Optional<Employee> getLongestWorkingEmployee()

    Optional<Employee> getEmployeeById(String id)

    Optional<Employee> getEmployeeByFullName(String fullName)
}

interface Employee {

    String getId()

    String getSalary()

    Person getPerson()

    LocalDate getRecruitedAt()
}

interface Person {

    String getFirstName()

    String getLastName()
}

```