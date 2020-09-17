package decorator_design_pattern

import decorator_design_pattern.WebPage
import decorator_design_pattern.WebPageDecorator

class AuthorizedWebPage(
     private val webpage: WebPage
) : WebPageDecorator(webpage) {

    private fun authorizeUser() {
        println("Authorizing user...")
    }

    override fun display() {
        super.display()
        this.authorizeUser()
    }
}