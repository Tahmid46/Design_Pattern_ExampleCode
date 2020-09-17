package decorator_design_pattern

abstract class WebPageDecorator(
    protected val page: WebPage
) : WebPage {

    override fun display() {
        this.page.display()
    }
}