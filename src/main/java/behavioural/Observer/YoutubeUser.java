package behavioural.Observer;

public class YoutubeUser implements YoutubeSubscriber {

	private final String name;

	public YoutubeUser(String name) {
		this.name = name;
	}

	@Override
	public void sendNotification(String channel, String event) {
		System.out.println("User " + name + " received notification from " + channel + ": " + event);
	}

}
