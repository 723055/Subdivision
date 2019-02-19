import java.util.TreeMap;

public class CompanyTree {

    private Node root = new Node();

    public void insert(String s) {
        String[] strings = s.split("\\\\");

        Node cur = root;

        for (int i = 0; i < strings.length; i++) {
            Node k1 = new Node();
            if (cur.children.containsKey(strings[i])) {
                cur = cur.children.get(strings[i]);
            } else {
                cur.children.put(strings[i], k1);
                cur = k1;
            }
        }
    }

    private void print(String prefix, Node cur, String name) {
        System.out.println(prefix + name);
        for (String entry : cur.children.descendingKeySet()) {
            Node s = cur.children.get(entry);
            print(prefix + name + "\\", s, entry);
        }
    }

    public void print() {
        for (String entry : root.children.descendingKeySet()) {
            Node s = root.children.get(entry);
            print("", s, entry);
        }
    }

    private static class Node {

        TreeMap<String, Node> children = new TreeMap<>();

        public Node get(String s) {
            return children.get(s);
        }
    }
}
