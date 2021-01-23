package com.vw.fakultaet73.ADLBackEnd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.services.ADLRecordImportService;
import com.vw.fakultaet73.ADLBackEnd.services.ExportService;

@EnableScheduling
@RestController
public class ADLFrontEndController {

	@Autowired
	private ADLRecordImportService adlRecordImportService;

	@Autowired
	private ExportService exportService;

	private String dataServiceEnvVar = System.getenv("DATA_SERVICE_IP");
	private final String GET_URL = "http://" + this.dataServiceEnvVar + ":8080/decrees";

	@CrossOrigin("*")
	@GetMapping("/adlRecords")
	@ResponseStatus(HttpStatus.OK)
	public List<ADLRecord> getAdlRecords() {
		return this.exportService.getRecordList();
	}
}
