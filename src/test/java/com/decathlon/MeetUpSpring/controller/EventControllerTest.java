package com.decathlon.MeetUpSpring.controller;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.decathlon.MeetUpSpring.service.EventService;


@RunWith(SpringRunner.class)
@WebMvcTest(EventController.class)
//@SpringBootTest a qui ça sert
class EventControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private EventService eventService;

	@Before
	public void setup() {
		
		
	}
	
	@Test
	void test() {
		
	}

	
	
//	@Test
//	@WithMockUser(username = "test", password = "test", roles = "ADMIN")
//	public void getClient_should_return_http_200_when_client_is_found() throws Exception {
//		mvc.perform(get("/clients/1")).andExpect(status().isOk());
//	}

}
