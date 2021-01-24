package com.vw.fakultaet73.ADLBackEnd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.services.ADLRecordService;

@EnableScheduling
@RestController
@RequestMapping("/adl-api/v1")
public class ADLFrontEndController {

	@Autowired
	private ADLRecordService adlRecordService;

	@CrossOrigin("*")
	@GetMapping("/adlRecords")
	@ResponseStatus(HttpStatus.OK)
	public List<ADLRecord> getAdlRecords() {
		return this.adlRecordService.getRecordList();
		
		
	}
}
