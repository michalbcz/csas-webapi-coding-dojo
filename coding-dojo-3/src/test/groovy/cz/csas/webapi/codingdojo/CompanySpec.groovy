package cz.csas.webapi.codingdojo

import cz.csas.webapi.codingdojo.Company
import spock.lang.Specification
import spock.lang.Unroll

class CompanySpec extends Specification {

    def company = new Company()

    def "recruited employee should be returned by getAllEmployees"() {
        given:
        def person = new Person()

        when:
        def employee = company.recruitEmployee("developer", 25000, person)

        then:
        company.getAllEmployees().contains(employee)
    }

    def "add new employee with some data"() {
        given:
        def person = new Person()

        when:
        def employee = company.recruitEmployee("developer", 25000, person)

        then:
        employee.person == person
    }

    def "add multiple employees"() {
        given:
        def person = new Person()

        when:
        company.recruitEmployee("developer", 25000, person)
        company.recruitEmployee("boss", 30000, person)

        then:
        company.getAllEmployees().size() == 2
    }

    def "1 recruited employee should return number of employees 1"() {
        given:
        def person = new Person()

        when:
        company.recruitEmployee("developer", 25000, person)

        then:
        company.numberOfEmployees == 1

    }

    def "numberOfEmployees should return same value as getAllEmployees.size"() {
        given:
        def person = new Person()

        when:
        company.recruitEmployee("developer", 25000, person)
        company.recruitEmployee("boss", 30000, person)

        then:
        company.numberOfEmployees == company.getAllEmployees().size()
    }

    def "total employee cost equals added cost of each employee"() {
        given:
        def person = new Person()

        when:
        company.recruitEmployee("developer", 25000, person)
        company.recruitEmployee("boss", 30000, person)

        then:
        company.getTotalEmployeeCost() == 55000
    }

    def "first recruited employee should be the longest working employee"() {
        given:
        def person = new Person()

        when:
        def employee = company.recruitEmployee("developer", 25000, person)
        company.recruitEmployee("boss", 30000, person)

        then:
        company.longestWorkingEmployee.get() == employee
    }

    def "find empeloyee by id should return expected employee"() {
        given:
        def person = new Person()
        def addedEmployee = company.recruitEmployee("developer", 25000, person)

        expect:
        company.getEmployeeById(addedEmployee.id).get() == addedEmployee
    }

    def "when employee is fired"() {
        given:
        def person = new Person()
        def addedEmployee = company.recruitEmployee("developer", 25000, person)

        when:
        company.fireEmployee(addedEmployee.id)

        then:
        company.getEmployeeById(addedEmployee.id) == Optional.empty()
    }
}
