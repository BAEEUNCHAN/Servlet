package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QnaVO {
    private int qnaNo;           // QnA 번호
    private int itemNo;          // 상품 번호
    private int memberNo;        // 회원 번호
    private String qContent;     // 질문 내용
    private String aContent;     // 답변 내용
    private Date aDate;          // 답변 날짜
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
