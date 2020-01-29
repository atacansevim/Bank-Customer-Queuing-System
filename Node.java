
public class Node {
	private Customer x;
	private Node prev;
	private Node next;
	
	public Node(Customer x)
	{
		this.setX(x);
		this.prev = null;
		this.next = null;
	}

	public Customer getX() {
		return x;
	}

	public void setX(Customer x) {
		this.x = x;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
