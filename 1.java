

// 1.Write a java program to accept the following city names as argument in the command
// line and sort them in alphabetic order - city name ={ Kolkata, Chennai, Mumbai,
// Delhi, Bangalore, Ahmedabad}.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Sort {
    public static void main(String[] args) {
        int length = args.length;
        String[] cities = new String[length];
        for (int i = 0; i < length; i++) {
            cities[i] = args[i];

        }
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

// 2. Write a java program to create 2d-array of following shape and print the
// following
// pattern –
// a)
//        1
//        1 0
//        1 0 1
//        1 0 1 0     
// :::::::::::::::::::::  
// ……………………up to n. where n will be User Input, taken from command line
// argument.
//     b) . Write a program to create 2d-array of following shape and print the
// following pattern
// –
//          *
//          **
//          ***
//         ****      
// :::::::::::::::::::::        
// …………………… up to n. where n will be User Input, taken from command line
// argument.

class Pattern {
    static void binaryPattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if(j%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    static void starPattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        binaryPattern(n);
        starPattern(n);
    }
}

// 3. Write a java program to declare &amp; instantiate a 2D-array to hold marks obtained by
// students in different subjects in a class. Assume that there are up to 10 students in a
// class &amp; there are 5 subjects. Find out the best student according to average marks of all
// subjects and display all the marks of him/her.

class BestStudent{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of students max 10: ");
        int students = Integer.parseInt(br.readLine());
        int marks[][] = new int[students][5];

        for(int i = 0; i<students; i++){
            System.out.println("\n  Enter the marks for student"+ (i+1));
            for(int j = 0; j<5; j++){
                System.out.println(("Subject"+(j+1)+": "));
                marks[i][j] = Integer.parseInt(br.readLine());
            }
        }
        int averageMakrs[] = new int[10];
        int beststudent = 0;
        int bestMarks = -1;
        for(int i = 0; i<students; i++){
            for(int j = 0; j<5; j++){
                averageMakrs[i]=averageMakrs[i] + marks[i][j];
            }
        }
        for(int i = 0; i<averageMakrs.length; i++){
            if(bestMarks<=averageMakrs[i]){
                bestMarks=averageMakrs[i];
                beststudent++;
            } 
            
        }
        
        System.out.println("Best student: "+ (beststudent +1) +"\n marks: "+ (bestMarks + 1));
    }
}

// 4. Write a java program to design a class Volume and then find out the volume of a Cube,
// Cylinder and Ellipsoid using method overloading using BufferedReader class object.

class Volume{

    double volume(double side){
        return  (side*side*side);
    }
    double vloume(double height, double radius){
        return (Math.PI*radius*radius*height);
    }
    double volume(double a, double b, double c){
        return ((4.0/3.0)*Math.PI*a*b*c);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Volume v = new Volume();
        System.out.println("Enter side of cube: ");
        double side = Double.parseDouble(br.readLine());
        System.out.println(v.volume(side));
    }
}
