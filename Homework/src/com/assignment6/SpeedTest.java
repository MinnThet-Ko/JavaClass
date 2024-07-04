package com.assignment6;

public class SpeedTest {

	private float upload_speed;
	private float download_speed;
	private float ping;
	
	public SpeedTest(float upload_speed, float download_speed, float ping) {
		this.upload_speed = upload_speed;
		this.download_speed = download_speed;
		this.ping = ping;
	}

	public float getUpload_speed() {
		return upload_speed;
	}

	public void setUpload_speed(float upload_speed) {
		this.upload_speed = upload_speed;
	}

	public float getDownload_speed() {
		return download_speed;
	}

	public void setDownload_speed(float download_speed) {
		this.download_speed = download_speed;
	}

	public float getPing() {
		return ping;
	}

	public void setPing(float ping) {
		this.ping = ping;
	}

}
