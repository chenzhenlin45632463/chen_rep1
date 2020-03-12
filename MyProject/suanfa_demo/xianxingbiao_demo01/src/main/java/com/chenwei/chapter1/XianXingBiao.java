package com.chenwei.chapter1;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/***
 * 自己手写一个顺序表（线性表）的结构程序及基本操作
 * 整个程序文件就两个class，结点类class、顺序表class
 */

    //定义每个结点组成结构
    class DATA {
    String key;
    String name;
    int age;

    public DATA(String key, String name, int age) {
        this.key = key;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DATA{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

    //定义顺序表结构
    class SLType {
        //定义顺序表的最大长度
        static final int MAXLEN = 100;
        DATA[] listData = new DATA[MAXLEN + 1];   //顺序表数组结构
        int ListLen;    //顺序表已存在的结点数量

        /**初始化顺序表
         * @param SL
         */
        void SLInit(SLType SL) {
            //初始化为空的顺序表
            SL.ListLen = 0;
        }

        /**计算顺序表长度
         * @param SL
         * @return
         */
        int SLLength(SLType SL) {
            return SL.ListLen;
        }

        /**
         * 插入结点，在表中间插入数据，后面的数据全部向后移一位
         * @param SL   操作的顺序表
         * @param n    插入表中的位置
         * @param data 插入的数据
         * @return
         */
        int SLInsert(SLType SL, int n, DATA data) {
            int i;
            //查看顺序表数据是否已满
            if (SL.ListLen >= MAXLEN) {
                System.out.println("顺序表结点数量已超过最大数量！");
                return 0;
            }
            //判断插入数据位置是否合理,1为插入成功，0为插入失败
            if (n < 0 || n > SL.ListLen) {
                System.out.println("插入序号有误，不能插入元素!");
                return 0;
            }
            for (i = SL.ListLen; i > n; i--) {//将表中的数据向后移动

                SL.listData[i] = SL.listData[i-1];
            }
            SL.listData[n] = data;//将数据插入到n序号里
            SL.ListLen++;   //顺序表数据数量+1
            return 1;
        }
        /**追加结点
         * 追加结点并不是一个基本的数据结构运算，其可以看作插入结点的一种特殊形式，
         * 相当于在顺序表的末尾新增-一个数据结点
         * 返回0代表追加失败，返回1代表追加成功
         */
        int SLAdd(SLType SL,DATA data){
            if (SL.ListLen>=MAXLEN){//判断顺序表个数是否达到结点上限
                System.out.println("已达结点个数上限，无法继续追加结点了");
                return 0;
            }
            //追加结点
            SL.listData[++SL.ListLen]=data;//此处SL.ListLen先用原值进行赋值运算，然后再++增长
            return 1;
        }

        /**
         * 删除结点
         * 删除结点即删除线性表L中的第i个结点，使得其后的所有结点编号依次减1。
         * 删除1个结点之后，线性表L的长度将变为n-1。删除结点和插入结点类似，都需要进行大量数据的移动。代码示例如下:
         * @param SL,n
         * 删除失败返回0，删除成功返回1
         */
        int SLDelete(SLType SL,int n){  //删除顺序表中索引为n的数据
            int i;
            //删除的索引结点是否合理
            if (n<0||n>=SL.ListLen){    //删除的结点在数组范围之外

                System.out.println("删除结点不存在，删除失败");
                return 0;
            }

            for (i=n;i<SL.ListLen;i++){

                SL.listData[i]=SL.listData[i+1];    //删除数据后，顺序表数据往前移一位
            }
            SL.ListLen--;   //顺序表长度-1
            return 1;
        }

        /**
         * 按照序号查找结点
         * @param
         */
        DATA SLFindByNum(SLType SL,int n){  //  序号在此处定义为索引
            if (n<0||n>=SL.ListLen){
                System.out.println("未找到顺序表中适合序号/索引的数据");
                return null;
            }

            return SL.listData[n];  //返回对应序号的数据
        }

        /***按照关键字查找结点
         * @param SL
         * @param key
         * @return
         * 404为查找错误
         */
        int SLFindByCont(SLType SL,String key){
            for (int i = 0; i < SL.ListLen; i++) {
                if (SL.listData[i].key.compareTo(key)==0){
                    return i;
                }
            }
            return 404;
        }

        /**
         * 显示所有结点
         * @param SL
         * @return
         */
        int SLAll(SLType SL){
            for (int i = 0; i < SL.ListLen; i++) {
                System.out.printf("(%s,%s,%d)\n",SL.listData[i].key,SL.listData[i].name,SL.listData[i].age);
            }

            return 0;
        }

        /**
         * 测试
         */

        //测试插入方法
        @Test
        public void testInsert(){
            SLType s = new SLType();
            System.out.println("length :"+s.listData.length);//顺序表总长度
            /*for (int i = 0; i < 10; i++) {
                DATA data = new DATA(i+"",i+"",i);
                s.listData[i]=data;
            }*/
//            s.ListLen=10;
            DATA data = new DATA("chen_5","chen_5",25);
            int i = s.SLInsert(s, 0, data);
            int i1 = s.SLInsert(s, 1, data);
            System.out.println(Arrays.toString(s.listData));//数据列表
            System.out.println(s.ListLen);
        }

        //测试追加方法
        @Test
        public void testAdd(){
            SLType s = new SLType();
            DATA data = new DATA("陈","陈震霖",45);
            int i = s.SLAdd(s, data);
            System.out.println(Arrays.toString(s.listData));
            System.out.println(s.ListLen);
        }

        //测试删除方法
        @Test
        public void testDelete(){
            SLType SL = new SLType();
            for (int i = 0; i < 10; i++) {
                DATA data = new DATA("key"+i,"name"+i,i);
                SL.listData[i]=data;
            }
            SL.ListLen=10;

            System.out.println("DATA array："+Arrays.toString(SL.listData));

            int i = SL.SLDelete(SL, 10);
            System.out.println("after :"+i+":"+SL.ListLen+":"+Arrays.toString(SL.listData));
        }

        //显示所有结点
        @Test
        public void testAll(){
            //初始化顺序表结构数据
            SLType SL = new SLType();
            for (int i = 0; i < 10; i++) {
                DATA data = new DATA("key"+i,"name"+i,i);
                SL.listData[i]=data;
            }
            SL.ListLen=10;

            System.out.println("DATA array："+Arrays.toString(SL.listData));

            SL.SLAll(SL);
        }
    }





