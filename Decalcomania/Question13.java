public class Question13{
   static Board gameBoard = new Board(9);
   static String p1, p2;
   static boolean win = false;
   static int count = 0;
   static String [][] piece = new String [3] [3];
   static final String [] CLR = {"cyan", "yellow", "white", "blue", "red", "pink", "green", "black", "orange"};
   public static void setUpBoard(){
      for(int i = 0; i < 3; i++){
         for (int j = 0; j < 3; j++){
            piece[i][j] = "";
         }
      }
   }
   public static void pickcolour(){
      Coordinate clickSpot;
      int col = 0;
      //player 1
      gameBoard.displayMessage("Player 1 Pick the colour!");
      for (int i = 0; i < 9; i++){
         gameBoard.putPeg(CLR [i], i);
      }
      clickSpot = gameBoard.getClick();
      col = clickSpot.getCol();
      for (int i = 0; i < 9; i++){
         if (i == col){
            p1 = CLR [i];
         }
      }
      //player 2
      gameBoard.displayMessage("Player 2 Pick the colour!");
      while(true){
         for (int i = 0; i < 9; i++){
            gameBoard.putPeg(CLR [i], i);
         }
         clickSpot = gameBoard.getClick();
         col = clickSpot.getCol();
         for (int i = 0; i < 9; i++){
            if (i == col){
               p2 = CLR [i];
            }
         }
         if (p2.equals(p1) == false){
            break;
         }
         else{
            gameBoard.displayMessage("Player 1 already picked that colour, choose different one!");
         }
      }
      gameBoard = new Board(3, 3);
   }
   public static void movePiece(int r, int c) throws InterruptedException{
      if (count % 2 == 0){
         if (piece [r] [c].equals("")){
            gameBoard.putPeg(p1, r, c);
            piece [r] [c] = "p1";
            count++;
         }
         else{
            gameBoard.displayMessage("You can't put it there, try again!");
            Thread.sleep(1000);
         }
      }
      else if (count % 2 == 1){
         if (piece [r] [c].equals("")){
            gameBoard.putPeg(p2, r, c);
            piece [r] [c] = "p2";
            count++;
         }
         else{
            gameBoard.displayMessage("You can't put it there, try again!");
            Thread.sleep(1000);
         }
      }
   }
   public static void winner (){
      for (int j = 0; j < 3; j++){
         if ((((piece [0] [j] == piece [1] [j])&&(piece [1] [j] == piece [2] [j]))) && (piece [0] [j].equals("") == false)){
            win = true;
         }
         if ((((piece [j] [0] == piece [j] [1])&&(piece [j] [1] == piece [j] [2]))) && (piece [j] [0].equals("") == false)){
            win = true;
         }
         if ((((piece [0] [0] == piece [1] [1])&&(piece [1] [1] == piece [2] [2]))) && (piece [0] [0].equals("") == false)){
            win = true;
         }
         if ((((piece [0] [2] == piece [1] [1])&&(piece [1] [1] == piece [2] [0]))) && (piece [0] [2].equals("") == false)){
            win = true;
         }
      }
   }
   public static void main (String [] args)throws InterruptedException{
      Coordinate clickSpot;
      int row = 0, col = 0, end;
      pickcolour();
      setUpBoard();
      gameBoard.displayMessage("Ready to Play Tic Tac Toe?");
      Thread.sleep(1000);
      while(true){
         end = 0;
         if (count % 2 == 0){
            gameBoard.displayMessage("It is Player 1's turn");
         }
         else if (count % 2 == 1){
            gameBoard.displayMessage("It is Player 2's turn");
         }
         clickSpot = gameBoard.getClick();
         row = clickSpot.getRow();
         col = clickSpot.getCol();
         movePiece(row, col);
         winner();
         if (win){
            break;
         }
         for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               if (piece[i][j].equals("")){
                  end++;
               }
            }
         }
         if (end == 0){
            gameBoard.displayMessage("It is a tie!");
            return
         }
      }
      if (count % 2 == 0){
         gameBoard.putPeg(p2, 1, 1);
         Thread.sleep(300);
         for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               gameBoard.putPeg(p2, i, j);
            }
         }
         Thread.sleep(500);
         gameBoard.displayMessage("Player 2 wins!");
      }
      else if (count % 2 == 1){
         gameBoard.putPeg(p1, 1, 1);
         Thread.sleep(300);
         for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               gameBoard.putPeg(p1, i, j);
            }
         }
         Thread.sleep(500);
         gameBoard.displayMessage("Player 2 wins!");
      }
   }
}