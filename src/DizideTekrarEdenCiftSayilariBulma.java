public class DizideTekrarEdenCiftSayilariBulma {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 6, 6, 8, 7, 8, 9, 7, 4, 6, 1, 3, 3, 9, 7, 5, 6, 14, 6, 12, 3, 1, 5, 6, 8, 7,12, 7};
        int[] kopya = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i]) == list[j]) {
                    if (isFind(kopya, list[i])) {
                        //System.out.println(list[i]);
                        kopya[index] = list[i];
                        index++;
                        break;
                    }
                }
            }
        }
        for (int i: kopya){
            if (i!=0 && i%2==0){
                System.out.println(i);
            }
        }
    }
}
