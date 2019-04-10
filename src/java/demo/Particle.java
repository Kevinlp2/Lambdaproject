package demo;

import java.util.Random;

public class Particle {


    Random r = new Random(10);
    //维数
    public  int dimension = 2;

    //粒子的位置
    public double[] X = new double[dimension];

    //局部最好位置
    public double[] pbest = new double[dimension];

    //粒子的速度
    public double[] V = new double[dimension];

    //最大速度
    public double Vmax = 2;

    //适应值
    public double fitness;

    /**
     * 根据当前位置计算适应值
     * @return newFitness
     */
    public double calculateFitness() {

        double newFitness = X[0]*X[1]+X[0]+X[1]+10 ;
        //double newFitness = X[0]*X[2]+10*X[0]-X[1]+3*X[2]-25+Math.abs(X[0]-4);
        //double newFitness =Math.abs( X[0]%4);

        return newFitness;
    }

    /**
     * 初始化自己的位置和pbest
     */
    public void initialX() {
        for(int i=0;i<dimension;i++) {
            X[i] = r.nextInt(100);
            pbest[i] = X[i];
        }
    }

    /**
     * 初始化自己的速度
     */
    public void initialV() {
        for(int i=0;i<dimension;i++) {
            double tmp = r.nextDouble();//随机产生一个0~1的随机小数
            V[i] = tmp*4+(-2);
        }
    }
}
