class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //if((target < matrix[0][0]) || (target > matrix[matrix.length-1][matrix[0].length-1]))
          //  return false;
        // Check first column

        int low = 0;
        int high = matrix.length-1;
        int numColumns = matrix[0].length-1;
        int targetRow = 0;

        if(matrix.length > 1){
            while(low <= high){
                int mid = low + (high-low)/2;
                System.out.println("MID "+mid);
                if(matrix[mid][0] < target && matrix[mid][numColumns] > target){
                    targetRow = mid;
                    break;
                }
                else if(matrix[mid][0] == target || matrix[mid][numColumns] == target)
                    return true;
                else if(matrix[mid][0] > target){
                    high = mid-1;
                }
                else if(matrix[mid][0] < target){
                    low = mid+1;
                }

            }

        }
        low = 0;
        high = numColumns;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(matrix[targetRow][mid] < target){
                low = mid + 1;
            }
            else if(matrix[targetRow][mid] > target){
                high = mid-1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
