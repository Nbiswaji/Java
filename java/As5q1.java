package Biswajit.Java;
    import java.util.Scanner;

class Complex {
    double real;
    double imag;
    Complex() {
        real = 0.0;
        imag = 0.0;
    }
   Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    Complex add(Complex num) {
        return new Complex(this.real + num.real, this.imag + num.imag);
    }

    Complex subtract(Complex num) {
        return new Complex(this.real - num.real, this.imag - num.imag);
    }

    Complex multiply(Complex num) {
        double resultReal = this.real * num.real - this.imag * num.imag;
        double resultImag = this.real * num.imag + this.imag * num.real;
        return new Complex(resultReal, resultImag);
    }

    Complex divide(Complex num) {
        double denominator = num.real * num.real + num.imag * num.imag;
        double resultReal = (this.real * num.real + this.imag * num.imag) / denominator;
        double resultImag = (this.imag * num.real - this.real * num.imag) / denominator;
        return new Complex(resultReal, resultImag);
    }
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

class As5q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imag1);
        Complex complex2 = new Complex(real2, imag2);
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex quotient = complex1.divide(complex2);
        System.out.println("Sum:");
        sum.display();
        System.out.println("Difference:");
        difference.display();
        System.out.println("Product:");
        product.display();
        System.out.println("Quotient:");
        quotient.display();
    }
}