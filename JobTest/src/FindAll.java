/**
 * Created by luzhang on 2017/3/22.
 *
 */
public class FindAll {
    public int find(TrieNode root, String s) {
        int sum = 0;
        char[] ss = s.toCharArray();
        int i = 0;
        TrieNode current = root;

        while (i < ss.length) {
            char sr = ss[i];
            if ('0' <= sr&& sr <= '9') {
                if (current.next[ss[i] - '0'] != null) {
                    current = current.next[ss[i] - '0'];
                    if (current.flag) {
                        //最后一个字符
                        sum++;
                        current = root;
                    }
                } else {
                    break;
                }
                i++;
                continue;
            }
            if ('a' <= sr&& sr <= 'z') {
                if (current.next[ss[i] - 'a'+10] != null) {
                    current = current.next[ss[i] - 'a'+10];
                    if (current.flag) {
                        //最后一个字符
                        sum++;
                        current = root;
                    }
                }else {
                    break;
                }
                i++;
                continue;

            }
            if ('A' <= sr&& sr <= 'Z') {
                if (current.next[ss[i] - 'A'+36] != null) {
                    current.next[ss[i] - 'A'+36] = new TrieNode();
                    if (current.flag) {
                        //最后一个字符
                        sum++;
                        current = root;
                    }
                }else {
                    break;
                }
            }
            i++;
        }

        return sum;

    }
}
