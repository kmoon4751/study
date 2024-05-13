package hcnc;
/*
 * 밖에서 안쪽으로 들어오는 소용돌이 배열 만들기2
 * */

public class study1_1 {

    public static void main(String[] args) {

        // 5*5 배열 생성
        int[][] arr = new int[5][5];

        String dir = null;
        int count = 0;
        int len = 5;

        int i = 0;
        int j = 0;

        for (int k = 1; k < arr.length * 2; k++) {

            if (dir == "right") {
                dir = "down";
            } else if (dir == "down") {
                dir = "left";
            } else if (dir == "left") {
                dir = "up";
            } else if (dir == "up") {
                dir = "right";
            } else {
                dir = "right";
            }


            switch (dir) {

                case "right":
                    while (j < len) {
                        arr[i][j] = ++count;
                        j++;
                    }
                    i++;
                    j--;
                    break;

                case "down":
                    while (i < len) {
                        arr[i][j] = ++count;
                        i++;
                    }
                    i--;
                    j--;
                    break;

                case "left":
                    while (i + j >= 4) {
                        arr[i][j] = ++count;
                        j--;
                    }
                    i--;
                    j++;
                    break;

                case "up":
                    while (i > j) {
                        arr[i][j] = ++count;
                        i--;
                    }
                    i++;
                    j++;
                    len--;
                    break;
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
