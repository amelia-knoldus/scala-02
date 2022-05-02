class Queue(val capacity: Int, val size: Int = 0, val queue: List[Any] = List(), val front: Any = None, val rear: Any = None) {
    override def toString = s"$queue"

    def enqueue(element: Any): Queue = {
    
        require(size + 1 <= capacity, "Queue is full! Cannot enqueue.")
        
        val newFront: Any = if (this.isEmpty) element else front

        new Queue(capacity, size = size + 1, queue = element +: queue, front = newFront, rear = element) 
    
    }

    def dequeue: Queue = {
    
        require(!this.isEmpty, "Queue is empty! Cannot dequeue.")
    
        val newFront = {
            if (queue.size >= 3) queue.drop(size - 2).head
            else if (queue.size == 2) queue.head
            else None
        }

        val newRear = if (queue.size > 1) rear else None

        new Queue(capacity, size - 1, queue.take(size - 1), front = newFront, rear = newRear)

    }

    def isFull: Boolean = queue.size == capacity

    def isEmpty: Boolean = queue.isEmpty
}