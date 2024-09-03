package test;

public class MergeSortOutOfPlace {


	    public static void main(String[] args) {
	        int[] array = {38, 27, 43, 3, 9, 82, 10};
	        
	        // 정렬 전 배열출력
	        System.out.println("정렬 전 배열:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        // 배열정렬
	        mergeSort(array, 0, array.length - 1);
	        
	        // 정렬 후 배열출력
	        System.out.println("정렬 후 배열:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); 
	    }
	    
	    // 배열정렬 메서드
	    public static void mergeSort(int[] array, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2;

	            mergeSort(array, left, mid);
	            mergeSort(array, mid + 1, right);
	            merge(array, left, mid, right);
	        }
	    }
	    
	    // 두부분 배열병합 메서드
	    public static void merge(int[] array, int left, int mid, int right) {
	        int[] leftArray = new int[mid - left + 1];
	        int[] rightArray = new int[right - mid];

	        System.arraycopy(array, left, leftArray, 0, leftArray.length);
	        System.arraycopy(array, mid + 1, rightArray, 0, rightArray.length);

	        int i = 0, j = 0, k = left;
	        while (i < leftArray.length && j < rightArray.length) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k++] = leftArray[i++];
	            } else {
	                array[k++] = rightArray[j++];
	            }
	        }

	        while (i < leftArray.length) {
	            array[k++] = leftArray[i++];
	        }

	        while (j < rightArray.length) {
	            array[k++] = rightArray[j++];
	        }
	    }
	}