import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.web.MemberVO;

public class WriterEx1 {
	public static void main(String[] args) {
		// 기본스트림 = 보조스트림 - 추가적인 기능 수행.
		List<MemberVO> members = new ArrayList<>();
		try {
			FileReader fr = new FileReader("c:/temp/file3.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			String[] strAry = null;

			while (true) {
				
				if (str == null) {
					break;
				}
				str = br.readLine(); // 한 라인 읽기
				// 파일의 정보를 활용 -> 컬렉션 생성
				strAry = str.split(" ");
				MemberVO member = new MemberVO();
				member.setMemberNo(Integer.parseInt(strAry[0]));
				member.setMemberName(strAry[1]);
				member.setPoint(Integer.parseInt(strAry[2]));
				members.add(member);

				System.out.println(str);
			}
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}

	static void reader1() {
		// Reader <- FileReader
		try {
			Reader reader = new FileReader("c:/temp/file2.dat");
			while (true) {
				int read = reader.read();
				if (read == -1)
					break;
				System.out.println(read + "->" + (char) read); // byte char short int long

			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}

	static void writer1() {
		// 문자 기반 스트림 Writer <- FileWriter
		Scanner sc = new Scanner(System.in);
		String str = "";
		try {
			Writer writer = new FileWriter("c:/temp/file2.dat");
			while (true) {
				System.out.println("입력> ");
				str = sc.nextLine();
				if (str.equals("quit"))
					break;

				writer.write(str + "\n");
			}
			writer.flush();
			writer.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}

}
