
public class ArrayUtil {

	/**
	 * Reverse elements of array arr Precondition: arr.length > 0. Postcondition:
	 * The elements of arr have been reversed
	 * 
	 * @param arr
	 *            the array to manipulate
	 * @return 
	 */
	public static int[] reverseArray(int[] arr) {
		/* code goes here */
		int arr2[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			arr2[arr.length - (i+1)] = arr[i];
			System.out.println(arr2[arr.length-(i+1)]);
			
		}
		System.out.println("1D array");
		return arr2;

	}
}

class Matrix {
	private int[][] mat;

	public Matrix(int[][] m) {
		mat = m;
		
	}

	/**
	 * Revereses the elements in each row of mat. Postcondition: The elements in
	 * each row have been reversed
	 * @return 
	 */
	public int[][] reverseAllRows(int arr[][]) {
		ArrayUtil au= new ArrayUtil();
		
		for (int i =0; i<arr.length;i++) {
			
			
			mat[i]=au.reverseArray(arr[i]);
			System.out.println("row reversed");
			
		}
		return mat;
		
	}

	/**
	 * Reverses the elements of mat. Postcondition: - The final elements of mat,
	 * when read in row-major order, are the same as the original elements of mat
	 * when read from the bottom corner, right to left, going upward. - mat[0][0]
	 * contains what was originally the last element. - mat[mat.length -
	 * 1][mat[0].length -1] contains what was originally the first element.
	 * @return 
	 */
	public int[][] reverseMatrix() {
		
		Matrix m = new Matrix(mat);
		m.reverseAllRows(mat);
		int [][] arr2= new int[mat.length][mat.length];
		for (int i = mat.length-1; i>=0; i--) {
			arr2[mat.length - (i+1)] = mat[i];
		}
		return mat= arr2;
		
	}

	public int[][] getIntArray() {
		return mat;
	}
}
