package com.jeffrey.radixtransfer;

/**
 * @author Jeffrey.Liu
 * @version V1.0
 * @Description
 * @date 2018-5-26 20:55
 */
public class radixMain {
    public static void main(String[] args) {
        //十进制转为二进制
        System.out.println(Integer.toBinaryString(112));
        //十进制转为十六进制
        System.out.println(Integer.toHexString(112));
        //十进制转为八进制
        System.out.println(Integer.toOctalString(112));

        //二进制转
        System.out.println(Integer.parseInt("111001",2));
        //八进制
        System.out.println(Integer.parseInt("27",8));
        //十六进制
        System.out.println(Integer.parseInt("A8",16));
    }
}
