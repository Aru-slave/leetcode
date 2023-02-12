import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int count = 0;
    public int islandPerimeter(int[][] grid) {
        Queue<Integer> x = new LinkedList<>();
        Queue<Integer> y = new LinkedList<>();
        boolean[][] check = new boolean[grid.length][grid[0].length];
        check(grid,x,y);

        if(x.size() == 0)
            return 0;
        while(!x.isEmpty() && !y.isEmpty()){
            int size = x.size();
            for(int i = 0; i < size; i ++){
                int indexX = x.poll();
                int indexY = y.poll();
                if(check[indexY][indexX])
                    continue;
                else check[indexY][indexX] = true;
                count = count + 4;
                if(indexX+1 < grid[0].length){
                    if(grid[indexY][indexX+1] == 1){
                        x.add(indexX+1);
                        y.add(indexY);
                        count--;
                    }
                }

                if(indexX - 1 >= 0){
                    if(grid[indexY][indexX-1] == 1){
                        x.add(indexX-1);
                        y.add(indexY);
                        count--;
                    }
                }
                if(indexY + 1 < grid.length){
                    if(grid[indexY+1][indexX] == 1){
                        x.add(indexX);
                        y.add(indexY+1);
                        count--;
                    }
                }

                if(indexY - 1 >= 0){
                    if(grid[indexY-1][indexX] == 1){
                        x.add(indexX);
                        y.add(indexY-1);
                        count--;
                    }
                }


            }


        }
        return count;
    }
    public void check(int[][] grid,Queue<Integer> x, Queue<Integer> y){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    x.add(j);
                    y.add(i);
                    return;
                }
            }
        }
    }
}
