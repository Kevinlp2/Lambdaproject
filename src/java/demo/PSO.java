package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * PSO算法实现
 * @author mrpod2g
 *
 */
public class PSO {
    static long startTime = System.currentTimeMillis();

    private static double[] gbest;//全局最优位置

    private static double gbest_fitness = Double.MAX_VALUE;//全局最优位置对应的fitness

    private static int particle_num = 20;//粒子数

    private static int N = 100;//迭代次数

    private static double c1,c2 = 2.05;

    private static double w = 1.2;//惯性因子

    private static double wt;

    private static double wini=1.6;

    private static double wfin=0.9;



    private static List<Particle> particles = new ArrayList<Particle>();//粒子群

    /**
     * 初始化所有粒子
     */
    public static void initialParticles() {
        for(int i=0;i<particle_num;i++) {
            Particle particle = new Particle();
            particle.initialX();
            particle.initialV();
            particle.fitness = particle.calculateFitness();
            particles.add(particle);
        }
    }

    /**
     * update gbest
     */
    public static void updateGbest() {
        double fitness = Double.MAX_VALUE;
        int index = 0;
        for(int i=0;i<particle_num;i++) {
            if(particles.get(i).fitness<fitness) {
                index = i;
                fitness = particles.get(i).fitness;
            }
        }
        if(fitness<gbest_fitness) {
            gbest = particles.get(index).pbest.clone();
            gbest_fitness = fitness;
        }
    }

    /**
     * 更新每个粒子的速度
     */
    public static void updateV() {
        for(Particle particle:particles) {

            for(int i=0;i<particle.dimension;i++) {
                //0.原始算法
                double v = w*particle.V[i]+c1*particle.r.nextDouble()*(particle.pbest[i]-particle.X[i])+c2*particle.r.nextDouble()*(gbest[i]-particle.X[i]);

                if(v>particle.Vmax){
                    v = particle.Vmax;}
                else if(v<-particle.Vmax){
                    v = -particle.Vmax;}
                particle.V[i] = v;//更新Vi
            }
        }

    }
    public static void updateV_1(int n) {
        for(Particle particle:particles) {

            for(int i=0;i<particle.dimension;i++) {
                //1. 惯性权重优化

                wt=(wini-wfin)*(N-n)/N+wfin;

                double v = wt*particle.V[i]+c1*particle.r.nextDouble()*(particle.pbest[i]-particle.X[i])+c2*particle.r.nextDouble()*(gbest[i]-particle.X[i]);


                if(v>particle.Vmax){
                    v = particle.Vmax;}
                else if(v<-particle.Vmax) {
                    v = -particle.Vmax;
                }
                particle.V[i] = v;//更新Vi
            }
        }

    }
    public static void updateV_2() {
        for(Particle particle:particles) {

            for(int i=0;i<particle.dimension;i++) {
                //2.收缩因子优化
                double v = 0.729*(particle.V[i]+c1*particle.r.nextDouble()*(particle.pbest[i]-particle.X[i])+c2*particle.r.nextDouble()*(gbest[i]-particle.X[i]));

                if(v>particle.Vmax){
                    v = particle.Vmax;}
                else if(v<-particle.Vmax){
                    v = -particle.Vmax;}
                particle.V[i] = v;//更新Vi
            }
        }

    }



    /**
     * 更新每个粒子的位置和pbest
     */
    public static void updateX() {
        for(Particle particle:particles) {
            for(int i=0;i<particle.dimension;i++) {
                particle.X[i] = particle.X[i] + particle.V[i];
            }
            double newFitness = particle.calculateFitness();//新的适应值
            //如果新的适应值比原来的小则跟新fitness和pbest
            if(newFitness<particle.fitness) {
                particle.pbest = particle.X.clone();
                particle.fitness = newFitness;
            }
        }
    }

    /**
     * 算法主要流程
     */
    public static void process() {
        int n = 0;
        initialParticles();
        updateGbest();
        ArrayList<Double> list = new ArrayList<>();
        while(n++<N) {
            //  updateV();
            // 	updateV_1(n);
            updateV_2();
            updateX();
            updateGbest();

            list.add( gbest_fitness );
            if(n>=10){
                if(list.get( n-10 ) -gbest_fitness <10){
                    return;
                }
            }

            System.out.println(n+".Currnet gbest:("+gbest[0]+","+gbest[1]+")  ;  fitness="+gbest_fitness);
        }

    }

    /**
     * 返回一个0~1的随机数
     * @param
     * @return
     */

    public static void main(String[] args) {
        process();

    }
}
