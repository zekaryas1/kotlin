package F.oop

//both
//can have implemented and unimplemented methods

//interface
//can't have any constructor

//abstract
//can have constructor

interface IDocument {

    fun open()

    fun copy()

}

abstract class ButtonFactory(val data: String) {

    fun click() {
        createButton()
        //pass data and click the button
    }

    abstract fun createButton()
}

class PdfDocument : IDocument {

    override fun open() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
