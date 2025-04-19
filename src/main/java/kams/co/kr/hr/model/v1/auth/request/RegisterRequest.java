package kams.co.kr.hr.model.v1.auth.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String userName;

    private String phoneNumber;

    private String userEmail;

    private String userPassword;

}
