package Audio;

public class Song {
	String title;
	double duration;

	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public double getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Song{" + "title = ' " + title + '\'' + ", duration =" + duration + '}';
	}
}
