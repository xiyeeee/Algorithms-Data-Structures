package cn.iocoder.boot;/**
 * @Description
 * @Author xiye
 * @Date 2024/7/9
 */
/*
* 关于二分查找, 条件有序数列  , 猜想如果是无序数列 , 应该先排序再查找
* 思考为什么是 i>= j
* (i+j)/2 是否有问题 >>>1
* 编码细节, 为什么都是小于符号
*
*性能
* 时间复杂度 最坏 log(n) 最好O(1)
* 空间复杂度O(1) 因为 i  j , m申请的内存都是只暂用 4* 3 字节, 不会额外占别的
*
*
* 拓展 left 和right  ,处理查找数组元素中有相同个数的情况
* 力扣 34题
* */
public class DoubleSearch {
    public static int Search(int[] arr , int target){
        int i = 0 ;int j = arr.length-1;
        while(i<=j){
           int m = (i+j)/2;
           if(target <arr[m]){
               j = m-1;
           }
           else if(arr[m]<target){
               i = m+1;
            }else {
               return m;
           }
           ;
        };
        return -1;
    }
    // 优化
    public static int greSearch(int[] arr , int target){
        int i = 0 ;int j = arr.length;
        while(i<j){
            int m = (i+j)>>>1;
            if(target <arr[m]){
                j = m;
            }
            else if(arr[m]<target){
                i = m+1;
            }else {
                return m;
            }
            ;
        };
        return -1;
    }

    public static int left(int[] arr , int target){
        int i = 0 ;int j = arr.length-1;
        int temp  =-1;
        while(i<=j){
            int m = (i+j)>>>1;
            if(target <arr[m]){
                j = m-1;
            }
            else if(arr[m]<target){
                i = m+1;
            }else {
               temp =j;
               j = m-1;
            }
            ;
        };
        return temp;
    }
}
