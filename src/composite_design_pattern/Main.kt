package composite_design_pattern

fun main() {

    val building: Housing = Housing("123-street")

    val floor1: Housing = Housing("123 street-First Floor")

    val firstFloor = building.addStructure(floor1)

    val washRoom1m: Room = Room("1F Men's Washroom")
    val washRoom1w: Room = Room("1F Women's Washroom")

    val mensWashRoom = floor1.addStructure(washRoom1m)
    val femalesWashRoom = floor1.addStructure(washRoom1w)

    val commonRoom: Room = Room("1F Common Room")
    val firstFloorCommonRoom = floor1.addStructure(commonRoom)

    building.enter()
    floor1.enter()
    building.location()
    floor1.location()
    floor1.exit()
    building.exit()

}
