package designpatterns.dependencyPack

class Book(var pages: Page) {

    fun onPageNumber() {
        print("You are on page: $pages")
    }
}