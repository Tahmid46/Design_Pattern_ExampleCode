package decorator_design_pattern

class AuthenticatedWebPage(
    private val webPage: WebPage
) : WebPageDecorator(webPage) {

    private fun authenticateWebpage() {
        println("Authenticating user...")
    }

    override fun display() {
        super.display()
        this.authenticateWebpage()
    }
}