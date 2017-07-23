public class Main {

    public static void main(String[] args) {
        int[] integerList = new int[]{9,-6,-5,9,8,3,-4,8,1,7,-4,9,-9,1,9,-9,9,4,-6,-8};

        for (int i = 0; i < integerList.length - 2; i++){
            for (int j = i + 1; j < integerList.length - 1; j++){
                for (int k = j + 1; k < integerList.length; k++){
                    int sum = integerList[i] + integerList[j] + integerList[k];
                    if (sum == 0){
                        System.out.println(integerList[i] + " " + integerList[j] + " " + integerList[k]);
                    }
                }
            }
        }
    }
}
