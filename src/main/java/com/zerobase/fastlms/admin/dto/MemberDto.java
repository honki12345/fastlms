package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberDto {

    String userId;

    String password;
    String phone;
    LocalDateTime regDt;
    String userName;

    String emailAuthKey;
    boolean emailAuthYn;
    LocalDateTime emailAuthDt;

    String resetPasswordKey;
    LocalDateTime resetPasswordLimitDt;

    boolean adminYn;
    String userStatus;

    // 추가칼럼
    long totalCount;
    long seq;

    public static MemberDto of(Member member) {
        return  MemberDto.builder()
                .userId(member.getUserId())
                .phone(member.getPhone())
                .regDt(member.getRegDt())
                .userName(member.getUserName())
                .emailAuthKey(member.getEmailAuthKey())
                .emailAuthYn(member.isEmailAuthYn())
                .emailAuthDt(member.getEmailAuthDt())
                .resetPasswordKey(member.getResetPasswordKey())
                .resetPasswordLimitDt(member.getResetPasswordLimitDt())
                .adminYn(member.isAdminYn())
                .userStatus(member.getUserStatus())
                .build();

    }


}
