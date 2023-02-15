class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j < matrix[i].length;j++){
                if(matrix[i][j]==0){
                    y.add(i);
                    x.add(j);
                }
            }
        }
        
        for(int i : y){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        
        for(int i : x){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }
}
}