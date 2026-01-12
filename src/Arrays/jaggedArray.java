public class jaggedArray {
    public static void main(String[] args) {
        char[][] jagged = {
        {'Q','P'},
        {'A', 'B', 'C', 'D'},
        {'X','Y','Z'},
        };

        for(int i=0; i<jagged.length; i++){
            for(int j=0; j<jagged[i].length; j++) {
                System.out.print(jagged[i][j]+ " ");
            }
            System.out.println();
        }       
    }
}
