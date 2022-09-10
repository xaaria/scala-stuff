import scala.util._

@main def hello: Unit = {


  val x = Try(100 / 0).orElse(Try(999))
  println("Hello world! " + x)
  println(msg)

  say("Moooo!")


  class Person(var name: String):
    val age = 56
    val sex = 'M'
    var friends: Seq[Person]

    override def toString: String = {
      s"Hello, I am $name, aged $age"
    }  

  end Person

  val z = Person("Matti")
  println(z)

} 
def msg = "I was compiled by Scala 3. :)"

  def say(msg: String): String = {
    "Cow says: " + msg
  }