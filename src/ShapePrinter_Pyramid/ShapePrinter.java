package ShapePrinter_Pyramid;

public class ShapePrinter {
    public void printPyramid(int height) {
        String star = "*";
        String blank = " ";

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height- i; j++){
                System.out.print(blank);
            }
            for (int k = 1; k <= i*2 - 1; k++){
                System.out.print(star);
            }
            System.out.println();


        }
    }
}