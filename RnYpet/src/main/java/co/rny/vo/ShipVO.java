package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipVO {
    private int shipNo;          // 배송 번호
    private int orderNo;         // 주문 번호
    private int addressNo;       // 주소 번호
    private String trackingNumber; // 운송장 번호
    private String shipStatus;   // 배송 상태
    private Date shipDate;       // 배송 시작일
    private Date deliveryDate;   // 배송 완료일
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
