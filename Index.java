package d1_date;

import java.util.Date;

//用来练习Date类
public class Index {
    public static void main(String[] args) {
        //创建一个Date类的对象：代表系统此刻日期时间对象
        Date time =new Date();
        System.out.println(time);
        System.out.println("----------");
        //获取时间毫秒
        long t1=time.getTime();
        System.out.println(t1);
        System.out.println("----------");

        long t= System.currentTimeMillis();
        System.out.println(t);

        //计算从当前时间往后一个小时121秒之后的时间
        //获取当前时间
        System.out.println("计算开始-----");
        Date d=new Date();
        System.out.println(d);

        //当前时间往后走1小时121秒
        long d1=System.currentTimeMillis();
        d1+=(60*60+121)*1000;

        //把时间毫秒转换成日期对象
        Date d3=new Date(d1);
        System.out.println(d3);
    }
}
