package library;
import java.util.ArrayList;
import java.util.Scanner;
import library.LibraryImp;
public class LibraryManagementSystem {
    public static void main(String[] args) 
    {
        LibraryImp library = new LibraryImp();
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> sciFiction=new ArrayList<Book>();
        sciFiction.add(new Book("The War of the World","H.G.Wells","Science Fiction",957789458963l));
        sciFiction.add(new Book("The Law of Miracle","K.C","Science Fiction",974589646482l));
        sciFiction.add(new Book("Germent of Worship","Leslie A","Science Fiction",788987458963l));
        sciFiction.add(new Book("Little Altars Everywhere","Rebecca","Science Fiction",245654589632l));
        sciFiction.add(new Book("Nine TO five Bride","Robin Well","Science Fiction",974598458963l));
        sciFiction.add(new Book("Alfie Cat in Trouble","Rachel","Science Fiction",945674589632l));
        sciFiction.add(new Book("Max's Christmas","Rosemary","Science Fiction",159953598645l));
        sciFiction.add(new Book("Dying Art","Shirley","Science Fiction",973015897465l));
        library.addBook(sciFiction);
        
        ArrayList<Book> advenFict=new ArrayList<Book>();
        advenFict.add(new Book("The Odys","Homer","Adventure Fiction",236556323659l));
        advenFict.add(new Book("Gulliver's","Jonathan Swift","Adventure Fiction",789532365615l));
        advenFict.add(new Book("Moby-Dic","Herman Melville","Adventure Fiction",859623455679l));
        advenFict.add(new Book("Treasure","Robert Louis Stevenson","Adventure Fiction",659832159632l));
        advenFict.add(new Book("King Solo","H.Rider Haggard","Adventure Fiction",325645897465l));
        advenFict.add(new Book("The Adventure Finn","Mark Twain","Adventure Fiction",112314589923l));
        library.addBook(advenFict);
        
        ArrayList<Book> novels=new ArrayList<Book>();
        novels.add(new Book("The Story of my Experiments with the Truth","Mahatma Gandhi","Novel",789654859612l));
        novels.add(new Book("The Guide","R.K.Narayan","Novel",789562325465l));
        novels.add(new Book("A Fine Mistry","Rohinton Mistry","Novel",456987123859l));
        novels.add(new Book("Midnight's Children","Salman Rushdie","Novel",55962325465l));
        novels.add(new Book("The Interpreter of Maladies","Jhumpa Lahiri","Novel",664589325465l));
        novels.add(new Book("A Suitable Boy","Vikram Seth","Novel",253641789455l));
        novels.add(new Book("God of Small Thigs","Arundhati Roy","Novel",337896458945l));
        novels.add(new Book("The Glass Palace","Amitav Ghosh","Novel",123452632546l));
        novels.add(new Book("The Inheritance of Loss","Kiran Desai","Novel",114589632655l));
        novels.add(new Book("The Private Life of an Indian Prince","Mulk Raj Anand","Novel",789568236458l));
        library.addBook(novels);
        
        ArrayList<Book> shortStor=new ArrayList<Book>();
        shortStor.add(new Book("Bombay Balchao","Jane Borges","Short Story",789587469456l));
        shortStor.add(new Book("Mohanaswamy","","Short Story",111145968958l));
        shortStor.add(new Book("The Adivasi Will Not Dance","Hansda Sowvendra","Short Story",741258741258l));
        shortStor.add(new Book("A Day In The Life","Anjum Hasan","Short Story",852741258741l));
        shortStor.add(new Book("Shake The Bottle and Other Stories","Ashapurna Devi","Short Story",852369852369l));
        shortStor.add(new Book("The  Women Who Forgot To Invent Facebook","Nisha Susan","Short Story",963258963258l));
        library.addBook(shortStor);
        
        ArrayList<Book> poetry=new ArrayList<Book>();
        poetry.add(new Book("The Forest I know","Kala Ramesh","Poetry",123456123456l));
        poetry.add(new Book("A Poem Day","Gulzar","Poetry",789567423456l));
        poetry.add(new Book("Rumi","Farrukh Dhondy","Poetry",123456174851l));
        poetry.add(new Book("Stilness","Varun","Poetry",789654123456l));
        poetry.add(new Book("In Ohter WordsJaved Akhtar","","Poetry",123478451256l));
        poetry.add(new Book("Khooni Vaisakhi","Navdeep Suri","Poetry",123478979956l));
        poetry.add(new Book("Sufiana","Hoshang Merchant","Poetry",112233323456l));
        library.addBook(poetry); 
        
        ArrayList<Book> biography=new ArrayList<Book>();
        biography.add(new Book("Shivaji:The Great Maratha","Ranjit Desai","BioGraphy",445555789612l));
        biography.add(new Book("Shivaji","Nandini Nayar","BioGraphy",47412789612l));
        biography.add(new Book("Raja Shivchatrapati","Babasaheb Purandare","BioGraphy",98655789612l));
        biography.add(new Book("Shriman Yogi","Ranjit Desai","BioGraphy",44555571254l));
        biography.add(new Book("Chhava","Shivaji Savant","BioGraphy",44551425612l));
        biography.add(new Book("Panipat","Viswas Patil","BioGraphy",44475878912l));
        biography.add(new Book("Shakakarte Shivraj","Vijay Deshmukh","BioGraphy",44553693212l));

        while (true) {
        	System.out.println("Enter your Choice \n1.Add Book \n2.Display All Book \n3.Save Library to File \n4.Load Library from File \n5.Search Book by Titlel");
        
            try {
            	int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:{
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter type: ");
                        String type = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        long ISBN = scanner.nextLong();
                        Book newBook = new Book(title, author,type, ISBN);
                        library.addBook(newBook);
                        System.out.println("Book added successfully.");
                    }
                        break;
                    case 2:{
                    	library.displayAllBooks();
                    }break;
                    case 3:{
                        System.out.print("Enter file name to save: ");
                        String saveFileName = scanner.nextLine();
                        library.saveLibraryToFile(saveFileName);
                    }
                        break;
                    case 4:
                        System.out.print("Enter file name to load: ");
                        String loadFileName = scanner.nextLine();
                        library.loadLibraryFromFile(loadFileName);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Please enter valid input data");
			}
        }
    }
}