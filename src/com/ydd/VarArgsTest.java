package com.ydd;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: VarArgsTest
 * @Author: ydd
 * @CreateTime: 2020/11/28 21:12
 * @Description:测试参数可变的方法:可以提供参数数量可变的方法
 */
public class VarArgsTest {
    public static void main(String[] args) {
       String s1=new String("sdf");
       String s2=new String("sdf");
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(new StringBuilder(s1).reverse());
    }
}
