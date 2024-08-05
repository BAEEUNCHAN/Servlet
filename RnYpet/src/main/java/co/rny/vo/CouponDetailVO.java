package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponDetailVO {
    private int couponDetailNo;  // 쿠폰 상세 번호
    private int couponNo;        // 쿠폰 번호
    private int memberNo;        // 회원 번호
    private Integer orderNo;     // 주문 번호
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
