public class movingMaze {
    public static int countPaths(int i, int j, int m,int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }

        //for down moving
        int downward = countPaths(i+1, j, m, n);

        //for right moving
        int rightward=countPaths(i, j+1, m, n);

        int totalpath=downward+rightward;
        return totalpath;

    }
    public static void main(String args[]){
        int m=3;int n=3;
        int result=countPaths(0, 0, m, n);
        System.out.println(result);
    }
}
