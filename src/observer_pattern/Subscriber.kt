package observer_pattern

class Subscriber : Observer {

    override fun update() {
        println("There is a new blog post...")
    }
}