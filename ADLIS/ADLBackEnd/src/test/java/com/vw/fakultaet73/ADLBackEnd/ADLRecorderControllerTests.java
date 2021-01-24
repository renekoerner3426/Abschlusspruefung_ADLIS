package com.vw.fakultaet73.ADLBackEnd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vw.fakultaet73.ADLBackEnd.Controller.ADLRecorderController;
import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.services.ADLRecordService;

@WebMvcTest(ADLRecorderController.class)
public class ADLRecorderControllerTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ADLRecordService service;

	@Test
	public void sendTheCorrectResponseForSaveADL() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders
				.post("/adl-api/v1/saveADL")
				.content(asJsonString(new ADLRecord()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().is(201));
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
