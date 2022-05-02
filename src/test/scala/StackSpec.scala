import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StackSpec extends AnyFlatSpec with Matchers {

    "new Stack(5)" should "initialize empty Stack with maxSize of 5" in {
        
        s0.maxSize shouldEqual 5
        s0.size shouldEqual 0
        s0.peek shouldEqual ()
        s0.isEmpty shouldEqual true
        s0.isFull shouldEqual false

    }

    "Calling pop on empty Stack" should "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            s0.pop
        }
    }

    "Calling push on a full Stack" should "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            s5.push(6)
        }
    }

    "Calling isEmpty on empty Stack" should "return true" in {
        s0.isEmpty shouldEqual true
    }

    "Calling isEmpty on non-empty Stack" should "return false" in {
        s2.isEmpty shouldEqual false
    }

    "Calling isFull on empty Stack" should "return false" in {
        s0.isFull shouldEqual false
    }

    "Calling isFull on non-full Stack" should "return false" in {
        s2.isFull shouldEqual false
    }

    "Calling isFull on full Stack" should "return true" in {
        s5.isFull shouldEqual true
    }

    "Calling push" should "add to the top of the stack and increase stack size by one" in {
        
        val stack1 = s0.push(1)

        stack1.stack shouldEqual List(1)
        stack1.size shouldEqual 1
        stack1.peek shouldEqual 1
        stack1.isEmpty shouldEqual false
        stack1.isFull shouldEqual false

    }

    "Calling pop" should "remove the top element of the stack and decrease stack size by one" in {
        
        val stack2 = s5.pop

        stack2.stack shouldEqual List(4, 3, 2, 1)
        stack2.size shouldEqual 4
        stack2.peek shouldEqual 4
        stack2.isEmpty shouldEqual false
        stack2.isFull shouldEqual false

    }


}
