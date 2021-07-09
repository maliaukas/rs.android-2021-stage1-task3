package subtask1

import java.math.BigInteger


class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (i in 1..m) {
            val combination = combination(n, i)
            if (combination == m) {
                return i
            }
        }

        return null
    }

    private fun combination(n: Int, k: Int): Int {
        return (getFactorial(n) /
                (getFactorial(k) * getFactorial(n - k)))
            .intValueExact()
    }

    private fun getFactorial(f: Int): BigInteger {
        var result = BigInteger.ONE
        for (i in 1..f) result = result.multiply(BigInteger.valueOf(i.toLong()))
        return result
    }
}
