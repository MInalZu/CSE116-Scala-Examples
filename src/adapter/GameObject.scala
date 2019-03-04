package adapter

class GameObject(var x:Double, var y:Double, var z:Double) extends Object3D {

  /**
    * A minimal example of an object that would fit into the coordinate system expected by
    * Object3D.
    */

  override def translateX: Double = this.x
  override def translateY: Double = this.y
  override def translateZ: Double = this.z

  /* GameObject behavior omitted */

}
