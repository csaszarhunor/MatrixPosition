import java.util.Arrays;

public class MatrixGeneric<T>{

	private T[][] matrix;

	private final int[][] DIRECTIONS = new int[][]{
		{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
	};

	public MatrixGeneric(T[][] matrix){
		this.matrix = matrix;
	}

	public int countExistingNeighbours(int i, int j){
		int count = 0;
		for(int k = 0; k < DIRECTIONS.length; k++){
			int di = i + DIRECTIONS[k][0];
			int dj = j + DIRECTIONS[k][1];
			if(di >= 0 && di < matrix.length && dj >= 0 && dj < matrix[di].length){
				count++;
			}
		}
		return count;
	}

	public T[] getNeighbours(int i, int j){
		T[] neighbours = (T[]) new Object[countExistingNeighbours(i, j)];
		int countIndex = 0;
		for(int k = 0; k < DIRECTIONS.length; k++){
			int di = i + DIRECTIONS[k][0];
			int dj = j + DIRECTIONS[k][1];
			if(di >= 0 && di < matrix.length && dj >= 0 && dj < matrix[di].length){
				neighbours[countIndex] = matrix[di][dj];
				countIndex++;
			}
		}
		return neighbours;
	}

	public static void main(String[] args){
		Matrix matrix = new Matrix(new int[][]{
			{1, 2, 3},
			{4, 5},
			{6, 7, 8, 9},
			{10, 11, 12}
		});
		String result = Arrays.toString(matrix.getNeighbours(2, 2));
		System.out.println(result);
	}
}