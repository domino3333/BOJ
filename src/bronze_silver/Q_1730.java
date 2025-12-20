package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1730 {

	// D랑 down을 어떻게 연결하지
	// 일단 저 알파벳들을 '만나게'하는 트리거가 있어야 하는데
	// 로봇팔을 또 객체로 인식하고 만들려하면 안되겠지
	// 로봇팔의 위치를 알면 < 또 이러면 객체처럼생각인가
	// 저번 사과 담기처럼 그냥 start,end로 추상화하기?
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		String direction = br.readLine();
		char[] directionChar = new char[direction.length()];

		for (int i = 0; i < directionChar.length; i++) {
			directionChar[i] = direction.charAt(i);
		}
		char[][] board = new char[count][count];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}

		int x = 0;
		int y = 0;
		int a = 0;
		int whileCount = directionChar.length;
		while (whileCount > 0) {
			switch(directionChar[a++]) {
            case 'D':
                if(x != count-1) {                
                    
                    if(board[x][y] == '.') {
                        board[x][y] = '|';
                    }else if(board[x][y] == '-') {
                        board[x][y] = '+';
                    }
                    x++;
                    if(board[x][y] == '.') {
                        board[x][y] = '|';
                    }else if(board[x][y] == '-') {
                        board[x][y] = '+';
                    }
                }
                break;
            case 'U':
                if(x != 0) {               
                    if(board[x][y] == '.') {
                        board[x][y] = '|';
                    }else if(board[x][y] == '-') {
                        board[x][y] = '+';
                    }    
                    x--;
                    if(board[x][y] == '.') {
                        board[x][y] = '|';
                    }else if(board[x][y] == '-') {
                        board[x][y] = '+';
                    }
                }
                
                break;
            case 'L':
                if(y != 0) {                
                    if(board[x][y] == '.') {
                        board[x][y] = '-';
                    }else if(board[x][y] == '|') {
                        board[x][y] = '+';
                    }
                    y--;
                    if(board[x][y] == '.') {
                        board[x][y] = '-';
                    }else if(board[x][y] == '|') {
                        board[x][y] = '+';
                    }
                }
                break;
            case 'R':
                if(y != count-1) {                
                    if(board[x][y] == '.') {
                        board[x][y] = '-';
                    }else if(board[x][y] == '|') {
                        board[x][y] = '+';
                    }
                    y++;
                    if(board[x][y] == '.') {
                        board[x][y] = '-';
                    }else if(board[x][y] == '|') {
                        board[x][y] = '+';
                    }
                }
                break;
            }
			whileCount--;
			
		
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

}
