package onextent.demo.sjshello

import akka.actor.ActorSystem

object Main extends App {

  lazy val system = ActorSystem("myAkkaSystem")
  import system.dispatcher
  import scala.concurrent.duration._
  system.scheduler.scheduleOnce(0 millis){
    println("ha ha")
  }

}
