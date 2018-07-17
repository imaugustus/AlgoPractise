package Question;

public class LeastSquareGratitude {
    public static void main(String[] args){
        double [] x = {205, 325, 445, 505, 625, 872, 983};
        double [] y = {100, 123, 148, 407, 319, 301, 510};
        double a = 1;
        double b = 1;
        double learningRate = 0.001;
        int step = 50;
        float[] parameter = estimate(x, y, a, b, learningRate, step);
        System.out.println("a equals:" + parameter[0]);
        System.out.println("b equals:" + parameter[1]);
    }

    private static float[] estimate(float[] x, float[] y, float a, float b, float learningRate, int step){
        float[] parameter = new float[2];
        for(int i =0; i < step; i++){
            parameter = train(x, y, a, b, learningRate);
            // Todo
            a = parameter[0];
            b = parameter[1];
        }
        return parameter;
    }

    private static float[] train(float[] x, float[] y, float a, float b, float learningRate){
        float[] parameter = new float[2];
        float tmpA = a - learningRate*calAGratitude(x, y, a, b);
        float tmpB = b - learningRate*calBGratitude(x, y, a, b);
        System.out.println("-a-----  "+tmpA);
        System.out.println("-b-----  "+tmpB);
        parameter[0] = tmpA;
        parameter[1] = tmpB;
        return parameter;
    }

    private static double calLoss(double[] x, double[] y, double a, double b){
        double totalError = 0;
        for (int i = 0; i < x.length; i++) {
            double inputX = x[i];
            double targetY = y[i];
            totalError += Math.pow(targetY - a*inputX - b, 2);
        }
        return totalError/x.length;
    }

    private static double[] updateWeights(double a, double b, double[] x, double[] y, double learningRate){
        double aGradient = 0;
        double bGradient = 0;
        int N = x.length;
        for (int i = 0; i < N; i++) {
            double inputX = x[i];
            double targetY = y[i];
            aGradient += (targetY - a*inputX - b)*(-inputX)*(2/N);
            bGradient += (targetY - a*inputX - b)*(-1)*(2/N);
        }
    }

}

