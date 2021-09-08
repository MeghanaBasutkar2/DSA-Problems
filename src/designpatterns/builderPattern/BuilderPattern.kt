package designpatterns.builderPattern

class BuilderPattern(var title: String) {
    var name: String = ""

    fun createPattern() {
        name = title
    }

    object ChildBuilderPattern {
        var childTitleExt: String = "defaultTitle"
        var stmtInt: String = "defaultStmt"

        fun setChildTitle(childTitle: String) {
            childTitleExt = childTitle
            setChildName()
        }

        fun setBuilderStatement(stmt: String) {
            stmtInt = stmt
            print("builder statement: \n$stmtInt")
        }

        fun setChildName() {
            childTitleExt.hashCode()
        }
    }
}