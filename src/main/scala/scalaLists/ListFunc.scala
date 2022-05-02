object ListFunc {
    def printList(list: List[Any]): Unit = if (list.isEmpty) println("List is empty!") else for (elem <- list) println(elem)

    def findLast(list: List[Any], index: Int = 0): (Any, String) = {
        require(!list.isEmpty, "Cannot find last element of empty list!")
        if (list.tail.isEmpty) (list.head, s"index: $index") else findLast(list.tail, index + 1)
    }
}