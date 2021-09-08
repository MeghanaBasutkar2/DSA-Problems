package threads

class ChildThread: MyThread(){

    override fun run() {
        print("do my own child thing!")
        super.run()
    }
}