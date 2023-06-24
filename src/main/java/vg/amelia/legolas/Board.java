package vg.amelia.legolas;

public class Board {

   public static final int BORDER = 99;

   public static final int EMPTY = 0;

   public static final int WHITE_PAWN = 1;

   public static final int WHITE_ROOK = 2;

   public static final int WHITE_BISHOP = 3;

   public static final int WHITE_KNIGHT = 4;

   public static final int WHITE_QUEEN = 5;

   public static final int WHITE_KING = 6;

   public static final int BLACK_PAWN = -1;

   public static final int BLACK_ROOK = -2;

   public static final int BLACK_BISHOP = -3;

   public static final int BLACK_KNIGHT = -4;

   public static final int BLACK_QUEEN = -5;

   public static final int BLACK_KING = -6;


    int[] board = new int[120];


    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        // All borders
        for (int i = 0; i < 120; i++) {
            board[i] = BORDER;
        }

        // Empty fields
        for (int i = 2; i <= 8; i++) {
            for (int n = 0; n < 8; n++) {
                board[i * 10 + n + 1] = EMPTY;
            }
        }

        // Place figures white
        for (int i = 31; i <= 38; i++) {
            board[i] = WHITE_PAWN;
        }
        board[21] = WHITE_ROOK;
        board[22] = WHITE_KNIGHT;
        board[23] = WHITE_BISHOP;
        board[24] = WHITE_QUEEN;
        board[25] = WHITE_KING;
        board[26] = WHITE_BISHOP;
        board[27] = WHITE_KNIGHT;
        board[28] = WHITE_ROOK;

        // Place figures black
        for (int i = 81; i <= 88; i++) {
            board[i] = BLACK_PAWN;
        }
        board[91] = BLACK_ROOK;
        board[92] = BLACK_KNIGHT;
        board[93] = BLACK_BISHOP;
        board[94] = BLACK_QUEEN;
        board[95] = BLACK_KING;
        board[96] = BLACK_BISHOP;
        board[97] = BLACK_KNIGHT;
        board[98] = BLACK_ROOK;

    }


    public String dumpBoard() {

        StringBuilder result = new StringBuilder();


        for (int i = 9; i > 1; i--) {
            for (int n = 0; n < 8; n++) {

               switch (board[i * 10 + n + 1]) {
                   case WHITE_PAWN:  {
                       result.append("[WP]");
                       break;
                   }
                   case WHITE_ROOK:  {
                       result.append("[WR]");
                       break;
                   }
                   case WHITE_KNIGHT:  {
                       result.append("[WN]");
                       break;
                   }
                   case WHITE_BISHOP:  {
                       result.append("[WB]");
                       break;
                   }
                   case WHITE_QUEEN:  {
                       result.append("[WQ]");
                       break;
                   }
                   case WHITE_KING:  {
                       result.append("[WK]");
                       break;
                   }
                   case BLACK_PAWN:  {
                       result.append("[bp]");
                       break;
                   }
                   case BLACK_ROOK:  {
                       result.append("[br]");
                       break;
                   }
                   case BLACK_KNIGHT:  {
                       result.append("[bn]");
                       break;
                   }
                   case BLACK_BISHOP:  {
                       result.append("[bb]");
                       break;
                   }
                   case BLACK_QUEEN:  {
                       result.append("[bq]");
                       break;
                   }
                   case BLACK_KING:  {
                       result.append("[bk]");
                       break;
                   }
                   default: {
                       result.append("[  ]");
                   }
               }

           }
            result.append(System.lineSeparator());
        }


        return result.toString();

    }


}
