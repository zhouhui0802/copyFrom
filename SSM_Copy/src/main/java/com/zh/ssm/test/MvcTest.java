package com.zh.ssm.test;


import com.github.pagehelper.PageInfo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ContextConfiguration(locations = {"classpath:spring.xml"})
@ExtendWith(SpringExtension.class)
public class MvcTest {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Before
    public void initMocMvc(){

        mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
    }

    public void testPage() throws Exception {

       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn","1")).andReturn();

        MockHttpServletRequest request=result.getRequest();
        request.getAttribute("pageInfo");
        PageInfo attribute=(PageInfo) request.getAttribute("pageInfo");

    }
}
