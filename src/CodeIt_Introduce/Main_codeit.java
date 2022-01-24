package CodeIt_Introduce;

import java.util.Scanner;

public class Main_codeit {
    public static void main(String[] args) {
        Boolean inMainMenu = true;

        while (inMainMenu) {
            System.out.println("(I)ntro (C)ourses (E)xit.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            switch (input) {
                case "e":
                case "E":
                    System.out.println("안녕히 가세요.");
                    inMainMenu = false;
                    break;

                case "i":
                case "I":
                    System.out.println("안녕하세요. 우리는 코드잇입니다. \n" + "함께 공부합시다.");
                    break;

                case "c":
                case "C":
                    boolean inCourseMenu = true;
                    while (inCourseMenu) {
                        System.out.println("코드잇 수업을 소개합니다.\n" + "(P)ython, (J)ava, (i)OS, (B)ack");
                        String input2 = scanner.next();
                        switch (input2) {
                            case "p":
                            case "P":
                                System.out.println("파이썬을 통해 컴퓨터과학의 기초를 배웁니다.\n" +
                                        "강사 : 강영훈\n"+ "추천 선수과목: 없음");
                                break;

                            case "j":
                            case "J":
                                System.out.println("자바의 기본 문법과 객체지향의 기초를 배웁니다.\n" +
                                        "강사 : 김신의\n" + "추천 선수과목 : 파이썬");
                                break;

                            case "i":
                            case "I":
                                System.out.println("최신 언어인 Swift를 통해 iOS를 개발할 수 있습니다.\n"+
                                        "강사 : 성태호\n" + "추천 선수과목 : 파이썬, 자바");
                                break;

                            case "b":
                            case "B":
                                inCourseMenu = false;
                                break;

                        }
                    }
            }
        }
    }
}
