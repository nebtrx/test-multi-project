import com.latam.model.{ Profile, User }
import org.scalatest.FunSuite

class Test extends FunSuite {

  test("mccmx can use common sub-project") {
    val entity = User("id", Profile("value"))
  }

  test("mccmx can use cats dependency") {
    import cats._
    import cats.instances.all._

    val len: String => Int = _.length
    val length             = Functor[List].map(List("scala", "cats"))(len)
  }
}
