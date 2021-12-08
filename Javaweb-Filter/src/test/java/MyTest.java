public class MyTest {


    double fact(int n){
        double product;
        if(n == 0){
            product = 1;
        }else {
            product = n * fact(n-1);
        }
        return product;
    }
    double factSum(int n){
        double result = 0;
        for (int i = 1 ; i<=n ; i++){
            result = result +fact(i);
        }

        return result;
    }

}
