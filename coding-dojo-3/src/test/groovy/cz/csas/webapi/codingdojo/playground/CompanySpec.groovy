package cz.csas.webapi.codingdojo.playground

import spock.lang.Specification

class CompanySpec extends Specification {

    def "Company::getAllEmployees should throw UnsupportedOperationException"() {
        given:
        def company = new Company()

        when:
        company.getAllEmployees()

        then:
        thrown UnsupportedOperationException
    }
}
