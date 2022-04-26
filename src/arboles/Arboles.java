/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Juana García
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BTree tongueTwister;
        BTree.BNode subtree;
        BTree.BNode tmp;

    try {
      tongueTwister = new BTree("Tres");

      subtree = new BTree.BNode("tristes");
      tongueTwister.getRoot().insert(subtree, BTree.LEFT_SIDE);
      tmp = new BTree.BNode("tigres");
      tongueTwister.getRoot().insert(tmp, BTree.RIGHT_SIDE);
      tmp = new BTree.BNode("comian");
      subtree.insert(tmp, BTree.LEFT_SIDE);
      tmp = new BTree.BNode("trigo");
      subtree.insert(tmp, BTree.RIGHT_SIDE);

    } catch (BTreeException ex) {
      System.out.println(ex.getMessage());
      return;
    }

    tongueTwister.preorder();
    System.out.println("------------------");
    tongueTwister.inorder();
    System.out.println("------------------");
    tongueTwister.postorder();

    System.out.println("------------------");
    System.out.println("------------------");

    try {
      subtree = tongueTwister.getRoot().getLeft().extract(BTree.LEFT_SIDE);
      tongueTwister.getRoot().getRight().insert(subtree, BTree.LEFT_SIDE);

      subtree = tongueTwister.getRoot().getLeft().extract(BTree.RIGHT_SIDE);
      tongueTwister.getRoot().getRight().insert(subtree, BTree.RIGHT_SIDE);

      tongueTwister.preorder();

    } catch (BTreeException ex) {
      System.out.println(ex.getMessage());
    }

  }
    }
    

