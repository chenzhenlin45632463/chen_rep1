package com.test.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IODemo1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="需要进行编码的字符串";
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);
        System.out.println(new String(bytes,"GBK"));//非正确编码格式：闇�瑕佽繘琛岀紪鐮佺殑瀛楃涓�
        System.out.println(new String(bytes,"UTF-8"));// 需要进行编码的字符串
        System.out.println(new String(bytes,"GB2312"));// ��瑕�杩�琛�缂�����瀛�绗�涓�
    }
}
