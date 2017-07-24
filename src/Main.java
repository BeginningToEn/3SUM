import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] integerList = new int[]{9,-6,-5,9,8,3,-4,8,1,7,-4,9,-9,1,9,-9,9,4,-6,-8};
        List<Triplet> zeroSumList = new ArrayList<>();
        Triplet myTriplet;

        for (int i = 0; i < integerList.length - 2; i++){
            for (int j = i + 1; j < integerList.length - 1; j++){
                for (int k = j + 1; k < integerList.length; k++){
                    myTriplet = new Triplet(integerList[i], integerList[j], integerList[k]);
                    if ( myTriplet.isZeroSum() && !zeroSumList.contains(myTriplet)){
                        zeroSumList.add(myTriplet);
                    }
                }
            }
        }

        Collections.sort(zeroSumList);
        for (Triplet iterator : zeroSumList){
            System.out.println(iterator);
        }
    }
}
