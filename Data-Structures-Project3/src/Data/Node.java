package Data;

/** Class ***********************************************************
 *  Name: Node                                                      *
 *  Description: Class contains left and right child of current     *
 *  node, payload of current node, (key value for the node)         *
 *  and integer value for tracking                                  *
 * @author jt024                                                    *
 ********************************************************************/
public class Node
{
    private static int totalNodes=0;
    
    public String word;
    public int count;
    public Node left, right;
    
    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    /** Constructor ******************************************************
    ** Name: Node()                                                      *
    ** Description: Creates Node object with payload value               *
    ** @author jt024                                                     *
    ** @param word                                                       *
    **********************************************************************/    
    public Node(String word)
    {

        this.word = word;
        left = right = null;
        this.count = 1;
        totalNodes++;
    }

    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Accessors">    

    public String getWord(){
        return this.word;
    }
    public Node getLeft(){
        return left;
    }
    public Node getright(){
        return right;
    }
    public int getCount(){
        return this.count++;
    }
    
    /** Method ***********************************************************
    ** Name: getTotalNodes()                                             *
    ** Description: returns the total number of nodes to method caller   *
    ** @author jt024                                                     *
    ** @return                                                           *
    *********************************************************************/   
    public int getTotalNodes()
    {
        return totalNodes;
    }
    
    
    // </editor-fold>    
    
    
    // <editor-fold defaultstate="collapsed" desc="Mutators">    

    public void setWord(String word){
        this.word = word;
    }
    public void setLeft(Node left){
        this.left = left;
    }    
    public void setRight(Node right){
        this.right = right;
    }     
    public void setCount(int count){
        this.count=count;
    }
    public void incCount(){
        this.count++;
    }
    public void decCount(){
        this.count--;
    }

    // </editor-fold>    
    
    
    // <editor-fold defaultstate="collapsed" desc="Class Methods">    
    
    /** Method *** Name: toString() **************************************
    ** Description: Creates string format for load payload and count     *
    ** @author jt024                                                     *
    ** @return                                                           *
    **********************************************************************/ 
    @Override
    public String toString(){
        return this.word +" frequency = "+this.count+"\n";
    }
    // </editor-fold> 
    
    

    

    
    
    
}
