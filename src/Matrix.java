public class Matrix {
    public static int maxValue(){
        int [][] array = {{4,12},{5,24},{56,5}};
        int max = array[0][0];
        for (int i =0; i <3;i++){
            for(int j =0; j<2;j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        } return max;
    }

    public static void main(String[] args) {
        int value = maxValue();
        System.out.println("the max of list: " +value);
    }
}
