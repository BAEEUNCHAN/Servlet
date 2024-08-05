package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyVO {
    private int replyNo;         // 댓글 번호
    private int boardNo;         // 게시글 번호
    private int memberNo;        // 회원 번호
    private String replyContent; // 댓글 내용
    private String replyImage;   // 댓글 이미지
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
