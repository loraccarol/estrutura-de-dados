package projarvorebinaria;

public class Node {
    private String elemento;
    private Node left, right, parent;

    public Node(String elemento) {
        this.elemento = elemento;
    }

    public void exibeNo() {
        System.out.print(elemento + "-");
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}