package listaDoblementeEnlzada;

public class Node <T>{
	
	T data;
	Node <T> next;
	Node <T> previous;

    // Constructor
    public Node(T d) {
        data = d;
        next = null;
        previous = null;
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
    
}
