import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListFuncSpec extends AnyFlatSpec with Matchers {

    "printList" should "print elements of the list to the console" in {

        ListFunc.printList(List(1, 2, 3, 4, 5)) shouldEqual ()

    }

    "printList of empty list" should "print \"List is empty!\"" in {

        ListFunc.printList(List()) shouldEqual ()

    }

    "Last element of List(1, 2, 3, 4, 5)" should "return (5, \"index: 4\")" in {

        ListFunc.findLast(List(1, 2, 3, 4, 5)) shouldEqual (5, "index: 4")

    }

    "Last element of list with one element List(1)" should "return (1, \"index: 0\")" in {

        ListFunc.findLast(List(1)) shouldEqual (1, "index: 0")

    }
}