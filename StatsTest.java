import java.util.Arrays;
public class StatsTest{
    public static void main(String[] args){
        // meanTest();
        // varTest();
    }
    public static void meanTest(){
        double[] x = new double[5];
        x[0] = 2;
        x[1] = 4;
        x[2] = 4;
        System.out.println(Arrays.toString(x));
        System.out.println(stats.mean(x));
        
        if(stats.mean(x)!=2){
            System.out.println("出力が想定と違います");
        }
        
        System.out.println("テスト終了");
    }

    public static void varTest(){
        System.out.println("分散計算テスト");
        double[] x = new double[5];
        x[0] = 2;
        x[1] = 4;
        x[2] = 4;
        System.out.println(Arrays.toString(x));
        System.out.println(stats.var(x));

        
    }
}
