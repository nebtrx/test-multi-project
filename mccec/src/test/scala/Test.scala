import com.latam.model.{ Profile, User }
import monocle.macros.GenLens
import org.scalatest.FunSuite

class Test extends FunSuite {

  test("mccec can use common sub-project") {
    val entity = User("id", Profile("value"))
  }

  test("multi1 can use monocle dependency ") {
    val idLens = GenLens[User](_.id)
  }
}
