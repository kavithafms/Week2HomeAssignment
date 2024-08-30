package homeassignment.week2;

public class Library {
	
	public String addBook (String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook(){
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		
		Library title=new Library();
		title.addBook("bookTitle");
		title.issueBook();
		// TODO Auto-generated method stub

	}

}
