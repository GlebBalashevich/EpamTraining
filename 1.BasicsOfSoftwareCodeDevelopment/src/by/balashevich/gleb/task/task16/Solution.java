package by.balashevich.gleb.task.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Point> points = new ArrayList<>();

        System.out.println("==== Task 16 ====");
        createArea(points);
        System.out.println("Result: " + calculateFunction(points));
    }

    public static void createArea(List<Point> points){
        for(int i = -4; i <= 4; i++){
            for(int j = -3; j <= 0; j++){
                points.add(new Point(i, j));
            }
        }
        for(int i = -2; i <= 2; i++){
            for(int j = 1; j <= 4; j++){
                points.add(new Point(i, j));
            }
        }
    }

    public static Boolean calculateFunction(List<Point> points) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("put Point 'x' value");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("put Point 'y' value");
        int y = Integer.parseInt(reader.readLine());
        reader.close();

        Point testPoint = new Point(x, y);

        for(Point point : points){
            if (point.equals(testPoint)){
                return true;
            }
        }

        return false;
    }

    public static class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
