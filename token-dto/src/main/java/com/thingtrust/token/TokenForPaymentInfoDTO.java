package com.thingtrust.token;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenForPaymentInfoDTO {

    private Long id;

    private Integer errCode;

}
