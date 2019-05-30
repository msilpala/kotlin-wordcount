import org.junit.Test
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

    @Test
    fun countsWithCommaDelimiter() {
        val input = "one,two,three,two,one"
        val expectedWordCount = mapOf(
                "one" to 2,
                "two" to 2,
                "three" to 1
        )

        assertEquals(expectedWordCount, WordCount().phrase(input))
    }

}
