package com.task.readDirectory;

import java.util.List;

public interface ScanDirectoryService {
	List<String> getTypeFiles(String dirPath, String fileType);
}
