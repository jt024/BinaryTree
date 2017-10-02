/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/** Class ***********************************
 *  Name: Node
 *  Description: Object holds String value and
 * @author jt024
 */
/* Class containing left and right child of current
   node and key value*/
public class Node
{
    private static int totalNodes;
    
    public String word;
    public int count;
    public Node left, right;
    
    
    public int getTotalNodes()
    {
        return totalNodes;
    }
    
    public Node(String word, int add)
    {
        this.word = word;
        this.count = 1;
        left = right = null;
    }
    
    
    
}
