fun main(args: Array<String>) {
    val joinedArgs = args.joinToString(" ")
    println(joinedArgs)
    val counts = WordCount.phrase(joinedArgs)
    println(counts.toString())
}

class WordCount {
    companion object {
        fun phrase(phrase: String): Map<String,Int> {
            val wordCounts = mutableMapOf<String, Int>()
            val words = phrase.split(' ')
            words.forEach { wordCounts[it] = 1 }
            return wordCounts
        }
    }
}
