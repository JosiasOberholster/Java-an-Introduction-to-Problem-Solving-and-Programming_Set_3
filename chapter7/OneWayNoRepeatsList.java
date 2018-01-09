package chapter7;

/*
	An object of this class is a special kind of list of strings.
	You can write the list only from beginning to the end. You can add
	only to the end of the list. You cannot change individual 
	entries, but you can erase the entire list and start over. No
	entry may appear more than once on the list. You can use int
	variables as position markers into the list. Position markers 
	are similar to array indices, but are numbered starting with 1.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.9.
	Last Changed: 11 October 2017.
*/

public class OneWayNoRepeatsList {

	public static boolean beyondEntry;
	public static int START_POSITION = 1;
	public static int DEFAULT_SIZE = 50;
	
	//entry.length is the total number of items you have room
	//for on the list (its capacity); countOfEntries is the number of
	//items currently on the list.
	private int countOfEntries; // Can be less than entry.length.
	private String[] entry;
	
	/*
		Creates an empty list with a given capacity.
	*/
	public OneWayNoRepeatsList(int maximumNumberOfEntries){
		entry = new String[maximumNumberOfEntries + 1];
		countOfEntries = 0;
	}
	
	/*
		Creates an empty list with a capacity of DEFAULT_SIZE. 
	*/
	public OneWayNoRepeatsList(){
		entry = new String[DEFAULT_SIZE + 1];
		countOfEntries = 0;
		//Or replace these two statements with "this(DEFAULT_SIZE)".
	}
	
	public boolean isFull(){
		return countOfEntries == entry.length;
	}
	
	public boolean isEmpty(){
		return countOfEntries == 0;
	}
	
	/*
		Precondition: List is not full.
		Postcondition: If item was not on the list,
		it has been added to the list.
	*/
	public void addItem(String item){
		if(!isOnList(item)){
			if(countOfEntries == entry.length){
				System.out.println("Adding to a full list!");
				System.exit(0);
			}else{
				entry[countOfEntries + 1] = item;
				countOfEntries++;
				//else do nothing. Item is already on the list.
			}
		}
	}
	
	/*
		If the argument indicates a position on the list,
		the entry at that specified position is returned;
		otherwise, null is returned.
	*/
	public String getEntryAt(int position){
		String result = null;
		if((1 <= position) && (position <= countOfEntries)){
			result = entry[position - 1];
		}
		return result;
	}
	
	/*
		Returns true if position indicates the last item
		on the list; otherwise, returns false.
	*/
	public boolean atLastEntry(int position){
		return position == countOfEntries;
	}
	
	/*
		Returns true if item is on the list;
		otherwise, return false. Does not differentiate 
		between uppercase and lowercase letters.
	*/
	public boolean isOnList(String item){
		boolean found = false;
		int i = 1;
				
		while(!found && (i < countOfEntries)){
			if(item.equalsIgnoreCase(entry[i])){
				found = true;
			}else{
				i++;
			}
		}
		
		return found;
	}
	
	/*
		returns true when position is beyond the last 
		entry on the list.
	*/
	public boolean beyondLastEntry(int position){
		if(position > entry.length){
			beyondEntry = true;
		}else{
			beyondEntry = false;
		}	
		return beyondEntry;
	}
	
	/*
		Returns a copy of the array entry.
	*/
	public void getEntryArray(int index){
		beyondLastEntry(index);
		
		if(beyondEntry == true){
			System.out.println("Entry is beyond the scope of the array");
		}else{
			System.out.println(entry[index]);
		}
	}
	
	public int getMaximumNumberOfEntries(){
		return entry.length;
	}
	
	public int getNumberOfEntries(){
		return countOfEntries;
	}
	
	public void eraseList(){
		countOfEntries = 0;
	}
}