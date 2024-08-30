package test;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        // 정렬된 배열을 정의
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        // 검색할 목표값을 설정
        int target = 14;
        
        // 반복방식으로 이진탐색
        int resultIterative = binarySearchIterative(sortedArray, target);
        if (resultIterative == -1) {
           
            System.out.println("반복방식: 목표값 못 찾음");
        } else {
        
            System.out.println("반복방식: 목표값 인덱스 = " + resultIterative);
        }

        // 재귀방식 이진탐색
        int resultRecursive = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        if (resultRecursive == -1) {
         
            System.out.println("재귀 방식: 목표값 못 찾음");
        } else {
          
            System.out.println("재귀 방식: 목표값 인덱스 = " + resultRecursive);
        }
    }

    // 반복문 이진탐색 메서드
    public static int binarySearchIterative(int[] array, int target) {
    	 int left = 0;
         int right = array.length - 1;

         while (left <= right) {
             int mid = (left + right) / 2;  // 중간 인덱스 계산
             if (array[mid] == target) {
                 return mid;  // 목표값을 찾았을 때
             } else if (array[mid] < target) {
                 left = mid + 1;  // 목표값이 오른쪽 절반에 있는 경우
             } else {
                 right = mid - 1;  // 목표값이 왼쪽 절반에 있는 경우
             }
         }

         return -1;  // 목표값을 찾지 못한 경우
     }
        
 


    // 재귀방식 이진탐색 메서드
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // 목표 값을 찾지 못했을 경우
        if (left > right) {
            return -1;
        }
        
        // 현재 탐색 범위의 중간 인덱스를 계산
        int mid = left + (right - left) / 2;
        
        // 중간 인덱스의 값이 목표 값과 같은지 확인
        if (array[mid] == target) {
            return mid; // 목표 값을 찾으면 인덱스를 반환
        }
        
        // 목표값이 중간값보다 크면 왼쪽 절반을 무시하고 오른쪽 절반으로 범위를 좁혀 재귀호출을 수행
        if (array[mid] < target) {
            return binarySearchRecursive(array, target, mid + 1, right);
        } 
        // 목표값이 중간값보다 작으면 오른쪽 절반을 무시하고 왼쪽 절반으로 범위를 좁혀 재귀호출을 수행
        else {
            return binarySearchRecursive(array, target, left, mid - 1);
        }
    }
}
