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
    private static int totalNodes;
    
    public String word;
    public int count;
    public Node left, right;

    /** Constructor ******************************************************
    ** Name: Node()                                                      *
    ** Description: Creates Node object with payload value               *
    ** @author jt024                                                     *
    ** @param word                                                       *
    **********************************************************************/    
    public Node(String word)
    {
        this.word = word;
        this.count = 1;
        left = right = null;
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
    

    
    
    
}
