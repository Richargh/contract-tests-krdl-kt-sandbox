package de.richargh.sandbox.contracttests.dogs.outside

import de.richargh.sandbox.contracttests.dogs.hexagon.Dog
import de.richargh.sandbox.contracttests.dogs.hexagon.DogId
import de.richargh.sandbox.contracttests.dogs.hexagon.Dogs
import java.util.concurrent.ConcurrentHashMap

class InMemoryDogs: Dogs {
    private val dogs = ConcurrentHashMap<DogId, Dog>(16)

    override fun put(dog: Dog) {
        dogs.put(dog.id, dog)
    }

    override fun findById(id: DogId): Dog? {
        return dogs.get(id)
    }

    override fun size(): Long {
        return dogs.size.toLong()
    }
}