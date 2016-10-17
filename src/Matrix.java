import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Matrix{
	
	private int[][] matrix;
	
	private final int[][] DIRECTIONS = new int[][]{
		{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
	};
	
	public Matrix(int[][] matrix){
		this.matrix = matrix;
	}
	
	public Integer[] getNeighbours(int i, int j){
		List<Integer> neighbours = new ArrayList<>();
		for(int k = 0; k < DIRECTIONS.length; k++){
			int di = i + DIRECTIONS[k][0];
			int dj = j + DIRECTIONS[k][1];
			if(di >= 0 && di < matrix.length && dj >= 0 && dj < matrix[di].length){
				neighbours.add(matrix[di][dj]);
			}
		}
		return (Integer[])neighbours.toArray(new Integer[neighbours.size()]);
	}
	
	public static int[][] methodName(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i % 2 == 1){
					matrix[i][j] *= -1;
				}
				if(j % 2 == 1){
					matrix[i][j] *= -1;
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args){
//		Matrix matrix = new Matrix(new int[][]{
//			{1, 2, 3}, 
//			{4, 5}, 
//			{6, 7, 8, 9}, 
//			{10, 11, 12}
//		});
//		System.out.println(Arrays.toString(matrix.getNeighbours(2, 3)));
		
		int[][] wow = methodName(new int[][]{
			{1, 1, 1, 1, 1, 1, 1}, 
			{1, 1, 1}, 
			{1}, 
			{1, 1, 1, 1, 1, 1}, 
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 
			{1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1}, 
			{1, 1, 1}, 
			{1}, 
			{1, 1, 1, 1, 1, 1}, 
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 
			{1, 1, 1, 1, 1, 1, 1, 1, 1}
		});
		for (int i = 0; i < wow.length; i++) {
			System.out.println(Arrays.toString(wow[i]));
		}
	}
}