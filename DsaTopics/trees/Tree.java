package DsaTopics.trees;

import java.util.List;

public class Tree {
    Node root;
    int size;
    public Tree(){
        this.size=-1;
    }


    public Node buildTree(int[] nodes){
        size++;
        if(size>nodes.length-1||nodes[size]==-1){
            return null;
        }
        Node newNode=new Node(nodes[size]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }

    public void inOrder(Node tree, List<Integer> b){
        if(tree==null){
            return;
        }
        inOrder(tree.left,b);
        b.add(tree.value);
        inOrder(tree.right,b);
    }

    public int count(Node tree){
        if (tree==null){
            return 0;
        }
        int leftCount=count(tree.left);
        int rightCount=count(tree.right);
        return leftCount+rightCount+1;

    }
}
