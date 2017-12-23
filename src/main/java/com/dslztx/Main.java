package com.dslztx;
// 一般形式
import java.util.ArrayList;
// 通配符形式
import java.io.*;
// 静态导入形式
import static java.util.Calendar.*;
public class Main {
  public static void main(String[] args) {
    // ArrayList类由"import java.util.ArrayList"语句导入
    ArrayList<String> list;
    // File类由"import java.io.*"语句导入
    File file;
    // 静态字段"YEAR"由"import static java.util.Calendar.*"语句导入
    System.out.println(YEAR);

    // 不使用"import"语句，就得使用全名称方式
    java.util.Vector vector;
  }
}