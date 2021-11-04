public class TranspozMatris {
    public static void main(String[] args) {
        int[][] dizi = {{2, 3, 4}, {5, 6, 4}};
        int[][] transpose = new int[3][2];

        System.out.println("ORİJİNAL DİZİ  :");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(dizi[i][j] + " ");
            }
            System.out.print("\n");
        }
        // Dizi aktarılıyor.
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                transpose[j][i] = dizi[i][j];
            }
        }

        System.out.println("\nTRANSPOZE DİZİ :");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
