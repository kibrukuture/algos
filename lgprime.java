static int largestPrimeFactor(int n){
    class Prime {
        int next;
        Prime (){
            this.next=2;
        }
        boolean isPrime(int a){
            if(n==0 || n==1) return false;
            boolean isValid=true;int range= (int)Math.sqrt(a);
            for(int i=2;i<=range;i++){
                if(a%i==0){
                isValid=false;
                break;
                }
            }
            return isValid;
        }
        int getNext(){
            int curr=this.next;
            while(true){
                curr+=1;
                if(this.isPrime(curr)) break;
            }
            this.next=curr;
            return curr;
        }
    }
if(n<=1) return 0;
Prime prime =new Prime();
int divisor=prime.next;int dividend=n;
while(true){
    if(dividend%divisor==0) dividend = dividend / divisor;
    if(dividend%divisor!=0 && dividend!=1) divisor=prime.getNext();
    if(dividend==1) break;
}
  return divisor;
}
