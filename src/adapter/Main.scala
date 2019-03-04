package adapter

import oop_physics.with_oop.Ball
import physics.{PhysicalObject, PhysicsVector}

class Main {

  def main(args: Array[String]): Unit = {

    var objectsInGame: List[Object3D] = List()

    // Create a game object that's intended to work in the coordinate system expected
    // by Object3D
    // This object is 2 units above the ground at position (5, 3) when viewed from overhead
    val naturalGameObject: GameObject = new GameObject(5, -2, 3)

    // can add the object to a list of all object which would work as expected in this
    // coordinate system [Usage of objectsInGame is omitted]
    objectsInGame = naturalGameObject :: objectsInGame

    // Create a Ball as defined earlier in class. This ball is 6 units off the ground at
    // position (2, -4) when viewed from overhead
    val ourObject: PhysicalObject = new Ball(new PhysicsVector(2, -4, 6), new PhysicsVector(0,0,0), 3)

    // Wrap our object in an adapter object to make it work with the other coordinate system
    val ourObjectAdapter: PhysicalObjectAdapter = new PhysicalObjectAdapter(ourObject)

    // Add our object to the game via the adapter
    // Coordinate systems are now compatible
    objectsInGame = ourObjectAdapter :: objectsInGame


  }

}
