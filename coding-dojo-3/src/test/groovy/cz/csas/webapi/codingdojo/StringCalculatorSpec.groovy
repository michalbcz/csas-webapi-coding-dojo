package cz.csas.webapi.codingdojo

import spock.lang.Specification

class StringCalculatorSpec extends Specification {

    def "Add should throw UnsupportedOperationException"() {
        when:
        StringCalculator.add("")

        then:
        thrown UnsupportedOperationException
    }
}
