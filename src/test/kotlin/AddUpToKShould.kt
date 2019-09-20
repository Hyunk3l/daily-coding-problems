package test.kotlin

import main.kotlin.AddUpToK
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
    Good morning! Here's your coding interview problem for today.

    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
 */
class AddUpToKShould {

    @Test
    fun `return true if k is by a sum of two numbers in a small list of numbers`() {
        val numbers = listOf(10, 15, 3, 7)
        val needle = 17

        assertTrue { (AddUpToK()).execute(numbers, needle) }
    }

    @Test
    fun `return false if k is not in a small list of numbers`() {
        val numbers = listOf(10, 15, 3, 5)
        val needle = 17

        assertFalse { (AddUpToK()).execute(numbers, needle) }
    }

    @Test
    fun `return true if k is in a small list of numbers`() {
        val numbers = listOf(10, 15, 3, 17)
        val needle = 17

        assertTrue { (AddUpToK()).execute(numbers, needle) }
    }

    @Test
    fun `return true if k is by a sum of two numbers in a list of numbers`() {
        val numbers = listOf(10, 15, 3, 22, 33, 9, 24, 45, 101, 4, 6, 1, 1, 1, 8)
        val needle = 17

        assertTrue { (AddUpToK()).execute(numbers, needle) }
    }

    @Test
    fun `return true if k is by a sum of two numbers in a big list of numbers`() {
        val numbers = listOf(10, 15, 3, 22, 4, 9, 7, 8, 24, 45, 101, 4, 6, 1, 1, 1, 8, 9, 10, 12)
        val needle = 17

        assertTrue { (AddUpToK()).execute(numbers, needle) }
    }
}
