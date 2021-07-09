package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.first() == '-')
            return null

        val answer = mutableListOf<String>()
        number.forEachIndexed { i: Int, c: Char ->
            val adj = adjacent[c]!!
            for (neighbour in adj) {
                answer.add(buildString {
                    append(number)
                    replace(i, i + 1, neighbour.toString())
                })
            }
        }

        return answer.toTypedArray()
    }

    private val adjacent = mapOf<Char, IntArray>(
        '1' to listOf(2, 4).toIntArray(),
        '2' to listOf(1, 3, 5).toIntArray(),
        '3' to listOf(2, 6).toIntArray(),
        '4' to listOf(1, 5, 7).toIntArray(),
        '5' to listOf(2, 4, 6, 8).toIntArray(),
        '6' to listOf(3, 5, 9).toIntArray(),
        '7' to listOf(4, 8).toIntArray(),
        '8' to listOf(5, 7, 9, 0).toIntArray(),
        '9' to listOf(6, 8).toIntArray(),
        '0' to listOf(8).toIntArray()
    )
}
