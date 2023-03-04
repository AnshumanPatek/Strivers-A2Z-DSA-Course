class Solution{
    static int evenlyDivides(int N){
        
        // code 
        int check = N;
         int count = 0;
        while (check != 0) {
            check = check / 10;
            ++count;
        }
        int counter =0;
        for(int i =0;i<=count;i++){
            N = N/10;
            if(N%2==0){
                counter++;
            }
        }
        return counter;

    }
}
