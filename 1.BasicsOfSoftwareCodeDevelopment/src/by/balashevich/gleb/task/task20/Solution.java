package by.balashevich.gleb.task.task20;

public class Solution {
    public static void main(String[] args) {
        Block block = new Block(12, 7, 24);
        Hole hole = new Hole(8, 14);

        String result = "";
        if (!checkSide(hole, block)){
            result = "NOT ";
        }
        System.out.println("The brick will " + result + "pass through the hole");
    }

    public static boolean checkSide(Hole hole, Block block){
        if (hole.getaSide() > block.getX()){
            if (hole.getbSide() > block.getY() || hole.getbSide() > block.getZ()){
                return true;
            }
        }
        if (hole.getaSide() > block.getY()){
            if (hole.getbSide() > block.getX() || hole.getbSide() > block.getZ()){
                return true;
            }
        }
        if (hole.getaSide() > block.getZ()){
            return hole.getbSide() > block.getY() || hole.getbSide() > block.getX();
        }
        return false;
    }
}

