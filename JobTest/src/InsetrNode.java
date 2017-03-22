
/**
 * Created by luzhang on 2017/3/22.
 *
 */
public class InsetrNode {

    public void insert(TrieNode root, String s) {
        if (s == null) {
            return;
        }
        if (root == null) {
            root = new TrieNode();
        }
        char[] ss = s.toCharArray();
        int i = 0;
        TrieNode current = root;
        while (i < ss.length) {
            char sr = ss[i];
            if ('0' <= sr&& sr <= '9') {
                if (current.next[ss[i] - '0'] == null) {
                    current.next[ss[i] - '0'] = new TrieNode();
                }
                current = current.next[ss[i] - '0'];
                if (i == ss.length - 1) {
                    //最后一个字符
                    current.flag = true;
                }
                i++;
            }
            if ('a' <= sr&& sr <= 'z') {
                if (current.next[ss[i] - 'a'+10] == null) {
                    current.next[ss[i] - 'a'+10] = new TrieNode();
                }
                current = current.next[ss[i] - 'a'+10];
                if (i == ss.length - 1) {
                    //最后一个字符
                    current.flag = true;
                }
                i++;
            }
            if ('A' <= sr&& sr <= 'Z') {
                if (current.next[ss[i] - 'A'+36] == null) {
                    current.next[ss[i] - 'A'+36] = new TrieNode();
                }
                current = current.next[ss[i] - 'A'+36];
                if (i == ss.length - 1) {
                    //最后一个字符
                    current.flag = true;
                }
                i++;
            }

        }

    }

}
