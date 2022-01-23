package ShapePrinter_FloydsPyramid;

public class ShapePrinter_2 {
    public void printFloydsPyramid(int height) {
        int num = 1;
        int pad = String.valueOf((height * (height + 1)) / 2).length();
        String padFormat = "%" + pad + "d"; // 자릿수로 패딩 넣기 - 정수 + 문자열은 문자열로 변환

        for (int col = 1; col <= height; col++) {
            for (int row = 1; row <= col; row++) {
                // print 대신 format
                System.out.format(padFormat + " ", num);
                num++;
            }
            System.out.println();
        }
    }
}

