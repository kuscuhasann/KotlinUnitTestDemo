package com.pakt_games.unittestexamples.example2


import org.junit.Before
import org.junit.Test

class StringReverserTest {
    var SUT: StringReverser? = null

    @Before
    fun setUp() {
        SUT = StringReverser()
    }

    @Test
    fun reverseEmptyString() {

    }
}