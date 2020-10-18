package DataStructures.MaximumRemovals;

import java.util.TreeMap;

class Tree {

    static final TreeMap<String, Node> nodes = new TreeMap<>();
    static int max = 0;

    static class Node implements Comparable<Node>{

        String data;
        int level=0;
        Node previous;
        Node left;
        Node right;


        final String leftMove = "actor";
        final String rightMove = "intact";

        Node(){
        }

        Node(String data) {
            this.data = data;
            nodes.put(data,this);
            int leftIndex = data.indexOf(leftMove);
            int rightIndex = data.indexOf(rightMove);
            if(leftIndex!=-1) {
                StringBuilder leftData = new StringBuilder(data);
                leftData.delete(leftIndex, leftIndex + 5);
                if(!nodes.containsKey(leftData.toString())) {
                    setLeft(new Node(leftData.toString(), this, this.level + 1));
                }
                else setLeft(nodes.get(leftData.toString()));
            }
            else setLeft(null);
            if(rightIndex!=-1) {
                StringBuilder rightData = new StringBuilder(data);
                rightData.delete(rightIndex, rightIndex + 6);
                if(!nodes.containsKey(rightData.toString())) {
                    setRight(new Node(rightData.toString(), this, this.level + 1));
                }
                else setRight(nodes.get(rightData.toString()));
            }
            else setRight(null);
        }

        Node(String data, Node previous, int level) {
            this.level = level;
            this.data = data;
            this.previous = previous;
            nodes.put(data,this);
            if(level>max) max=level;
            int leftIndex = data.indexOf(leftMove);
            int rightIndex = data.indexOf(rightMove);
            if(leftIndex!=-1) {
                StringBuilder leftData = new StringBuilder(data);
                leftData.delete(leftIndex, leftIndex + 5);
                if(!nodes.containsKey(leftData.toString())) {
                    setLeft(new Node(leftData.toString(), this, this.level + 1));
                }
                else setLeft(nodes.get(leftData.toString()));
            }
            else setLeft(null);
            if(rightIndex!=-1) {
                StringBuilder rightData = new StringBuilder(data);
                rightData.delete(rightIndex, rightIndex + 6);
                if(!nodes.containsKey(rightData.toString())) {
                    setRight(new Node(rightData.toString(), this, this.level + 1));
                }
                else setRight(nodes.get(rightData.toString()));
            }
            else setRight(null);
        }

        public Node singleNode(String data) {
            Node n = new Node();
            n.setData(data);
            return n;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Node o) {
            return this.data.compareToIgnoreCase(o.data);
        }
    }
}

class Challenge {
    public static int moves(String start) {
        Tree.nodes.clear();
        Tree.max = 0;
        Tree.Node root = new Tree.Node(start);

        return Tree.max;
    }
}
