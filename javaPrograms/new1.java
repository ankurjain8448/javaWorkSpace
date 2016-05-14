import java.io.*;
import java.util.*;
import javax.swing.*;
import C.Users.Ankur.Desktop.One.lticivil.src;
import C.Users.Ankur.Desktop.One.lticivil.src.utils.com.lti.utils;
class A
{
	public static void main(String args[]) throws Exception 
		{
			TestWebCam test = new TestWebCam();
		}
}


class TestWebCam implements CaptureObserver
{
public TestWebCam() {
CaptureSystemFactory factory = DefaultCaptureSystemFactorySingleton.instance();
CaptureSystem system;
try {
system = factory.createCaptureSystem();
system.init();
List list = system.getCaptureDeviceInfoList();
int i = 0;
if (i < list.size()) {
CaptureDeviceInfo info = (CaptureDeviceInfo) list.get(i);
System.out.println((new StringBuilder()).append("Device ID ").append(i).append(": ").append(info.getDeviceID()).toString());
System.out.println((new StringBuilder()).append("Description ").append(i).append(": ").append(info.getDescription()).toString());
captureStream = system.openCaptureDeviceStream(info.getDeviceID());
captureStream.setObserver(TestWebCam.this);
}
} catch (CaptureException ex) {
ex.printStackTrace();
}
//UI work of the program
JFrame frame = new JFrame();
frame.setSize(7000, 800);
JPanel panel = new JPanel();
frame.setContentPane(panel);
frame.setVisible(true);
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
start = new JButton("Start");
stop = new JButton("Stop");
shot = new JButton("Shot");
panel.add(start);
panel.add(stop);
panel.add(shot);
panel.revalidate();
start.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
captureStream.start();
} catch (CaptureException ex) {
ex.printStackTrace();
}
}
});
stop.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
captureStream.stop();
} catch (CaptureException ex) {
ex.printStackTrace();
}
}
});
shot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
takeShot=true;
}
});
}


public void onNewImage(CaptureStream stream, Image image) {
if(!takeShot) return;
takeShot=false;
System.out.println("New Image Captured");
byte bytes[] = null;
try {
if (image == null) {
bytes = null;
return;
}
try {
ByteArrayOutputStream os = new ByteArrayOutputStream();
JPEGImageEncoder jpeg = JPEGCodec.createJPEGEncoder(os);
jpeg.encode(AWTImageConverter.toBufferedImage(image));
os.close();
bytes = os.toByteArray();
} catch (IOException e) {
e.printStackTrace();
bytes = null;
} catch (Throwable t) {
t.printStackTrace();
bytes = null;
}
if (bytes == null) {
return;
}
ByteArrayInputStream is = new ByteArrayInputStream(bytes);
File file = new File("/img" + Calendar.getInstance().getTimeInMillis() + ".jpg");
FileOutputStream fos = new FileOutputStream(file);
fos.write(bytes);
fos.close();
BufferedImage myImage = ImageIO.read(file);
shot.setText("");
shot.setIcon(new ImageIcon(myImage));
shot.revalidate();
} catch (IOException ex) {
ex.printStackTrace();
}
}
public void onError(CaptureStream stream, CaptureException ce) {
System.out.println("Error!");
}
}