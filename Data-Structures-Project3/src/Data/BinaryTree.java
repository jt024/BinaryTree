package Data;

/**
 *
 * @author jt024
 */
// A Java program to introduce Binary Tree
public class BinaryTree {
    
// <editor-fold defaultstate="collapsed" desc="Private Field Variables">
    private Node root;
    private StringBuilder sb = new StringBuilder();
// </editor-fold>
    
// <editor-fold defaultstate="collapsed" desc="Constructors">
    public BinaryTree(String word){
        root = new Node(word);}
    public BinaryTree(){
        root = null;}
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Accessors">    
    public Node getRoot(){
        return this.root;
    }
// </editor-fold>    

// <editor-fold defaultstate="collapsed" desc="Mutators">    
    
    public void setRoot(Node newRoot){
        this.root = newRoot;
    }
    
    
// </editor-fold>    
    
// <editor-fold defaultstate="collapsed" desc="Class Methods">    
    
    public void addNode(String word){
    
        Node newNode = new Node(word);  
    
        if (root==null) {
            root=newNode;
        } else {
            Node focus = root;
            
            Node parent;
            
            
            
            while(true){
                parent = focus;
                
                if (word.compareToIgnoreCase(focus.getWord())<0) {
                    focus = focus.getLeft();
                    
                    if (focus==null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else if(word.compareToIgnoreCase(focus.getWord())==0) {
                    focus.incCount();
                    return;
                    
                    } else{
                    focus = focus.getright();
                    
                    if (focus == null) {
                        
                        parent.setRight(newNode);
                        return;
                    }
                }
                
                
                
            }
        }
    }    
    
    
    /** Method ********************************************************
    ** Name: inOrder()                                                *
    ** Description: recursively steps through tree with the idea that *
    ** each child of a tree is a root of its subtree.                 *
    ** @author jt024                                                  *
     * @param focus
     * @return
    ******************************************************************/     
    public String inOrder (Node focus){ 
    if (focus.left != null){
        inOrder (focus.left);
    }
    sb.append(focus.toString());
    if (focus.right != null){
        inOrder (focus.right);
    }
    
    return sb.toString();
    
}
    
    
    
// </editor-fold>    
    
    
}