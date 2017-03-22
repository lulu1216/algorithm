import java.util.ArrayList;
import java.util.List;

/**
 * Created by luzhang on 2017/3/22.
 *
 */
public class Main {
    public static TrieNode root = new TrieNode();
    public static void main(String[] args) {
        InsetrNode insetrNode = new InsetrNode();
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("abc123");
        list.add("qwert");
        list.add("yuio");
        list.add("yuio123abc");
        list.add("123aab");
        list.add("123");
        // TODO: 2017/3/22  这种情况在程序里还需要更深入的考虑
        list.add("a");
        list.add("a1");
        list.add("a12");
        list.add("a1aa12");
        for (String s : list) {
            insetrNode.insert(root, s);
        }
        for (String s : list) {
            FindAll findAll = new FindAll();
            int sum = findAll.find(root, s);
            if (sum >= 2) {
                System.out.println(s);
            }
        }

    }
}
