package labs.lab3

class ChildRunnable(no: Int) extends Runnable {
  override def run(): Unit = {
    val id = Thread.currentThread().getId

    println("child: "+ no + "; Thread ID: "+id)
  }
}
