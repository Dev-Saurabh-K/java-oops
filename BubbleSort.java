// 2. Write a java class which consists of 5 integer data. Overload constructor (Default &amp; normal) to
// initialize those integer data members. Provide a method which sorts those integer data members
// using bubble sort.
class BubbleSort {
    int a;
    int b;
    int c;
    int d;
    int e;
    BubbleSort(){
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
    }
    BubbleSort(int a, int b, int c, int d, int e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    void sort(){
        int[] arr = {a, b, c, d, e};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted numbers: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class Test{
    public static void main(String[] args){
        BubbleSort b = new BubbleSort(56,96,18,73,98);
        b.sort();
    }
}
