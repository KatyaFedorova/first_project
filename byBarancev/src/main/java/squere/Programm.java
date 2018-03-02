package squere;

public class Programm {
    public static void main(String[] args) {

        Square s = new Square(5);
        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь равна квадрата со стороной " + s.l + " равна " + area(s));
        System.out.println("Площадь равна прямоуголника со стороной " + r.l + "  равна " + area(r));
    }

    private static double area(Square s) {// s - обьект класса s в котором содержиться длинна стороны
        return s.l * s.l ;
    }

    private static double area(Rectangle r) {// r - обьект класса s в котором содержиться длинна стороны
        return r.l * r.b ;
    }
}
