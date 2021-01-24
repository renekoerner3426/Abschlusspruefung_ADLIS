package com.vw.fakultaet73.ADLBackEnd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.services.ADLRecordService;


@RestController
@RequestMapping("/adl-api/v1")
public class ADLRecorderController {

	@Autowired
	private ADLRecordService adlRecordService;

	@CrossOrigin("*")
	@PostMapping("/saveADL")
	@ResponseStatus(HttpStatus.CREATED)
	public ADLRecord createAdlRecord(@RequestBody ADLRecord adlRecord) {
		return this.adlRecordService.saveRecord(adlRecord);
	}
}
