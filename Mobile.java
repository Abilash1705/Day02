package week1.day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void makeCall() {
		System.out.println("makeCall");
	}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMessage();
		mob.shareDocument();
	}

}
