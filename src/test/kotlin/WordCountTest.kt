import org.junit.Test
import org.junit.Ignore
import kotlin.test.assertEquals

class WordCountTest {

    @Test
    fun countsOneWord() {
        val input = "word"
        val expectedWordCount = mapOf("word" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Test
    fun countsOneOfEach() {
        val input = "one of each"
        val expectedWordCount = mapOf(
                "one" to 1,
                "of" to 1,
                "each" to 1
        )

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Test
    fun countsMultipleOccurrencesOfAWord() {
        val input = "one fish two fish red fish blue fish"
        val expectedWordCount = mapOf(
                "one" to 1,
                "fish" to 4,
                "two" to 1,
                "red" to 1,
                "blue" to 1
        )

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun countsCrampedList() {
        val input = "one,two,three"
        val expectedWordCount = mapOf(
                "one" to 1,
                "two" to 1,
                "three" to 1
        )

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun countsExpandedList() {
        val input = "one,\ntwo,\nthree"
        val expectedWordCount = mapOf("one" to 1, "two" to 1, "three" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun ignoresPunctuation() {
        val input = "car: carpet as java: javascript!!&@\$%^&"
        val expectedWordCount = mapOf("car" to 1, "carpet" to 1, "as" to 1, "java" to 1, "javascript" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun countsNumbers() {
        val input = "testing, 1, 2 testing"
        val expectedWordCount = mapOf("testing" to 2, "1" to 1, "2" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun countsCaseInsensitively() {
        val input = "go Go GO Stop stop"
        val expectedWordCount = mapOf("go" to 3, "stop" to 2)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun allowsApostrophes() {
        val input = "First: don't laugh. Then: don't cry."
        val expectedWordCount = mapOf("first" to 1, "don't" to 2, "laugh" to 1, "then" to 1, "cry" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

    @Ignore
    @Test
    fun allowsQuotations() {
        val input = "Joe can't tell between 'large' and large."
        val expectedWordCount = mapOf("joe" to 1, "can't" to 1, "tell" to 1, "between" to 1, "large" to 2, "and" to 1)

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

}
