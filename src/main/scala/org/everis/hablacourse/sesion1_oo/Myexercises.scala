package org.everis.hablacourse.sesion1_oo

/* Aquí vamos a probar distintas maneras que se nos pueden ocurrir de llevar a cabo el mismo ejercicio
Los test los vamos a referenciar a la carpeta /scala/test
 */

class Myexercises {
  // manera 1

  // definimos  una class "Fruit" con atributos "color" y "price"
  class Fruit (_color: String, _price: Double) {
    val color: String = _color
    val price: Double = _price
  }

  // Contructor
  val banana: Fruit = new Fruit("yellow", 3.0)
  val kiwi = Fruit.create("green")
  val orange = new Fruit("orange", 3.5)

  // Otro constructor --> con el method create y que  por defecto lleve un precio asociado
  object Fruit {
    def create(_color:  String):  Fruit = new Fruit(_color, 4.3)
  }

  println("El precio de las bananas es de: " + banana.price)
  println("de color " + banana.color)

  println("El color de los kiwis es " + kiwi.color)
  println("A precio: " + kiwi.price)

}
