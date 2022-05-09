package projarvorebinaria;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        // cria uma árvore binária vazia
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty() {
        // verifica se a árvore está vazia
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addRoot(Node e) throws Exception {
        // adiciona o Nó "e" como raiz
        if (isEmpty() == false) {
            throw new Exception("Árvore já tem raiz");
        }
    }

    public Node root() {
        return root;
    }

    public boolean isInternal(Node e) {
        // verifica se o nó "e" é interno
        if (e.getLeft() != null || e.getRight() != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeaf(Node e) {
        // verifica se o nó é folha
        if (e.getLeft() == null && e.getRight() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addLeft(Node e, Node p) throws Exception {
        // adiciona "e" como filho esquerdo de "p"
        if (p.getLeft() != null) {
            throw new Exception("Já existe filho esquerdo");
        }
        p.setLeft(e);
        e.setParent(p);
    }

    public Node left(Node e) {
        // retorna o filho à esquerda de "e"
        return e.getLeft();
    }

    public boolean hasLeft(Node e) {
        // verifica se e tem filha à esquerda
        if (e.getLeft() != null) {
            return true;
        } else {
            return false;
        }
    }

    public void addRight(Node e, Node p) throws Exception {
        // adiciona "e" como filho direito de "p"
        if (p.getRight() != null) {
            throw new Exception("Já existe filho direito");
        }
        p.setRight(e);
        e.setParent(p);
    }

    public Node right(Node e) {
        // retorna o filho à direita de "e"
        return e.getRight();
    }

    public boolean hasRight(Node e) {
        // verifica se e tem filha à direita
        if (e.getRight() != null) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(Node e) {
        // remove o "e" com todos os descendentes
        if (e == root) {
            root = null;
        } else {
            if (e.getParent().getLeft() == e) {
                e.getParent().setLeft(null);
            } else {
                if (e.getParent().getRight() == e) {
                    e.getParent().setRight(null);
                }
            }
        }
    }

    public void visitaPreOrdem(Node e) {
        // exibe tpdps os nós na forma RED
        if (e == null) {
            return;
        }
        e.exibeNo();
        visitaPreOrdem(e.getLeft());
        visitaPreOrdem(e.getRight());
    }

    public void visitaPosOrdem(Node e) {
        // exibe tpdps os nós na forma EDR
        if (e == null) {
            return;
        }
        visitaPosOrdem(e.getLeft());
        visitaPosOrdem(e.getRight());
        e.exibeNo();
    }

    public void visitaInOrdem(Node e) {
        // exibe tpdps os nós na forma ERD
        if (e == null) {
            return;
        }
        visitaInOrdem(e.getLeft());
        e.exibeNo();
        visitaInOrdem(e.getRight());
    }
}
