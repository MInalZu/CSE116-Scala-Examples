package adapter

trait Object3D {

  /**
    * Object3D is a trait (abstract class with no constructor) to be extended by any objects
    * in a 3D world with a coordinate system the same as in JavaFX/ScalaFX which uses an
    * inverted y axis for the up/down direction meaning that gravity is in the positive y direction
    *
    * This trait defines 3 methods used to get the location of the object. Any object in this world
    * must extend this trait and implement these methods
    */

  def translateX: Double
  def translateY: Double
  def translateZ: Double

}
