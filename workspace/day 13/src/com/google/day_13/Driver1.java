package com.google.day_13;

public class Driver1 {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		
		notificationService.sendNotification("sms");
		notificationService.sendNotification("email");

		notificationService.sendNotification("other");

	}

}
