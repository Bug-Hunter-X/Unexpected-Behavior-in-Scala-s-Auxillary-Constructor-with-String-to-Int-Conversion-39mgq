```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Error: Invalid input string. Using default value 0.")
        this(0)
    }
  }
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
val obj3 = new MyClass("abc")

println(obj1.x) // Output: 10
println(obj2.x) // Output: 20
println(obj3.x) // Output: 0 (default value)
```