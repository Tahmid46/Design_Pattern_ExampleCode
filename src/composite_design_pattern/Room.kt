package composite_design_pattern

/**
 * Implementation of leaf class
 */
class Room(
        private val roomName: String
) : IStructure {

    override fun enter() {
        println("You entered : $roomName")
    }

    override fun exit() {
        println("You left the : $roomName")
    }

    override fun location() {
        println("You are currently in : $roomName")
    }

    override fun getName(): String {
        return roomName
    }
}