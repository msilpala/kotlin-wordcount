import org.junit.Test
import kotlin.test.assertEquals

class RomanizerTest {

    @Test
    fun renders1() = assertEquals("I", Romanizer().romanize(1))

    @Test
    fun renders2() = assertEquals("II", Romanizer().romanize(2))

    @Test
    fun renders3() = assertEquals("III", Romanizer().romanize(3))

    @Test
    fun renders4() = assertEquals("IV", Romanizer().romanize(4))

    @Test
    fun renders5() = assertEquals("V", Romanizer().romanize(5))

    @Test
    fun renders6() = assertEquals("VI", Romanizer().romanize(6))

    @Test
    fun renders7() = assertEquals("VII", Romanizer().romanize(7))

    @Test
    fun renders8() = assertEquals("VIII", Romanizer().romanize(8))

    @Test
    fun renders9() = assertEquals("IX", Romanizer().romanize(9))

    @Test
    fun renders10() = assertEquals("X", Romanizer().romanize(10))

    @Test
    fun renders11() = assertEquals("XI", Romanizer().romanize(11))

    @Test
    fun renders12() = assertEquals("XII", Romanizer().romanize(12))

    @Test
    fun renders13() = assertEquals("XIII", Romanizer().romanize(13))

    @Test
    fun renders14() = assertEquals("XIV", Romanizer().romanize(14))

    @Test
    fun renders15() = assertEquals("XV", Romanizer().romanize(15))

    @Test
    fun renders16() = assertEquals("XVI", Romanizer().romanize(16))

    @Test
    fun renders17() = assertEquals("XVII", Romanizer().romanize(17))

    @Test
    fun renders18() = assertEquals("XVIII", Romanizer().romanize(18))

    @Test
    fun renders19() = assertEquals("XIX", Romanizer().romanize(19))

    @Test
    fun renders20() = assertEquals("XX", Romanizer().romanize(20))

    @Test
    fun renders21() = assertEquals("XXI", Romanizer().romanize(21))

    @Test
    fun renders24() = assertEquals("XXIV", Romanizer().romanize(24))

    @Test
    fun renders25() = assertEquals("XXV", Romanizer().romanize(25))

    @Test
    fun renders39() = assertEquals("XXXIX", Romanizer().romanize(39))

    @Test
    fun renders40() = assertEquals("XL", Romanizer().romanize(40))

    @Test
    fun renders89() = assertEquals("LXXXIX", Romanizer().romanize(89))

    @Test
    fun renders90() = assertEquals("XC", Romanizer().romanize(90))

    @Test
    fun renders99() = assertEquals("XCIX", Romanizer().romanize(99))

    @Test
    fun renders140() = assertEquals("CXL", Romanizer().romanize(140))

    @Test
    fun renders150() = assertEquals("CL", Romanizer().romanize(150))

    @Test
    fun renders390() = assertEquals("CCCXC", Romanizer().romanize(390))

    @Test
    fun renders500() = assertEquals("D", Romanizer().romanize(500))

    @Test
    fun renders600() = assertEquals("DC", Romanizer().romanize(600))

    @Test
    fun renders900() = assertEquals("CM", Romanizer().romanize(900))

    @Test
    fun renders3999() = assertEquals("MMMCMXCIX", Romanizer().romanize(3999))
}

