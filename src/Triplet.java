
public class Triplet implements Comparable<Triplet> {

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

    public boolean isZeroSum(){
        return this.min + this.med + this.max == 0;
    }

    @Override
    public String toString(){
        return this.min + " " + this.med + " " + this.max;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Triplet compared = (Triplet) object;

        if (this.min != compared.getMin()) {
            return false;
        }

        if (this.med != compared.getMed()) {
            return false;
        }

        if (this.max != compared.getMax()) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Triplet comparedTriplet) {
        if (this.min < comparedTriplet.getMin()){
            return -1;
        } else if (this.min > comparedTriplet.getMin()) {
            return 1;
        } else {
            if (this.med < comparedTriplet.getMed()){
                return -1;
            } else if (this.med > comparedTriplet.getMed()) {
                return 1;
            } else {
                if (this.max < comparedTriplet.getMax()){
                    return -1;
                } else if (this.max > comparedTriplet.getMax()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
