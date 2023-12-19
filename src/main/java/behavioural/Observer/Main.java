/**
 *
 */
package behavioural.Observer;

/**
 *
 */
public class Main {

	public static void main(String[] args) {
		final YoutubeChannel channel = new YoutubeChannel("neetcode");

		channel.subscribe(new YoutubeUser("sub1"));
		channel.subscribe(new YoutubeUser("sub2"));
		channel.subscribe(new YoutubeUser("sub3"));

		channel.notify("A new video released");
	}

}
