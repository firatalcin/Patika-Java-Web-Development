import java.sql.SQLOutput;
import java.util.Scanner;

public class MineSweeper {
    String[][] mineMap;
    String[][] game;
    int rowNumber;
    int colNumber;
    int mineNumber;

    MineSweeper(int row, int col){
        rowNumber = row;
        colNumber = col;
        mineMap = new String[row][col];
        game = new String[row][col];
        mineNumber = (row * col) / 4;
    }

    public void showingGameMap(){
        for(int i = 0; i< game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void gameMap(){
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                game[i][j] = "-";
            }
        }
    }

    public void minedMap(){
        for (int i = 0; i < mineNumber; i++){
            int tempRow = (int) (Math.random() * rowNumber);
            int tempCol = (int) (Math.random() * colNumber);
            if(mineMap[tempRow][tempCol] != "*"){
                mineMap[tempRow][tempCol] = "*";
            }else{
                i--;
            }
        }

        for(int i = 0; i < mineMap.length; i++){
            for(int j = 0; j < mineMap[i].length; j++){
                if(mineMap[i][j] != "*"){
                    mineMap[i][j] = "-";
                }
                System.out.print(mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void  showingMinedMap(){
        for(int i = 0; i< mineMap.length; i++){
            for(int j = 0; j < mineMap[i].length; j++){
                System.out.print(mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void run(){
        int totalMove = (colNumber * rowNumber) - mineNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mayınların Konumu");

        minedMap();

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz...");
        gameMap();


        while (totalMove > 0){
            int mineVision = 0;

            System.out.println("===========================");
            showingGameMap();

            System.out.print("Satır Giriniz: ");
            int rowInput = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int colInput = scanner.nextInt();

            if((rowInput < 0 || rowInput > rowNumber) || (colInput < 0 || colInput > colNumber)){
                System.out.println("Hatalı giriş yaptınız. Lütfen Sınırlar içerisinde seçim yapınız.");
                continue;
            }
            else{
                if (mineMap[rowInput][colInput] == "*"){
                    System.out.println("Mayına bastınız");
                    showingMinedMap();
                    break;
                }else {
                    int minusRow = (rowInput - 1), plusRow = (rowInput + 1);
                    int minusCol = (colInput - 1), plusCol = (colInput + 1);
                    if((minusRow < 0) || (minusCol < 0)){
                        minusCol = 0;
                        minusRow = 0;
                    }
                    if((plusRow > rowInput) || (plusCol > colInput )){
                        plusRow = rowInput;
                        plusCol = colInput;
                    }
                    for(int i = minusRow; i <= plusRow; i++){
                        for(int j = minusCol; j <= plusCol; j++){
                            if(mineMap[i][j] == "*"){
                                mineVision++;
                            }
                        }
                    }
                    String convertMineVision = String.valueOf(mineVision);
                    game[rowInput][colInput] = convertMineVision;
                    totalMove--;
                }
            }
        }
        if(totalMove == 0){
            System.out.println("Tebrikler Kazandınız.");
        }
    }
}
