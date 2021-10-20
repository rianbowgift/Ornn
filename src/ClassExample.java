public class ClassExample {

	public static void main(String[] args) {
		
		MusicData music1 = new MusicData("rock.mp3","c/music");
		MusicData music2 = new MusicData("k-pop.mp3","c/music");
		MusicData music3 = new MusicData("popsong.mp3","c/music") ;
		
//		System.out.println("파일이름 : "+ music1.getFileName() + "파일경로 :" + music1.getFilePath());
//		System.out.println("파일이름 : "+ music2.getFileName() + "파일경로 :" + music2.getFilePath());
//		System.out.println("파일이름 : "+ music3.getFileName() + "파일경로 :" + music3.getFilePath());
//		
		YoutubeData youtubeData1 = new YoutubeData("페코라 영상","https:eqwnejlenj");
		YoutubeData youtubeData2 = new YoutubeData("크로니 영상","https:eqwnejlenj");
		YoutubeData youtubeData3 = new YoutubeData("멜 영상","https:eqwnejlenj");
		
//		System.out.println("영상이름 : " + youtubeData1.getTitle() + "\nURL 주소 : " + youtubeData1.getUrl() );
//		System.out.println("영상이름 : " + youtubeData2.getTitle() + "\nURL 주소 : " + youtubeData2.getUrl() );
//		System.out.println("영상이름 : " + youtubeData3.getTitle()+ "\nURL 주소 : " + youtubeData3.getUrl() );

		MusicData musicArray[] = {music1,music2,music3};
		
		int musicSize = musicArray.length;
		
		for (int i =0; i<musicSize;i++) {
			System.out.println("파일이름 : " +musicArray[i].getFileName() +"\n파일경로 : " + musicArray[i].getFilePath() );
		}
		YoutubeData youtubeArray[] = {youtubeData1,youtubeData2,youtubeData3};
		
		int youtubeDataSize = youtubeArray.length;
		
		for (int i =0; i<youtubeDataSize;i++) {
			System.out.println("영상제목 : " +youtubeArray[i].getTitle() +"\nURL경로 : " + youtubeArray[i].getUrl() );
		}
	
	}

	
}
class MusicData {
	private String FileName;
	private String FilePath;
	
public MusicData(String FileName, String FilePath) {
	this.FileName = FileName;
	this.FilePath = FilePath;	
}

public String getFileName() {
	return FileName;
}
public String getFilePath() {
	return FilePath;
}
}
class YoutubeData {
	private String title;
	private String url;
	
	public YoutubeData(String title, String url) {
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}


	
}