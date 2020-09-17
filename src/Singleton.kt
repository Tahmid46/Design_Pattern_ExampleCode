
class Singleton private constructor(val name: String, val roll: Int) {

    companion object {
        private var singleton: Singleton? = null
        fun getInstance(): Singleton {
            if(singleton == null) {
                singleton = Singleton("Tommy", 101)
            }
            return singleton as Singleton
        }
    }

}