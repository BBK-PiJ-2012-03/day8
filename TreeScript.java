public class TreeScript {
 // private Tree myTree;
  
 public static void main(String[] args) {
 TreeScript script = new TreeScript();
 script.launch();
 }
 
 public void launch() {
 IntegerTreeNode myTree = new IntegerTreeNode(6);
 
 myTree.add(9);
 myTree.add(5);
 myTree.add(3);
 myTree.add(11);
 myTree.add(12);
 myTree.add(8);
 myTree.add(25);
 System.out.println(myTree.toString());
 
 System.out.println(myTree.contains(10));
 System.out.println(myTree.getMax());
 System.out.println(myTree.depth());
 }
 
}