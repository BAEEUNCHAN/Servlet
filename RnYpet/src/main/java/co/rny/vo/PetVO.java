package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetVO {
    private int petNo;           // 애완동물 번호
    private int memberNo;        // 회원 번호
    private String petName;      // 애완동물 이름
    private String petBreed;     // 품종
    private String petGender;    // 성별
    private Date petBirthDate;   // 생년월일
    private Double petWeight;    // 체중
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}