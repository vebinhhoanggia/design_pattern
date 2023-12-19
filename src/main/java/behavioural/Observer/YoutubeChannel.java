package behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

	private final String name;
	private final List<YoutubeSubscriber> subscribers;

	public YoutubeChannel(String name) {
		this.name = name;
		subscribers = new ArrayList<>();
	}

	public void subscribe(YoutubeSubscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void notify(String event) {
		for (final YoutubeSubscriber subscriber : subscribers) {
			subscriber.sendNotification(name, event);
		}
	}
}
