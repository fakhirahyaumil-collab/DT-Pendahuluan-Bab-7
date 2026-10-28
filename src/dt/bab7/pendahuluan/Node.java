/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dt.bab7.pendahuluan;

/**
 *
 * @author fakhirah yaumil
 */
public class Node {
    public int id;
    public String data;
    public Node leftChild; 
    public Node rightChild;
    
    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " } ");
    }

}
