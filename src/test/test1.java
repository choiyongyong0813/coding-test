package test;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        // 5개의 로또 번호 세트를 저장할 2차원 배열
        int[][] lottoSets = new int[5][6];

        // 5개의 세트를 생성
        for (int i = 0; i < lottoSets.length; i++) {
            lottoSets[i] = generateLottoNumbers(); // 각 세트 생성
        }

        // 결과 출력
        for (int i = 0; i < lottoSets.length; i++) {
            System.out.println("로또번호 세트 " + (i + 1) + " : " + Arrays.toString(lottoSets[i]));
        }
    }

    // 로또 번호 한 세트를 생성하는 메서드
    private static int[] generateLottoNumbers() {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) { // 중복 제거
                if (lotto[i] == lotto[j]) {
                    i--; // 중복이면 다시 뽑음
                    break;
                }
            }
        }
        Arrays.sort(lotto); // 오름차순 정렬
        return lotto;
    }
}
