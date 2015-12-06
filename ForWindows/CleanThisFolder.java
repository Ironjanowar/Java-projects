import java.io.File;

public class CleanThisFolder{
  private static String goodLetters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789.";
  
  private static String aGoodName(String badName){
    String goodName = "";
    for(char badLetter: badName.toCharArray()){
      for(char goodLetter: goodLetters.toCharArray()){
	if(badLetter == goodLetter) goodName += badLetter; 
      }
    }
    return goodName;
  }
  
  public static void main(String[] args) {
    String folderName = ".";
    File folder = new File(folderName);
    File [] listOfFiles = folder.listFiles();
    
    for(File leFile : listOfFiles){
      File f = new File(folderName + "\\" + leFile.getName());
      f.renameTo(new File(folderName + "\\" + aGoodName(leFile.getName())));
    }
  }
}