package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressVO {
    private int addressNo;       // 주소 번호
    private int memberNo;        // 회원 번호
    private String addressLabel; // 주소 라벨
    private String addressToName; // 수령인 이름
    private String addressLine1; // 주소 1
    private String addressLine2; // 주소 2
    private String addressCity;  // 도시
    private String addressState; // 주/도
    private String addressPostalCode; // 우편번호
    private String addressCountry; // 국가
    private String addressPhone; // 전화번호
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
