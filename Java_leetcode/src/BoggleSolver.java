public class BoggleSolver {

    public static void main(String[] args) {
        //TL, TR, TR,BL,B,BR,R
        static int[] rows={-1,-1,-1,1,1,0,1,0};
        static int[] cols={-1,0,1,-1,0,}
        char[][] board={
                {'B','P','E','A'},{},{},{}
        }

        String[] dict = {"BREAD", "XRAY", "MOM", "DAD"};

        boggleSolver(boggle, dict);
    }

    private static void boggleSolver(char[][] boggle, String[] dict) {

        Hashset<String> set = new HashSet<>();

        for (String word : dict) {
            set.add(word);
        }
        boolean[][] isVisited =new boolean[board.length][board[0].length]
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board; )
        }

    }

    private static boolean isValid
}