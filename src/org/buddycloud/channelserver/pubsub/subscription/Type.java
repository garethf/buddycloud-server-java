package org.buddycloud.channelserver.pubsub.subscription;

public enum Type {
	
		none,
		pending,
		unconfigured,
		subscribed;

		public static Type createFromString(String asString) {
			
			if("none".equals(asString)) {
				return none;
			} else if ("pending".equals(asString)) {
				return pending;
			} else if ("unconfigured".equals(asString)) {
				return unconfigured;
			} else if ("subscribed".equals(asString)) {
				return subscribed;
			}
			return none;
		}
		
}
