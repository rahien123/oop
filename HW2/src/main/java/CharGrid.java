// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}

	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int hangMax=-1,cotMax=-1,hangMin=999999,cotMin=999999,count=0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j]==ch){
					count++;
					if(i>hangMax) hangMax=i;
					if(i<hangMin) hangMin=i;
					if(j>cotMax) cotMax=j;
					if(j<cotMin) cotMin=j;
				}
			}
		}
		if(count==0) return 0;
		if(count==1) return 1;
		return (hangMax-hangMin+1)*(cotMax-cotMin+1);
	}

	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int up=0,down=0,left=0,right=0,count=0;
		for(int i=0;i< grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				char ch=grid[i][j];

				up=0;left=0;right=0;down=0;

				for(int k=i;k>=0 && grid[k][j]==ch;k--){
					 up++;
				}
				for(int k=i;k< grid.length && grid[k][j]==ch;k++){
					down++;
				}
				for(int k=j;k>=0 && grid[i][k]==ch;k--){
					left++;
				}
				for(int k=j;k<grid[i].length && grid[i][k]==ch;k++){
					right++;
				}
				if(up>=2 && up==down && up==left && up==right){
					count++;
				}
			}
		}
		return count; // YOUR CODE HERE
	}

}
