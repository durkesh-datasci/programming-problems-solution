public class island_peri_eff{
    public static void main(String[] args) {
        int[][] grid= {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int peri=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]==1){
                    peri+=4;
                    if(r>0 && grid[r-1][c]==1){
                        peri-=2;
                    }
                    if(c>0 && grid[r][c-1]==1){
                        peri-=2;
                    }
                }
            }
        }
        System.out.print(peri);
    }
}
