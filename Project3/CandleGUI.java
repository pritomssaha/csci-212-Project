import javax.swing.*;
@SuppressWarnings("serial")
public class CandleGUI extends JFrame {
      
   public CandleGUI(String title, int height, int width) {
	   
	    setTitle(title);
	    setSize(height,width);
        setLocation  (400,200);
	    createFileMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
   } 

   private void createFileMenu(){
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
    
   }

} 