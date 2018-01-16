import com.latam.model.{ Profile, User }

object Main extends App {
  println("mccmx can use common sub-project")

  val entity = User("id", Profile("value"))

  println("mccmx can use cats dependency")

  import cats._
  import cats.instances.all._

  val len: String => Int = _.length
  val length             = Functor[List].map(List("scala", "cats"))(len)
}
