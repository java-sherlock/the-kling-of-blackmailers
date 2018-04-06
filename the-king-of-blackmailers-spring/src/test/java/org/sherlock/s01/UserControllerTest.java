package org.sherlock.s01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {SpringPostOfficeMain.class, TestApplicationConfiguration.class})
@RequestMapping("sherlock")
public class UserControllerTest {

    @Autowired
	private MockMvc mockMvc;

    @Autowired
    private MockMultipartHttpServletRequestBuilder multipart;

    @Test
	public void putMultipartTest() throws Exception {
		mockMvc.perform(multipart
				.param("letter","test letter"))
				.andDo(print())
				.andExpect(MockMvcResultMatchers.content().string("test letter"));
	}
}