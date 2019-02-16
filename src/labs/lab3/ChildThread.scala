package labs.lab3

class ChildThread(no: Int) extends Thread {
  var m = this.getId();

  override def run(): Unit = {
    System.out.println("Child =>>> " + "Child Number Passed from parent: " + no + "; Thread Number: " + m);
  }
}
