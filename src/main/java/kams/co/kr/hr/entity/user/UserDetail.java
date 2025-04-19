package kams.co.kr.hr.entity.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@Builder
@Table(name= "user_detail")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userCode;

    private String userEmail;

    private String userPw;

    private String userName;

    private String phoneNumber;

    private String roleGroup;

    private String approvalStatus;
}
