package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentVO {
    private int paymentNo;       // 결제 번호
    private int orderNo;         // 주문 번호
    private int paymentPrice;    // 결제 금액
    private String paymentMethod; // 결제 방법
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
