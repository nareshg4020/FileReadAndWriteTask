package com.task.readDirectory;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScanDirectoryServiceImpl implements ScanDirectoryService {

	@Override
	public List<String> getTypeFiles(String dirPath, String fileType) {
		List<String> listFiles = new ArrayList<>();
		File directory = new File(dirPath);
		File[] jsonFiles = directory.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(fileType);
			}
		});

		Arrays.stream(jsonFiles).forEach(file -> listFiles.add(file.getName()));
		return listFiles;
	}

}
