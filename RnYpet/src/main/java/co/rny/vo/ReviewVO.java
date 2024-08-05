package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewVO {
    private int reviewNo;        // 리뷰 번호
    private int itemNo;          // 상품 번호
    private int memberNo;        // 회원 번호
    private String reviewTitle;  // 리뷰 제목
    private String reviewContent; // 리뷰 내용
    private int reviewStar;      // 별점
    private String reviewImage;  // 리뷰 이미지
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
