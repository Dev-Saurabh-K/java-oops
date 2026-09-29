// 1. Create a class named complex with data members as real and imaginary. Overload three
// constructors to initialize the data members (i.e. default, normal, and through object initialization).
// Provide methods which returns object of the complex class as the result for addition,
// subtraction, multiplication of two complex numbers.

class Complex{
    double real;
    double imaginary;
    Complex(){
        real = 0;
        imaginary = 0;
    }
    Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(Complex c){
        real = c.real;
        imaginary = c.imaginary;
    }
    Complex add(Complex c){
        return new Complex(real+c.real, imaginary+c.imaginary);
    }
    Complex subtract(Complex c){
        return new Complex(real-c.real, imaginary-c.imaginary);
    }
    Complex multiply(Complex c){
        double r = (real*c.real)+(imaginary*c.imaginary);
        double i = (real*c.imaginary)+(imaginary*c.real);
        return new Complex(r, i);
    }
    void display(){
        System.out.println("real: "+real+" imaginary:"+imaginary);
    }
}

class TextComplex{
    public static void main(String[] args){
        Complex c1 = new Complex(5,3);
        Complex c2 = new Complex(2,4);
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex multiply = c1.multiply(c2);
        sum.display();
        difference.display();
        multiply.display();

        Complex c3 = new Complex(c1);
        System.out.println("Copied constrcutor:");
        c3.display();
    }
}
