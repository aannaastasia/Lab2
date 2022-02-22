package com.company;

public class Lab2 {

    public static void main(String[] args) {
        Point3d a = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d b = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d c = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));
        if ((a.comparison(b)) || (b.comparison(c)) || (a.comparison(c))){
            System.out.println("Одна из точек равна другой");
        }
        else{
            System.out.println("Площадь равна " + computeArea(a, b, c));
        }
    }

    public static double computeArea(Point3d a, Point3d b, Point3d c) {
       double ab = a.distanceTo(b);
       double bc = b.distanceTo(c);
       double ac = a.distanceTo(c);
       double p = (ab + bc + ac) / 2;
       double s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
       return s;
    }
}
