package com.rodrigmatrix.androidci

import org.junit.Test

import org.junit.Assert.*

class AppUnitTests {

    @Test
    fun twoPlusTwoEqualsFive() {
        assertEquals(5, 2 + 2)
    }

    @Test
    fun successfulTest(){
        assertEquals(5, 2 + 3)
    }

}
