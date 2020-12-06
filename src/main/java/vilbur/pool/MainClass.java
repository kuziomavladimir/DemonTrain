package vilbur.pool;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hell");
    }

//        Scanner scanner = new Scanner(System.in);
//        int n;
//        double x, y;
//        ArrayList<Point> pointList = new ArrayList<>();
//        System.out.println("Введи количество НЕстёртых точек (их должно быть от 1 до 4)");
//        n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Введи координуту х точки " + i);
//            x = scanner.nextDouble();
//            System.out.println("Введи координуту y точки " + i);
//            y = scanner.nextDouble();
//            Point point = new Point(x, y);
//            pointList.add(point);
//        }
//
//        switch (n) {
//            case 1:
//                System.out.println(-1);
//            case 2:
//                System.out.println(twoPointsArea(pointList));
//            case 3:
//                System.out.println(threePointsArea(pointList));
//            case 4:
//                System.out.println(threePointsArea(pointList));
//        }


//    public static double twoPointsArea(ArrayList<Point> point) {
//        double x1 = point.get(0).getX();
//        double y1 = point.get(0).getY();
//        double x2 = point.get(1).getX();
//        double y2 = point.get(1).getY();
//        if (x1 == x2 || y1 == y2)
//            return -1;
//        else
//            return (x1 - x2) * (y1 - y2);
//    }
//
//    public static double threePointsArea(ArrayList<Point> point) {
//        double a, b;
//        double x1 = point.get(0).getX();
//        double y1 = point.get(0).getY();
//        double x2 = point.get(1).getX();
//        double y2 = point.get(1).getY();
//        if (!(x1 == x2 || y1 == y2))
//            return (x1 - x2) * (y1 - y2);
//        else {
//            double x3 = point.get(2).getX();
//            double y3 = point.get(2).getY();
//            if (x3 != x2)
//                a = x3 - x2;
//            else
//                a = x3 - x1;
//            if (y3 != y2)
//                b = y3 - y2;
//            else
//                b = y3 - y1;
//            return a * b;
//        }
//    }
}
