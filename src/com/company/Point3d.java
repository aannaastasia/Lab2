package com.company;
import java.text.DecimalFormat;

/**
 * трехмерный класс точки
 */
public class Point3d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** Конструктор по умолчанию **/
    public Point3d () {
        this(0.0, 0.0, 0.0);
    }

    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }
    /** Метод для сравнения значений полей объектов. **/
    public boolean comparison(Point3d p) {
        return this.getX() == p.getX() && this.getY()==p.getY() && this.getZ()==p.getZ();
    }

    /** Метод для вычисления расстояния между двумя точками. **/
    public double distanceTo(Point3d p){
        double res = Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2) + Math.pow(this.getZ() - p.getZ(), 2));
        double t = Math.pow(10, 2); // Возведем 10 во 2 степень
        res = Math.ceil(res * t) / t; // Умножим результат на t округлим в большую сторону и разделим на t
        return res;
    }
}
