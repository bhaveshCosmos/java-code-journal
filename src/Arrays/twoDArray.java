public class twoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();
        }

        char[][] charArray = {
            {'A','B'},
            {'C','D'},
            {'E','F'},
        };
        for(int i=0; i<charArray.length; i++) {
            for(int j=0; j<charArray[i].length; j++) {
                System.out.printf(charArray[i][j]+" ");
            }
            System.out.println();
        }

    }

}
