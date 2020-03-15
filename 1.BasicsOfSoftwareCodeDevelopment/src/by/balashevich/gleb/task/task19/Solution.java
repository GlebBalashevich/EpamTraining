package by.balashevich.gleb.task.task19;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new Point(4, 7));
        points.add(new Point(4, 8));

        boolean isInLine = true;
        for(int i = 0; i < points.size()-1; i++){
            if (points.get(i).x != points.get(i+1).x){
                for(int j = 0; j < points.size()-1; j++){
                    if (points.get(j).y != points.get(j + 1).y) {
                        isInLine = false;
                        break;
                    }
                }
            }
        }

        String message = (isInLine) ? "The points is lined up" : "The points is not lined up";
        System.out.println(message);

    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
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
    }
}
