import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QueueSpec extends AnyFlatSpec with Matchers {
    "new Queue(5)" should "initialize empty Queue with capacity of 5" in {
        
        q0.capacity shouldEqual 5
        q0.size shouldEqual 0
        q0.front shouldEqual None
        q0.rear shouldEqual None
        q0.isEmpty shouldEqual true
        q0.isFull shouldEqual false

    }

    "Calling enqueue on an empty queue" should "add to the front and rear of the queue and increase size by 1" in {

        val queue1 = q0.enqueue(1)

        queue1.size shouldEqual 1
        queue1.front shouldEqual 1
        queue1.rear shouldEqual 1
        queue1.isEmpty shouldEqual false
        queue1.isFull shouldEqual false
    }


    "Calling enqueue on a non-empty queue" should "add to the rear of the queue and increase size by 1" in {

        val queue2 = q1.enqueue(2)

        queue2.size shouldEqual 2
        queue2.front shouldEqual 1
        queue2.rear shouldEqual 2

    }

    "Calling enqueue on a full queue" should "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            q5.enqueue(6)
        }
    }

    "Calling dequeue on an empty queue" should "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            q0.dequeue
        }
    }

    "Calling dequeue on a non-empty queue" should "change front of queue and decrease size by 1" in {
        
        val queue3 = q5.dequeue

        queue3.size shouldEqual 4
        queue3.front shouldEqual 2
        queue3.rear shouldEqual 5

    }

    "Calling dequeue on a queue with size 2" should "change front and rear of queue and decrease size by 1" in {
        
        val queue4 = q2.dequeue

        queue4.size shouldEqual 1
        queue4.front shouldEqual 2
        queue4.rear shouldEqual 2
        
    }

    "Calling dequeue on a queue with size 1" should "return empty queue" in {
        
        val queue5 = q1.dequeue

        queue5.size shouldEqual 0
        queue5.front shouldEqual None
        queue5.rear shouldEqual None
        
    }
}