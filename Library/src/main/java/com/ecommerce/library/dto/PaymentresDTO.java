package com.ecommerce.library.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PaymentresDTO implements Serializable {
    private String status;
    private String message;
    private String URL;
}
