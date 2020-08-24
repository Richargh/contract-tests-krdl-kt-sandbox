package de.richargh.sandbox.contracttests.dogs.hexagon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

abstract class DogsContract {

    protected abstract fun dogs(): Dogs

    @Test
    fun `the repo should start as empty`() {
        // arrange

        // act
        val testling = dogs()

        // assert
        assertThat(testling.size()).isEqualTo(0)
    }

    @Test
    fun `a dog that was put into the repo should increment the size by one`() {
        // arrange
        val testling = dogs()

        // act
        testling.put(Dog(DogId("1"), "Spike"))

        // assert
        assertThat(testling.size()).isEqualTo(1)
    }

    @Test
    fun `a dog in the repo should be findable by its id`() {
        // arrange
        val testling = dogs()
        val adog = Dog(DogId("1"), "Spike")
        testling.put(adog)

        // act
        val result = testling.findById(adog.id)

        // assert
        assertThat(result).isEqualTo(adog)
    }

}