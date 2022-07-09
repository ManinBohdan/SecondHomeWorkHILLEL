public class CustomLinkedList<T> implements CustomList, CustomDeque{
    public int size;
    public Node <T> first;
    public Node <T> last;
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return node(index).item;
    }

    Node<T> node(int index) {
        // assert isElementIndex(index);
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    @Override
    public void addLast(Object element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node(l, element, null);
        last = newNode;
        if (l == null){
            first = newNode;
        }
        else{
            l.next = newNode;
        }

        size++;
    }

    @Override
    public void addFirst(Object o) {
        final Node<T> f = first;
        final Node<T> newNode = new Node(null, o, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

}
