import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.yedam.web.MemberVO;

public class ObjectStreamEx1 {
	// 바이트(1byte),char(2byte) => 객체를 처리하는 보조 스트림

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/file4.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<MemberVO> list = (List<MemberVO>) ois.readObject();
			list.forEach(member -> System.out.println(member));

			ois.close();
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("완료");
	}

	static void writer1() {

		List<MemberVO> members = new ArrayList<>();
		members.add(new MemberVO(101, "김감치", 200));
		members.add(new MemberVO(102, "김삼치", 150));
		members.add(new MemberVO(103, "김사치", 120));
		members.add(new MemberVO(104, "김오치", 190));
		members.add(new MemberVO(105, "김육치", 130));

		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/file4.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// serialize(직렬화) <-> deserialize(역직렬화)
			oos.writeObject(members);

			oos.flush();
			oos.close();
			fos.flush();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("완료");

	}

}
