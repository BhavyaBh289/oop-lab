public class _7 {
    public static void main(String []args){
        try {
            System.out.println(myCalculator.power(2,3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class myCalculator {
    public static long power(int n,int p)throws Exception{
        if (n<=0 | p<=0){
            throw new Exception(" n or p should not be negative");
        }
        else {
            int r=1;
            for (int i=1;i!=p+1;i++){
                r*=n;
            }
            return r;
        }
    }
}