package lectures.part2oops

object OOBasics extends App {

  val person = new Person("Kayal", 21)
  println(person.x)
  println(person.age)

  person.greet("jay")

}

class Person(name:String, val age:Int) {

  val x=2
  println((1+3))

  def greet(name: String) = println(s"${this.name} says : Hi, $name" )
}
