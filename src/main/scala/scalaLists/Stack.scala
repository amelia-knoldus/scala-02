class Stack(val maxSize: Int, val size: Int = 0, val stack: List[Any] = List()) {
    override def toString = s"$stack"

    def peek: Any = if (this.isEmpty) println("Stack Empty!") else stack.head

    def pop: Stack = {
        require(size > 0, "Cannot pop empty stack!")
        new Stack(maxSize = maxSize, size = size -1, stack = stack.tail)
    }

    def push(elem: Any): Stack = {
        require(size + 1 <= maxSize, "Cannot push onto full Stack!")
        new Stack(maxSize = maxSize, size = size + 1, stack = elem +: stack)
    } 

    def isEmpty: Boolean = stack.isEmpty

    def isFull: Boolean = stack.size == maxSize
}