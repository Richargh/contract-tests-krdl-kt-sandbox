package de.richargh.sandbox.contracttests.dogs.hexagon

interface Dogs {
    fun put(dog: Dog)
    fun findById(id: DogId): Dog?
    fun size(): Long
}