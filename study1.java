package hcnc;
/*
* 밖에서 안쪽으로 들어오는 소용돌이 배열 만들기
* */
public class study1 {
    public static void main(String[] args) {
        // size 값 고정
        int size = 3;

        //배열 크기(5*5)
        int[][] arr = new int[size][size];

        // 시작 숫자
        int num = 1;

        /* 배열의 테두리를 관리하기 위한 변수
        * 배열의 테두리부터 안쪽까지 숫자를 채워야 하기 때문에 각 테두리의 시작과 끝을 나타내는 변수들을 설정
        * */
        int topRow = 0, // 맨 위쪽
                bottomRow = size - 1,   // 맨 아래쪽 : 배열의 인덱스는 0부터 시작하므로 -1이 맨 마지막 행
                leftColumn = 0, // 맨 왼쪽
                rightColumn = size - 1; // 맨 오른쪽 : 마찬가지로 배열의 인덱스는 0부터 시작하므로 -1이 맨 마지막 열

        while (num <= size * size) {
            // 오른쪽 방향으로 채우기
            for (int i = leftColumn; i <= rightColumn; i++) {
                //행 고정
                arr[topRow][i] = num;
                num++;
            }
            topRow++;

            // 아래쪽 방향으로 채우기
            for (int i = topRow; i <= bottomRow; i++) {
                //열 고정
                arr[i][rightColumn] = num;
                num++;
            }
            rightColumn--;

            // 왼쪽 방향으로 채우기
            for (int i = rightColumn; i >= leftColumn; i--) {
                //행 고정
                arr[bottomRow][i] = num;
                num++;
            }
            bottomRow--;

            // 위쪽 방향으로 채우기
            for (int i = bottomRow; i >= topRow; i--) {
                //열 고정
                arr[i][leftColumn] = num;
                num++;
            }
            leftColumn++;
        }

        // 배열 출력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}