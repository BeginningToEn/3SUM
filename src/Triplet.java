/**
 * Created by EG OLIVER RC on 7/20/2017.
 */
public class Triplet {

    private int min;
    private int med;
    private int max;

    public Triplet(int a, int b, int c){
        if( a > b ){
            if( a > c ){
                this.max = a;
                if( b > c ){
                    this.med = b;
                    this.min = c;
                }else{
                    this.med = c;
                    this.min = b;
                }
            }else{
                this.med = a;
                this.max = c;
                this.min = b;
            }
        }else{
            if( b > c ){
                this.max = b;
                if( a > c ){
                    this.med = a;
                    this.min = c;
                }else{
                    this.med = c;
                    this.min = a;
                }
            }else{
                this.med = b;
                this.max = c;
                this.min = a;
            }
        }
    }

    private int getMin() {
        return min;
    }

    private int getMed() {
        return med;
    }

    private int getMax() {
        return max;
    }

    @Override
    public String toPrint(){
        System.out.println(this.min + " " + this.med + " " + this.max);
    }

    public boolean isIdentical (Triplet testTriplet){
        return this.min == testTriplet.getMin() && this.med == testTriplet.getMed() && this.max == testTriplet.getMax();
    }
}
