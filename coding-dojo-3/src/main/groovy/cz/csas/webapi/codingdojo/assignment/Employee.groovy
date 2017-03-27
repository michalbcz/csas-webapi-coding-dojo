package cz.csas.webapi.codingdojo.assignment

import java.time.LocalDate

interface Employee {

    String getId()

    String getSalary()

    Person getPerson()

    LocalDate getRecruitedAt()
}
