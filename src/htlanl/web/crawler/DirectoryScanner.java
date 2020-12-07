package htlanl.web.crawler;

import java.io.File;

public class DirectoryScanner {

	private static void getDirectoryContent(String filePath) {

		File currentDirOrFile = new File(filePath);

		if (!currentDirOrFile.exists()) {
			return;
		} else if (currentDirOrFile.isFile()) {
			System.out.println(currentDirOrFile.getName());
			return;
		} else if (currentDirOrFile.list() != null) {
			System.out.println("\n" + currentDirOrFile.getName());

			for (String currentFileOrDirName : currentDirOrFile.list()) {
				getDirectoryContent(currentDirOrFile + "\\" + currentFileOrDirName);
			}
		}
	}

	public static void main(String[] args) {
		getDirectoryContent("C:\\Users\\sgoud\\Documents");
	}

}
