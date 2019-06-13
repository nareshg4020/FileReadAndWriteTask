package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.task.readDirectory.ScanDirectoryService;

public class ModelController {
	private static final String jsonDirPath = "C:\\Users\\Naresh\\Desktop\\TestJSONDir";
	private static final String xmlDirPath = "C:\\Users\\Naresh\\Desktop\\TestJSONDir";

	@Autowired
	ScanDirectoryService scanDirectoryService;

	public void TrainModel() {
		List<String> jsonFileList = scanDirectoryService.getTypeFiles(jsonDirPath, ".json");
		List<String> xmlFileList = scanDirectoryService.getTypeFiles(xmlDirPath, ".xml");
	}
}
