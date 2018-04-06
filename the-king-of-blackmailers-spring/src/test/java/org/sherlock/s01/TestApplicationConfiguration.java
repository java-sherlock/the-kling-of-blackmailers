package org.sherlock.s01;

import org.sherlock.s01.external.BaseTestApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;

@Configuration
public class TestApplicationConfiguration extends BaseTestApplicationConfiguration {

    @Override
    public MockMultipartHttpServletRequestBuilder mockMultipartHttpServletRequestBuilder() {
        MockMultipartHttpServletRequestBuilder mockMultipartHttpServletRequestBuilder = super.mockMultipartHttpServletRequestBuilder();
        ReflectionTestUtils.setField(mockMultipartHttpServletRequestBuilder, "method", "PUT");
        return mockMultipartHttpServletRequestBuilder;
    }
}
