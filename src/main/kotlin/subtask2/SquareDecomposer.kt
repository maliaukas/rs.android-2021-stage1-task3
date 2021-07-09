package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number.toLong() * number, number)
    }

    private fun decompose(numberToReach: Long, numberToCheck: Int): Array<Int>? {
        loop@ for (i in numberToCheck - 1 downTo 1) {
            val diff = numberToReach - i.toLong() * i

            return when {
                diff == 0L -> arrayOf(i)
                diff > 0L -> {
                    val arr = decompose(diff, i) ?: continue@loop
                    arr + i
                }
                else -> continue@loop
            }
        }
        return null
    }
}
