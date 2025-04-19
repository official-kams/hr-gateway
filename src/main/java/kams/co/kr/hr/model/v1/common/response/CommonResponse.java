package kams.co.kr.hr.model.v1.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import kams.co.kr.hr.common.code.StatusCode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

    private String code;

    private String message;

    public static CommonResponse getSuccess() {
        return CommonResponse.builder()
                .code(StatusCode.SUCCESS.getCode())
                .message(StatusCode.SUCCESS.getMessage())
                .build();
    }

    public static CommonResponse getError() {
        return CommonResponse.builder()
                .code(StatusCode.ERROR.getCode())
                .message(StatusCode.ERROR.getMessage())
                .build();
    }
}
