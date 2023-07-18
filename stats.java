import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class stats {
    public static double sum(double[] x){
        double sum = 0;
        for(int i=0; i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }

    public static double mean(double[] x){
        double sum_of_x = sum(x);
        double len_of_x = x.length;
        double y = sum_of_x / len_of_x;
        return y;
    }
    public static double var(double[] x){
        double mean_of_x = mean(x);
        double tmp = 0;
        for(int i=0; i<x.length;i++){
            tmp += Math.pow(mean_of_x - x[i], 2);
        }
        double result = tmp / x.length;
        return result;
    }
    public static double covar(double[] x,double[] y){
        if(x.length!=y.length){
            System.out.println("二つのデータのサイズが異なります")
        }
        else{
            double mean_of_x = mean(x);
            double mean_of_y = mean(y);
            double tmp = 0;
            for(int i=0;i<x.length;i++){
                tmp += (x[i]-mean_of_x)*(y[i]-mean_of_y);
            }
            double result = tmp/x.length;
            return result;
        }
    }
    public static double[] SimpleRegression(double[] x,double[] y){
        double alpha = covar(x,y)/var(x);
        double beta = mean(y) - alpha * mean(x);
        double[] result = new double[2];
        result[0] = alpha;
        result[1] = beta;
        System.out.println("slope:"+String.valueOf(beta));
        System.out.println("intercept:"+String.valueOf(alpha));

        

        return result;
    }
}

