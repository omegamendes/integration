package com.backbase.integration;

import com.backbase.integration.endpoint.AddressEndpoint;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(AddressEndpoint.class)
@AutoConfigureWebClient
public class IntegrationApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
	public void should_return_the_address_and_200() throws Exception {
        String address = "pretty tested";
        mvc.perform(get("/address?address="+address)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("address", Matchers.is(address)))
                .andExpect(status().isOk());

	}

}
