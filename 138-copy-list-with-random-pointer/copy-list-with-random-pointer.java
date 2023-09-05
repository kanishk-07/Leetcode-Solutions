/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copy = head;
        HashMap<Node, Node> map = new HashMap<>();
        while(head!=null) {
            Node newNode = null, newNext = null, newRandom = null;
            if(map.containsKey(head)) {
                newNode = map.get(head);
            } else {
                newNode = new Node(head.val);
                map.put(head, newNode);
            }
            if(map.containsKey(head.next)) {
                newNext = map.get(head.next);
            } else if (head.next!=null) {
                newNext = new Node(head.next.val);
                map.put(head.next, newNext);
            }
            if(map.containsKey(head.random)) {
                newRandom = map.get(head.random);
            } else if (head.random!=null) {
                newRandom = new Node(head.random.val);
                map.put(head.random, newRandom);
            }
            newNode.next = newNext;
            newNode.random = newRandom;
            head = head.next;
        }
        return map.get(copy);
    }
}