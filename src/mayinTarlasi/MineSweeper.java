package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;

    public MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    public void menu() {
        System.out.println("\n====================================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !\n");
        String menu = "1- Oyuna Başla\n" +
                "2- Çık\n";

        boolean isEntryWrong = false;

        Scanner input = new Scanner(System.in);
        System.out.println(menu);

        System.out.print("Seçiminiz : ");
        int select = input.nextInt();

        if (select < 1 || select > 2){
            isEntryWrong = true;

            while (isEntryWrong) {
                System.out.println("Hatalı giriş yaptınız!\n");
                System.out.println(menu);
                System.out.print("Seçiminiz : ");
                select = input.nextInt();

                if (select == 1 || select == 2){
                    isEntryWrong = false;
                }
            }
        }

        if (select == 1) {
            run();
        }
        if (select == 2){
            System.out.println("Tekrar görüşmek üzere, iyi günler!");
        }
        input.close();
    }

    public String[][] createMineMap(String[][] openMap) {
        Random random = new Random();

        int numberOfMine = (rowNumber * columnNumber) / 4;

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                openMap[i][j] = "-";
            }
        }
        //Mayın oluşturma
        while (numberOfMine > 0) {
            String[] tempArray = new String[numberOfMine];

            for (int i = 0; i < tempArray.length; i++) {
                boolean isEqual = false;
                int rowMine = random.nextInt(rowNumber);
                int columnMine = random.nextInt(columnNumber);
                tempArray[i] = rowMine + "." + columnMine;
                // Mayın koordinat kontrolü
                for (int j = 0; j < tempArray.length; j++) {
                    if (i != j) {
                        if (tempArray[i].equals(tempArray[j])) {
                            isEqual = true;
                        }
                    }
                }
                if (isEqual == false) {
                    openMap[rowMine][columnMine] = "*";
                    numberOfMine--;
                } else {
                    i--;
                }
            }
        }
        System.out.println("\nMayınların Konumu \n");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(openMap[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("=============================");
        return openMap;
    }

    //Yakında kaç mayın olduğunu yazan algoritma
    public String[][] closestMine(String[][] openMap) {
        createMineMap(openMap);

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                int count = 0;
                if (openMap[i][j] != "*") {
                    if (i == 0 && j == 0) {
                        for (int k = i; k <= i + 1; k++) {
                            for (int n = j; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i != 0 && j != 0 && i < openMap.length - 1 && j < openMap[0].length - 1) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int n = j - 1; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i == 0 & j != 0 && j < openMap[0].length - 1) {
                        for (int k = i; k <= i + 1; k++) {
                            for (int n = j - 1; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i != 0 & j == 0 && i < openMap.length - 1) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int n = j; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i == openMap.length - 1 && j == openMap[0].length - 1) {
                        for (int k = i - 1; k <= i; k++) {
                            for (int n = j - 1; n <= j; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i == openMap.length - 1 && j != openMap[0].length - 1 && j > 0) {
                        for (int k = i - 1; k <= i; k++) {
                            for (int n = j - 1; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i != openMap.length - 1 && j == openMap[0].length - 1 && i > 0) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int n = j - 1; n <= j; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i == openMap.length - 1 && j == 0) {
                        for (int k = i - 1; k <= i; k++) {
                            for (int n = j; n <= j + 1; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    } else if (i == 0 && j == openMap[0].length - 1) {
                        for (int k = i; k <= i + 1; k++) {
                            for (int n = j - 1; n <= j; n++) {
                                if (openMap[k][n] == "*") {
                                    count++;
                                }
                            }
                        }
                    }
                    String count1 = Integer.toString(count);
                    openMap[i][j] = count1;
                }
            }
        }
        return openMap;
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        String[][] openMap = new String[rowNumber][columnNumber];
        closestMine(openMap);
        String[][] hideMap = new String[rowNumber][columnNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                hideMap[i][j] = "-";
            }
        }

        int turn = 0;
        int numberOfMine = (rowNumber * columnNumber) / 4;
        int lastTurn = (rowNumber * columnNumber) - numberOfMine;

        boolean isWin = false;
        boolean isFindMine = false;

        while (isWin != true && isFindMine != true) {

            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < columnNumber; j++) {
                    System.out.print(hideMap[i][j] + "  ");
                }
                System.out.println();
            }

            boolean isEntryWrong = false;

            System.out.print("\nSatır Giriniz : ");
            int row = input.nextInt();

            if (row < 0 || row > rowNumber - 1){
                isEntryWrong = true;

                while (isEntryWrong) {
                    System.out.println("Hatalı giriş yaptınız!");
                    System.out.print("\nSatır Giriniz : ");
                    row = input.nextInt();

                    if (row >= 0 && row < rowNumber){
                        isEntryWrong = false;
                    }
                }
            }

            System.out.print("\nSütun Giriniz : ");
            int column = input.nextInt();

            if (column < 0 || column > columnNumber - 1){
                isEntryWrong = true;

                while (isEntryWrong) {
                    System.out.println("Hatalı giriş yaptınız!");
                    System.out.print("\nSütun Giriniz : ");
                    column = input.nextInt();

                    if (column >= 0 && column < columnNumber){
                        isEntryWrong = false;
                    }
                }
            }


            hideMap[row][column] = openMap[row][column];

            if (hideMap[row][column] == "*") {
                isFindMine = true;
                System.out.println("\nGame Over!!");
                System.out.println("\nMayınların Konumu \n");
                for (int i = 0; i < rowNumber; i++) {
                    for (int j = 0; j < columnNumber; j++) {
                        System.out.print(openMap[i][j] + "  ");
                    }
                    System.out.println();
                }
            }
            turn++;

            if (turn == lastTurn) {
                isWin = true;
                System.out.println("\nTebrikler, Oyunu Kazandınız!");
                System.out.println("\nMayınların Konumu \n");
                for (int i = 0; i < rowNumber; i++) {
                    for (int j = 0; j < columnNumber; j++) {
                        System.out.print(openMap[i][j] + "  ");
                    }
                    System.out.println();
                }
            }
            System.out.println("\n====================================");
        }
        menu();
        input.close();
    }
}
