package Data;

/**
 *
 * @author jt024
 */
// A Java program to introduce Binary Tree
public class BinaryTree {
    
// <editor-fold defaultstate="collapsed" desc="Private Field Variables">
    private Node root;
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
    
    
    
    
    
// </editor-fold>    
    
    
}