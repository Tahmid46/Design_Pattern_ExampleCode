package decorator_design_pattern

fun main() {
    var simplePage: WebPage = BasicWebPage()
    simplePage = AuthorizedWebPage(simplePage) //simplePage = AuthorizedWebPagePage
    simplePage = AuthenticatedWebPage(simplePage) //simplePage = AuthenticateWebPage
    simplePage.display()
}