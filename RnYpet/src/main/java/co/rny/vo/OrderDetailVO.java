package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVO {
    private int orderDetailNo;   // 주문 상세 번호
    private int orderNo;         // 주문 번호
    private int itemNo;          // 상품 번호
    private int orderDetailCnt;  // 주문 수량
    private int orderDetailPrice; // 주문 상세 금액
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
