package adapter_design_pattern

class WebService(
        val host: String
) {

    fun request(req: Json): Json {
        /*Dummy implementation*/
        val response = Json()
        return response
    }
}