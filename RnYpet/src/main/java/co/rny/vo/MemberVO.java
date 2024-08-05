package co.rny.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {
    private int memberNo;        // 회원 번호
    private String memberId;     // 회원 아이디
    private String memberPwd;    // 회원 비밀번호
    private String memberName;   // 회원 이름
    private String memberNickName; // 회원 닉네임
    private String memberGender; // 회원 성별
    private Date memberBirthDate; // 회원 생년월일
    private String memberEmail;  // 회원 이메일
    private String memberPhone;  // 회원 전화번호
    private String memberAddress; // 회원 주소
    private int memberPoint;     // 회원 포인트
    private String memberGrade;  // 회원 등급
    private String memberGrant;  // 회원 권한
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
