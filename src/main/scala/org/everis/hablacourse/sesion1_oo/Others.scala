package org.everis.hablacourse.sesion1_oo

import org.scalatest._

class Others extends FunSpec with Matchers {
  // Interfaz vehiculo
  trait Vehiculo {
    def color: String
    def price: Double
    def passengers: Int
    def wheels: Int
    def sign: String
    def model: String
  }

  // clase coche
  abstract class Coche(_doors: Int) extends Vehiculo {
    val doors: Int = _doors
    val radio: Boolean
  }
  // clase moto
  abstract class Moto() extends Vehiculo {
    val radio: Boolean
    val handlebar: Boolean
  }

  // Constructor
  lazy val coche: Coche = new Coche(4) {
    override val radio: Boolean = true

    override def color: String = "rojo"

    override def price: Double = 3000

    override def passengers: Int = 4

    override def wheels: Int = 4

    override def sign: String = "Seat"

    override def model: String = "Leon"
  }

  lazy val moto: Moto = new Moto {
    override val radio: Boolean = false
    override val handlebar: Boolean = true

    override def color: String = "azul"

    override def price: Double = 600

    override def passengers: Int = 2

    override def wheels: Int = 2

    override def sign: String = "Honda"

    override def model: String = "ZZ"
  }



  // Otro constructor para poder instanciar cualquier vehiculo
  object Vehiculo {
    def create(_sign: String, _model: String): Vehiculo = new Vehiculo {
      override def color: String = "gris"

      override def price: Double = 70

      override def passengers: Int = 1

      override def wheels: Int = 2

      override def sign: String = _sign

      override def model: String = _model
    }
  }

  // creo una bici
  lazy val bike: Vehiculo = Vehiculo.create("superBike", "3000")
}
