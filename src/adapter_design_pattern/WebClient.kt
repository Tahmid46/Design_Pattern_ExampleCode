package adapter_design_pattern

class WebClient(
        private val webRequester: WebRequester
) {
    fun doWork() {
        val obj = makeObject()
        val result = webRequester.request(obj)
        if(result == 200) {
            println("Ok")
        } else {
            println("Not ok")
        }
    }

    private fun makeObject(): Object {
        return Object()
    }
}