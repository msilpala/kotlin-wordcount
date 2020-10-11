class Romanizer {
    fun romanize(input: Int): String {
        val builder = StringBuilder()

        renderTenishUnits(builder, input, "M", 1000)
        renderFiveishUnit(builder, input, "D", 500)
        renderTenishUnits(builder, input, "C", 100)
        renderFiveishUnit(builder, input, "L", 50)
        renderTenishUnits(builder, input, "X", 10)
        renderFiveishUnit(builder, input, "V", 5)
        renderTenishUnits(builder, input, "I", 1)
        return builder.toString()
    }

    private fun renderTenishUnits(builder: StringBuilder, input: Int, romanNumeral: String, unit: Int) {
        when (val units = howManyTenishes(input, unit)) {
            in 1..4 -> {
                if (unitPlaceIsANineOrFour(input, unit)) {
                    builder.insert(builder.length - 1, romanNumeral)
                } else {
                    builder.append(romanNumeral.repeat(units))
                }
            }
        }
        if (nextLowerPlaceIsANine(input, unit)) {
            builder.append(romanNumeral)
        }
    }

    private fun renderFiveishUnit(builder: StringBuilder, input: Int, romanNumeral: String, unit: Int) {
        if (shouldThisUnitAppear(input, unit)) {
            builder.append(romanNumeral)
        }
    }

    private fun shouldThisUnitAppear(input: Int, unit: Int) = ((input % (unit * 2)) + (unit / 5)) / unit == 1

    private fun nextLowerPlaceIsANine(input: Int, unit: Int): Boolean {
        return when (unit / 10) {
            0 -> false
            else -> (input / (unit / 10)) % 10 == 9
        }
    }

    private fun unitPlaceIsANineOrFour(input: Int, unit: Int) = (input / unit) % 5 == 4

    private fun howManyTenishes(input: Int, unit: Int) = ((input % (5 * unit)) + 0) / unit
}

fun main() {
    val romanizer = Romanizer()
    for (i in 1..3999) {
        println("${i}: ${romanizer.romanize(i)}")
    }
}