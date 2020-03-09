package Muni_Pranay_Polampalli_Task.Design_Patterns_Task.Behavioural_Patterns;


interface ActionListenerCommand {  
    public void execute();  
}  
class Document {  
    public void open(){  
     System.out.println("Document Opened");  
 }  
 public void save(){  
     System.out.println("Document Saved");  
 }  
}  
class ActionOpen implements ActionListenerCommand{  
    private Document doc;  
    public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
 
    public void execute() {  
        doc.open();  
    }  
}
class MenuOptions implements ActionListenerCommand{  

    public MenuOptions(ActionListenerCommand clickOpen,ActionListenerCommand clickSave) {  

    }  
 
    public void clickOpen() {  
        
    	System.out.println("the Document Opened");
    	
    }  
    public void clickSave() {  
    
    	System.out.println("the Document Saved");
    }

	public void execute() {
		
		
		
		
	} 
}
class ActionSave implements ActionListenerCommand{  
	   private Document doc;  
	   public ActionSave(Document doc) {  
	        this.doc = doc;  
	    }  
	    
	    public void execute() {  
	        doc.save();  
	    }  
	}  

public class Command_Pattern {
	  public static void main(String[] args) {  
	        Document doc = new Document();  
	          
	        ActionListenerCommand clickOpen = new ActionOpen(doc);  
	        ActionListenerCommand clickSave = new ActionSave(doc);  
	          
	        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
	          
	        menu.clickOpen();  
	        menu.clickSave();  
	        
	   }  

}
