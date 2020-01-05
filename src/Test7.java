
public class Test7 {
    public int solution(int [][]board)
    {
	 int answer = 0;

     for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {

             if (board[i][j] == 0) continue;

             if ((i - 1 >= 0 && board[i - 1][j] > 0)
                     && (j - 1 >= 0 && board[i][j - 1] > 0)
                     && (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] > 0)) {

                 board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
             }

             answer = answer < board[i][j] ? board[i][j] : answer;
         }
     }
     return answer * answer;
     
 }
}
