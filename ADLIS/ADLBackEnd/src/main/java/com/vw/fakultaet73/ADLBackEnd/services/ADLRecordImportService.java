package com.vw.fakultaet73.ADLBackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.repositories.ADLRecordRepository;

@Service
public class ADLRecordImportService {

	@Autowired
	private ADLRecordRepository adlRecordRepository;

	public ADLRecord saveRecord(ADLRecord adlRecord) {
		return this.adlRecordRepository.save(adlRecord);
	}
}