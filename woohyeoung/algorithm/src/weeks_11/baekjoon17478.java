package weeks_11_재귀_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon17478 {
	static StringBuilder sb = new StringBuilder();
	static String underBar = "";
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
			solution(testcase);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int testcase) {
		String underLine = underBar;
		underBar += "____";
		if(testcase == 0) {
			sb.append(underLine).append('"').append("재귀함수가 뭔가요?").append('"').append('\n');
			sb.append(underLine).append('"').append("재귀함수는 자기 자신을 호출하는 함수라네").append('"').append('\n');
			sb.append(underLine).append("라고 답변하였지.\n");
			return;
		}
		else {
			sb.append(underLine).append('"').append("재귀함수가 뭔가요?").append('"').append('\n');
			sb.append(underLine).append('"').append("잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
			sb.append(underLine).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
			sb.append(underLine).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.").append('"').append('\n');
		}
		solution(testcase-1);
		sb.append(underLine).append("라고 답변하였지.\n");
	}
}