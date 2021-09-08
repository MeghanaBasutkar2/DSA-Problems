package designpatterns.dependencyPack

class Novel(var pages: Page) {

    fun chapNum() {
        var chapNumber = if (pages.pagesInit >= 20) pages.pagesInit / 20 else 1
        print("You are in the $chapNumber chapter")
    }
}