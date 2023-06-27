class Images extends Frame{
static Image img;

Images(){
  img = Toolkit.getDefaultToolkit().getImage("diamonds.gif");
  MediaTracker track= new MediaTracker