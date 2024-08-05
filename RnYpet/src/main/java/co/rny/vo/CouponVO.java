package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponVO {
    private int couponNo;        // 쿠폰 번호
    private String couponCode;   // 쿠폰 코드
    private String couponName;   // 쿠폰 이름
    private String saleType;     // 할인 타입
    private Integer salePrice;   // 할인 금액
    private Integer saleRate;    // 할인율
    private Integer maxSalePrice; // 최대 할인 금액
    private Integer minOrderPrice; // 최소 주문 금액
    private Date startDate;      // 시작일
    private Date endDate;        // 종료일
    private Integer maxUses;     // 최대 사용 횟수
    private int usedCount;       // 사용 횟수
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
