fun main() {
    val input = generateSequence(::readLine).joinToString("\n")
    val counts = WordCount().phrase(input)
    println(counts.toString())
}

class WordCount {
    fun phrase(phrase: String): Map<String, Int> {
            val wordCounts = mutableMapOf<String, Int>()
            val words = phrase.split(' ')
            words.forEach { wordCounts[it] = 1 }
            return wordCounts
    }
}
