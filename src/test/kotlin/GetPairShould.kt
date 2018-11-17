package test.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
    Good morning! Here's your coding interview problem for today.

    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

    Given this implementation of cons:

    def cons(a, b):
        def pair(f):
            return f(a, b)
        return pair

    Implement car and cdr.
 */

class GetPairShould {

    @Test
    fun `get first element`() {
        assertEquals(3, car(cons(3, 4)))
        assertEquals(4, car(cons(4, 3)))
    }

    @Test
    fun `get last element`() {
        assertEquals(4, cdr(cons(3, 4)))
        assertEquals(3, cdr(cons(4, 3)))
    }
}