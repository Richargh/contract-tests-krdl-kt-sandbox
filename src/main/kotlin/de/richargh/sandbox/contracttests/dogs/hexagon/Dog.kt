package de.richargh.sandbox.contracttests.dogs.hexagon

data class Dog(val id: DogId, val name: String)

data class DogId(val rawValue: String)
