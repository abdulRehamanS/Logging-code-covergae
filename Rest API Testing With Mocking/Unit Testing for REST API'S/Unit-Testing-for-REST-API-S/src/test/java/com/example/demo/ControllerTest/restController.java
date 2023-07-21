package com.example.demo.ControllerTest;


import com.example.demo.Service.demoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;


@WebMvcTest(value = demoService.class)
public class restController {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private demoService service;


    @Test
    public void welcomeTest() throws Exception {

        // telling what to do
        when(service.welcome()).thenReturn("This is Mock Object");
        // preparing request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/welcome");
        // preparing result
        MvcResult mvcResult = mockMvc.perform(request).andReturn();
        //preparing response
        MockHttpServletResponse response = mvcResult.getResponse();
        //getting status
        int status = response.getStatus();
        assertEquals(200, status);


    }
}
