package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDetailVO {
    private int cartDetailNo;    // 장바구니 상세 번호
    private int cartNo;          // 장바구니 번호
    private int itemNo;          // 상품 번호
    private int cartCnt;         // 수량
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
