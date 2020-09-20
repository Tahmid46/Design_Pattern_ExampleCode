package observer_pattern

class Blog : Subject {

    private var state: String = "There are currently 10 new blog posts"

    private val subscribers: MutableList<Observer> = mutableListOf()

    override fun registerObserver(observer: Observer) {
        subscribers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        subscribers.remove(observer)
    }

    override fun notifyObservers() {
        for (observers in subscribers) observers.update()
    }

    fun getState(): String = state
}