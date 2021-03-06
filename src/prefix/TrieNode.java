package prefix;

public class TrieNode 
{
	char letter;
	TrieNode[] links;
	boolean fullWord;
	TrieNode(char letter)
	{
		this.letter = letter;
	    links = new TrieNode[26];
	    this.fullWord = false;
	}
	TrieNode(char letter, boolean fullWord)
	{
		this.letter = letter;
	    links = new TrieNode[26];
	    this.fullWord = fullWord;
	}
}
