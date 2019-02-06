public class MyApplet extends JApplet {

   @Override
   public void init() {
      try {
         SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {
               JFrame myFrame = new MyFrame("Frame");
               Container contentPane = myFrame.getContentPane();
               setContentPane(contentPane);
            }
         });
      } catch (InterruptedException e) {
         e.printStackTrace();
      } catch (InvocationTargetException e) {
         e.printStackTrace();
      }
   }
}
