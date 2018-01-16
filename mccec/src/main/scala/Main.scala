import com.latam.model.{ Profile, User }
import monocle.macros.GenLens

object Main extends App {
  println("multi1 can use common sub-project")

  val entity = User("id", Profile("value"))

  println("multi1 can use monocle dependency")

  val idLens = GenLens[User](_.id)
}
