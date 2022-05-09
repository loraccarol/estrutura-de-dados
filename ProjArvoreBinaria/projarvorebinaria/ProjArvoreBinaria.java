package projarvorebinaria;

public class ProjArvoreBinaria {
    public static void main(String[] args) throws Exception{
        
        BinaryTree dir = new BinaryTree();
        
        Node n1 = new Node("RAIZ");
        dir.addRoot(n1);

        Node n2 = new Node("MACKENZIE");
        dir.addLeft(n2, n1);

        Node n3 = new Node("PESSOAL");
        dir.addRight(n3, n1);

        Node n4 = new Node("TRABALHOS");
        dir.addLeft(n4, n2);
        Node n5 = new Node("PROGRAMAS");
        dir.addRight(n5, n2);

        Node n6 = new Node("LP2");
        dir.addLeft(n6, n5);
        Node n7 = new Node("ESTRUTURA");
        dir.addRight(n7, n5);

        dir.setRoot(n1);

        System.out.println("Pre-ordem:");
        dir.visitaPreOrdem(dir.getRoot());

        System.out.println("\n\nPos-ordem:");
        dir.visitaPosOrdem(dir.getRoot());

        System.out.println("\n\nIn-ordem:");
        dir.visitaInOrdem(dir.getRoot());

    }
}
