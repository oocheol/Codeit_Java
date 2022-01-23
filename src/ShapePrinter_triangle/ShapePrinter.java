package ShapePrinter_triangle;

public class ShapePrinter {
    public void printTriangle(int height) {
        String star = "";
        for (int j = 1; j <= height; j++){
            star += "* ";
            System.out.println(star);

        }
    }
}