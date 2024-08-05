package co.rny.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
    private int boardNo;         // 게시글 번호
    private int memberNo;        // 회원 번호
    private int boardType;       // 게시글 유형
    private String boardTitle;   // 게시글 제목
    private String boardContent; // 게시글 내용
    private String boardImage;   // 게시글 이미지
    private Date createdDate;    // 생성일
    private Date updatedDate;    // 수정일
    private Date disabledDate;   // 비활성화일
    private int isDisabled;      // 비활성화 여부
}
