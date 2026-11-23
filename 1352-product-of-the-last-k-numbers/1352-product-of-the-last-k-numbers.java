

//BRUTE-FORCE
// class ProductOfNumbers {
//     List<Integer>l;


//     public ProductOfNumbers() {
//         l = new ArrayList<>();

        
//     }
    
//     public void add(int num) {
//         l.add(num);
        
//     }
    
//     public int getProduct(int k) {
//         int prod = 1;
       
//        for(int i=l.size()-k;i<l.size();i++){
//         prod*=l.get(i);
//        }
//         return prod;
        
//     }
// }

// /**
//  * Your ProductOfNumbers object will be instantiated and called as such:
//  * ProductOfNumbers obj = new ProductOfNumbers();
//  * obj.add(num);
//  * int param_2 = obj.getProduct(k);
//  */


//OPTIMAL SOLUTION
class ProductOfNumbers {
    List<Integer>prefix;


    public ProductOfNumbers() {
        prefix= new ArrayList<>();
        prefix.add(1);


        
    }
    
    public void add(int num) {
        if(num==0){
            prefix.clear();
            prefix.add(1);
        }
        else{
            int last = prefix.get(prefix.size()-1);
            prefix.add(last*num);
        }
        
    }
    
    public int getProduct(int k) {
        int n=prefix.size();
        if(k>=n){
            return 0;
        }
        return prefix.get(n-1)/prefix.get(n-k-1);
        
        
    }
}
