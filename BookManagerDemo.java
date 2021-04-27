package bk;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookManagerDemo {
    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------欢迎来到图书管理系统--------");
            System.out.println("0 添加书籍");
            System.out.println("1 删除书籍");
            System.out.println("2 修改书籍");
            System.out.println("3 查看所有书籍");
            System.out.println("4 推荐书籍");
            System.out.println("5 退出");
            System.out.println("请输入你得选择：");
            String line = sc.nextLine();
            switch (line){
                case "0":
                    addbook a = new addbook();
                    a.addbook(arr);
                    System.out.println("添加成功");
                    break;
                case "1":
                    deletebook d = new deletebook();
                    d.deletebook(arr);
                    System.out.println("删除成功");
                    break;
                case "2":
                    updata u = new updata();
                    u.updata(arr);
                    System.out.println("修改成功");
                    break;
                case "3":
                    findbook f = new findbook();
                    f.findbook(arr);
                    break;
                case "4":
                    recommend r = new recommend();
                    r.recommend(arr);
                    break;
                case "5":
                    System.out.println("退出成功");
                    System.exit(0);
            }
        }
    }


}