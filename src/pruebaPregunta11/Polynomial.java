package pruebaPregunta11;

public class Polynomial {
    Node head;

    public Polynomial() {
        this.head = null;
    }

    public void insertTerm(double coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public double evaluate(double x) {
        double result = 0;
        Node temp = head;
        while (temp != null) {
            result += temp.coefficient * Math.pow(x, temp.exponent);
            temp = temp.next;
        }
        return result;
    }
}
