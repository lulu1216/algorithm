/**
 * Created by luzhang on 2017/3/22.
 * 建立TrieNode类用来存储所有的字符串
 */
public class TrieNode {

    //判断是否是一个序列号串的终止(最后一个字母)
    boolean flag = false;
    TrieNode[] next = new TrieNode[62];
    public TrieNode(){
        for (int i = 0; i < 62; i++) {
            next[i] = null;
        }
    }
}
