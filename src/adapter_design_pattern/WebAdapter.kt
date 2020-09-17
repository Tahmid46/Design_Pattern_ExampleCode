package adapter_design_pattern

class WebAdapter : WebRequester {

    private lateinit var service: WebService

    fun connect(service: WebService) {
        this.service = service
    }

    override fun request(obj: Object): Int {
        val json = toJson(obj)
        val response = service.request(json)
        if(!response.equals(null)) {
            return 200
        }
        return 500 //Error status code
    }

    private fun toJson(ob: Object): Json {
        /*Convert object into Json
        and return Json
         */
        val json = Json()
        return json
    }
}