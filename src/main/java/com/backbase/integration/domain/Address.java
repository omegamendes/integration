package com.backbase.integration.domain;

import lombok.Data;
import lombok.Getter;

@Data
public class Address {

    @Getter
    private String address;

    public Address() {

    }

    public Address(String address) {
        this.address = address;
    }
}
