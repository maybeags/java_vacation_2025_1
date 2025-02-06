package chapter07_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균 점수를 내는 프로그램을 구현할 예정.
    여태까지는 main 단계에서 전체를 작성해왔습니다.

    하지만 이제부터는 method 부분과 실행 부분(main메서드가 적용된 부분)을 나누는
    과정을 거치도록 하겠습니다.
 */
public class ScoreCalc {
    // 1. 총합을 내는 메서드 : call4() 유형으로 작성하겠습니다. 매개변수 / return 존재
    public static double addScores(double score1, double score2) {
        return score1 + score2;
    }

    // 2. addScores() 메서드를 오버로딩하여 매개 변수가 3, 4, 5, 6인 메서드들을 만드세요.
    public static double addScores(double score1, double score2, double score3) {
        return score1 + score2 + score3;
    }

    public static double addScores(double score1, double score2,
                                   double score3, double score4) {
        return score1 + score2 + score3 + score4;
    }

    public static double addScores(double score1, double score2, double score3,
                                   double score4, double score5) {
        return score1 + score2 + score3 + score4 + score5;
    }

    public static double addScores(double score1, double score2,
                                   double score3, double score4,
                                   double score5, double score6) {
        return score1 + score2 + score3 + score4 + score5 + score6;
    }

    // 평균을 내는 메서드를 정의 : call4() 유형으로 작성
    public static double calculateAvg(double totalScore, int numOfSubjects) {
        return totalScore / numOfSubjects;
    }


    public static void main(String[] args) {
        // Scanner class import
//        Scanner scanner = new Scanner(System.in);
//        // 사용할 변수 목록
//        double score1 = 0;
//        double score2 = 0;
//        double totalScore = 0;
//        int totalSubjects = 0;
//        double avgScore = 0;
//
//        System.out.print("1과목의 점수를 입력하세요 >>> ");
//        score1 = scanner.nextDouble();
//        System.out.print("2과목의 점수를 입력하세요 >>> ");
//        score2 = scanner.nextDouble();
//        totalScore = score1 + score2;
//        totalSubjects = 2;
//        avgScore = totalScore / totalSubjects;
//        System.out.println("당신의 총점은 : " + totalScore);
//        System.out.println("당신의 평균은 : " + avgScore);

//        System.out.println(addScores(100, 78));
//        System.out.println(addScores(100, 30, 5.4, 22.7));


        // 여태까지 매번 변수 선언하고 초기화해서 대입하면서 sout했던 사례
        double totalScore2 = addScores(100, 90);
        int subs = 2;
        double avgScore = calculateAvg(totalScore2, subs);
        System.out.println(avgScore);

        // 가독성은 좀 깨지기는 하지만 여전히 개발자들이 사용하는 방식
        System.out.println(calculateAvg(addScores(100, 80), 2));

    }
}
