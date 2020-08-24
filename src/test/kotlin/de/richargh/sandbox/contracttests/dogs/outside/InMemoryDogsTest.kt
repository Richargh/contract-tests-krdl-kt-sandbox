package de.richargh.sandbox.contracttests.dogs.outside

import de.richargh.sandbox.contracttests.dogs.hexagon.Dogs
import de.richargh.sandbox.contracttests.dogs.hexagon.DogsContract

class InMemoryDogsTest: DogsContract() {
    override fun dogs(): Dogs {
        return InMemoryDogs()
    }
}