public class ClassExample {

	public static void main(String[] args) {
		
		MusicData music1 = new MusicData("rock.mp3","c/music");
		MusicData music2 = new MusicData("k-pop.mp3","c/music");
		MusicData music3 = new MusicData("popsong.mp3","c/music") ;
		
//		System.out.println("�����̸� : "+ music1.getFileName() + "���ϰ�� :" + music1.getFilePath());
//		System.out.println("�����̸� : "+ music2.getFileName() + "���ϰ�� :" + music2.getFilePath());
//		System.out.println("�����̸� : "+ music3.getFileName() + "���ϰ�� :" + music3.getFilePath());
//		
		YoutubeData youtubeData1 = new YoutubeData("���ڶ� ����","https:eqwnejlenj");
		YoutubeData youtubeData2 = new YoutubeData("ũ�δ� ����","https:eqwnejlenj");
		YoutubeData youtubeData3 = new YoutubeData("�� ����","https:eqwnejlenj");
		
//		System.out.println("�����̸� : " + youtubeData1.getTitle() + "\nURL �ּ� : " + youtubeData1.getUrl() );
//		System.out.println("�����̸� : " + youtubeData2.getTitle() + "\nURL �ּ� : " + youtubeData2.getUrl() );
//		System.out.println("�����̸� : " + youtubeData3.getTitle()+ "\nURL �ּ� : " + youtubeData3.getUrl() );

		MusicData musicArray[] = {music1,music2,music3};
		
		int musicSize = musicArray.length;
		
		for (int i =0; i<musicSize;i++) {
			System.out.println("�����̸� : " +musicArray[i].getFileName() +"\n���ϰ�� : " + musicArray[i].getFilePath() );
		}
		YoutubeData youtubeArray[] = {youtubeData1,youtubeData2,youtubeData3};
		
		int youtubeDataSize = youtubeArray.length;
		
		for (int i =0; i<youtubeDataSize;i++) {
			System.out.println("�������� : " +youtubeArray[i].getTitle() +"\nURL��� : " + youtubeArray[i].getUrl() );
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