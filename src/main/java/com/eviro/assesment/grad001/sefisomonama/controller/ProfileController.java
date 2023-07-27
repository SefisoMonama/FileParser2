package com.eviro.assesment.grad001.sefisomonama.controller;

import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.eviro.assesment.grad001.sefisomonama.entity.AccountProfile;
import com.eviro.assesment.grad001.sefisomonama.entity.AccountRepository;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;


@RestController
public class ProfileController {

	@Autowired
	AccountRepository service;
	
	@PostMapping("/upload")
	public String uploadData(@RequestParam("file") MultipartFile file) throws IOException{
		
		List<AccountProfile> accountList = new ArrayList<>();
		InputStream inputStream = file.getInputStream();
		CsvParserSettings setting =new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		List<com.univocity.parsers.common.record.Record> parseAllRecords =  parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record ->{
			AccountProfile account = new AccountProfile();
			account.setAcountHolderName(record.getString("name"));
			account.setAccountHolderSurname(record.getString("surname"));
			account.setHttpImageLink(record.getString("surname"));
			accountList.add(account);
		});
		service.saveAll(accountList);
		return "Upload Successful!";
	}
}
