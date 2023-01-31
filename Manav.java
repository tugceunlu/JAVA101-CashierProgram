import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double A= 2.14, E= 3.67, D= 1.11, M= 0.95, P= 5.00;
        double a,e,d,m,p,t;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        a = input.nextDouble();
        System.out.print("Elma kaç kilo: ");
        e = input.nextDouble();
        System.out.print("Domates kaç kilo: ");
        d = input.nextDouble();
        System.out.print("Muz kaç kilo: ");
        m = input.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        p = input.nextDouble();
        t = a*A + e*E + d*D + m*M + p*P;
        System.out.print("Toplam tutar: " + t);