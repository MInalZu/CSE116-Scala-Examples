package adapter

import physics.PhysicalObject

class PhysicalObjectAdapter(val adaptedObject: PhysicalObject) extends Object3D {

  override def translateX: Double = adaptedObject.location.x
  override def translateY: Double = -adaptedObject.location.z
  override def translateZ: Double = adaptedObject.location.y

}
