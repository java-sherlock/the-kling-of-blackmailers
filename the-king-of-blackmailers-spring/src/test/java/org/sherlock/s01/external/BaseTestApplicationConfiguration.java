package org.sherlock.s01.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.util.ReflectionUtils.setField;

@Configuration
@PropertySource("classpath:application.properties")
public class BaseTestApplicationConfiguration {
    @Autowired
    private WebApplicationContext wac;

    @Value("${test.resource}")
    String testResource;

    @Bean
    public MockMvc mockMvc() {
        return MockMvcBuilders.webAppContextSetup(this.wac).build();

    }

    @Bean
    public MockMultipartHttpServletRequestBuilder mockMultipartHttpServletRequestBuilder() {
        return MockMvcRequestBuilders.multipart(testResource);
    }
}
