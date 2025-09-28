//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		int width=grid[0].length;
		int height=grid.length;
		this.grid=new boolean[height][width];
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				this.grid[i][j]=grid[i][j];
			}
		}
	}


	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		for(int i=0;i<grid[0].length;i++){
			boolean isFull=true;
			for(int j=0;j<grid.length;j++){
				if(grid[j][i]!=grid[0][i]) isFull=false;
			}
			if(isFull && i==grid[0].length-1){
				for(int k=0;k<grid.length;k++){
					grid[k][i]=false;
				}
			}
			else if(isFull){
				for(int k=0;k<grid.length;k++){
					grid[k][i]=grid[k][i+1];
					grid[k][i+1]=false;
				}
			}
		}
	}

	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return this.grid; // YOUR CODE HERE
	}
}
