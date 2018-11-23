package com.backbase.integration.endpoint;

import com.backbase.integration.domain.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

@RestController
public class AddressEndpoint {


    @GetMapping("/address")
    public Address getAddress(@QueryParam(value="address") String address) {
        return new Address(address);
    }

}
