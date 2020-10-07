import java.util.ArrayList;

//16.19 Pond Sizes Problem
public class ModerateHardProblems {

    public static int CheckPondSize(int row, int col, int[][] land){
        int pond_size = 0;
        land[row][col] = -1;
        if(row + 1 < land.length && land[row+1][col] == 0){
            pond_size = pond_size + CheckPondSize(row + 1, col, land);
        }
        if(col + 1 < land[row].length && land[row][col+1] == 0){
            pond_size = pond_size + CheckPondSize(row, col + 1, land);
        }
        if(row + 1 < land.length && col + 1 < land[row + 1].length && land[row+1][col+1] == 0){
            pond_size = pond_size + CheckPondSize(row + 1 , col + 1, land);
        }
        return pond_size;
    }

    public static ArrayList<Integer> findPondSizes(int[][] land) {

        ArrayList<Integer> ponds = new ArrayList<>();

        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[i].length; j++){
                if(land[i][j] == 0){
                    //Implement BFS here
                    ponds.add(CheckPondSize(i, j, land));

                }
                //System.out.print(land[i][j]);
            }
            //System.out.println("");
        }
        return ponds;
    }


    public static void main(String[] args){
        int[][] tiles = {{1, 0, 1}, {0, 2, 1}, {3, 2, 0}, {0, 0, 1}};
        System.out.println(findPondSizes(tiles));
    }
}
