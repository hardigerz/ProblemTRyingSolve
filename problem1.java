public class Test {
    public static void main(String args[]) {
        
        int sum=0;
        for (int i=0;i<500;i++){
            if(i%4==0){
                
                sum+=i;
                
            }
        }

        System.out.println("Sum  = "+sum);
    }
}
