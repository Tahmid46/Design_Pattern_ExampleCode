package decorator_design_pattern

fun main() {
    var simplePage: WebPage = BasicWebPage()
    simplePage = AuthorizedWebPage(simplePage)
    simplePage = AuthenticatedWebPage(simplePage)
    simplePage.display()
}