package lib.sjy.february.剑指offer;


/**
 * 力扣 79
 * <p>
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * <p>
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * <p>
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * 。
 */
public class offer12_矩阵中的路径 {

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println("字符串结果=" + exist(board, "ABCCDE"));
    }

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int x = -1;//数组标记
        int y = 0;//行标记
        int z = 0;//words标记
        int findSize = 0;
        for (int i = z; i < words.length; i++) {
            char c_word = words[i];
            hang:
            for (int j = y; j < board.length; j++) {
                y = j;
                char[] chars = board[j];//拿到每一行的数组
                for (int k = 0; k < chars.length; k++) {
                    char c = chars[k];
                    if (x != -1 && k <= x) {
                        continue;
                    }
                    if (c == c_word) {
                        findSize++;
                        System.out.println("拿到值=" + c + ",words[" + j + "," + k+"]");
                        x = k;//遍历从这里开始
                        break hang;
                    }
                    x = -1;
                }
            }
        }
        if ((findSize) == words.length) {
            return true;
        } else {
            return false;
        }
    }

}