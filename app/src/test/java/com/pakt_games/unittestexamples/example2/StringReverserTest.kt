package com.pakt_games.unittestexamples.example2


import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test

class StringReverserTest {
    var SUT: StringReverser? = null

    @Before
    fun setUp() {
        SUT = StringReverser()
    }

    @Test
    fun emptyStringIsReturnedEmpty() {
        val result = SUT!!.reverse("")
        Truth.assertThat(result).contains("")
    }
    @Test
    fun reverseSingleCharacter_sameStringReturned() {
        val result =SUT!!.reverse("h")
        Truth.assertThat(result).contains("h")
    }
    @Test
    fun reverseWord_isReversedWord() {
        val result =SUT!!.reverse("hasan")
        Truth.assertThat(result).contains("nasah")
    }
}