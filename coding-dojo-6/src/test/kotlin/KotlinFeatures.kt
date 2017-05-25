import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinFeatures {

    @Test
    fun sort() {
        val persons = listOf(Person("Michal Bernhard", 32), Person("Jana Sebestikova", 27), Person("Karel Stefan", 31))
        val personsSortedByAgeAscending = persons.sortedBy { it.age }

        assertEquals(Person("Michal Bernhard", 32), personsSortedByAgeAscending.last())
        assertEquals(Person("Jana Sebestikova", 27), personsSortedByAgeAscending.first())
    }

    @Test
    fun destructuring() {
        val (name, age) = Person("Michal Bernhard", 32)

        assertEquals("Michal Bernhard", name)
        assertEquals(32, age)
    }

    @Test
    fun smartCast() {
        val o : Any = "123"

        if (o is String) {
            println("Lenght of string is : ${o.length}")
        }

        if (o is Int) {
            println(o)
        }
    }

    @Test
    fun nullSafety() {
        data class Account(val number : String)

        var account : Account? = Account(number = "38856656/0100")
        account = null
    }

    @Test
    fun something() {
        val fooVal = 10 // we cannot later reassign fooVal to something else

    }


}

data class Person(val name : String, val age : Int, val sex : Sex = Sex.MALE)

enum class Sex {
    MALE, FEMALE, THIRD
}

