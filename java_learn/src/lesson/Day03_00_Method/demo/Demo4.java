package lesson.Day03_00_Method.demo;


/**
 *
 * 迷宫探索
 * */

public class Demo4 {
    public static void main(String[] arg) {
        Labyrinth mapObj = new Labyrinth();
        int[][] map = mapObj.buildMap();
        mapObj.maoInt(map);
        Cat cat = new Cat();

        cat.findWay(map, 1, 1);
        System.out.println(" -------------------- ");
        mapObj.maoInt(map);

    }
}

class Labyrinth {
    int[][] map = new int[8][7];

    public void maoInt (int [][] map) {
        for (int i = 0; i < map.length; i++) {
            int[] item = map[i];
            for (int k = 0; k < item.length; k++) {
                System.out.print(item[k] + "\t");
            }
            System.out.println(" ");
        }
    }


    public int[][] buildMap() {
        // 将第一行和最后一行设为障碍物
        for (int i = 1; i < 6; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 将第一列和最后一列设为障碍物
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[1][2] = 1;
        map[3][3] = 1;
        map[4][4] = 1;
        map[5][3] = 1;
        map[6][4] = 1;

        return map;

    }

}

class Cat {
    // 0 可以走
    // 1 障碍物
    // 2 走过，可以走
    // 3 走过，但是是死路
    // map[6][5] === 2 时，表示走通了
    public boolean findWay(int[][] map, int i, int j) {

        if (map[6][5] == 2) {
            return true;
        } else {
            int value = map[i][j];
            // 可以走
            if (value == 0) {
                // 假设可以走
                map[i][j] = 2;
                // 走路策略 下 -> 右 -> 上 -> 左
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}