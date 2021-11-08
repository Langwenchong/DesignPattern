package main.java.com.chong.builder.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 17:04
 * @Version 1.0
 */


//产品套餐
public class Product {
    //默认的套餐产品所拥有的的食物
    private String BuildA = "汉堡";
    private String BuildB = "可乐";
    private String BuildC = "薯条";
    private String BuildD = "甜点";

    public String getBuildA() {
        return BuildA;
    }

    public void setBuildA(String buildA) {
        BuildA = buildA;
    }

    public String getBuildB() {
        return BuildB;
    }

    public void setBuildB(String buildB) {
        BuildB = buildB;
    }

    public String getBuildC() {
        return BuildC;
    }

    public void setBuildC(String buildC) {
        BuildC = buildC;
    }

    public String getBuildD() {
        return BuildD;
    }

    public void setBuildD(String buildD) {
        BuildD = buildD;
    }
    
     @Override
    public String toString() {
        return "Product{" +
                "BuildA='" + BuildA + '\'' +
                ", BuildB='" + BuildB + '\'' +
                ", BuildC='" + BuildC + '\'' +
                ", BuildD='" + BuildD + '\'' +
                '}';
    }

}
