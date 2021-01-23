package com.vw.fakultaet73.ADLBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;
import com.vw.fakultaet73.ADLBackEnd.repositories.ADLRecordRepository;

@Service
public class ExportService {

	@Autowired
	private ADLRecordRepository adlRecordRepository;

	public List<ADLRecord> getRecordList() {
		Iterable<ADLRecord> savedEntitys = this.adlRecordRepository.findAll();
		List<ADLRecord> recordList = new ArrayList<>();
		savedEntitys.forEach(savedEntity -> recordList.add(savedEntity));
		return recordList;
	}
}
