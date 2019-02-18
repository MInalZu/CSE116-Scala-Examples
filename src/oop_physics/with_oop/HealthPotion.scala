package oop_physics.with_oop

import physics.PhysicsVector

class HealthPotion(override val location: PhysicsVector,
                   override val velocity: PhysicsVector,
                   val volume: Int)
  extends InanimateObject(location, velocity) {


  override def objectMass(): Double = {
    val massPerVolume: Double = 7.0
    volume * massPerVolume
  }
  def use(player: Player): Unit = {
    player.health = (player.health + this.volume).min(player.maxHealth)
  }
}
