package Module;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
static int a=0;
static   JFrame Frame = new JFrame();
static   JPanel jPanel = new JPanel();
logics logics =new logics();
JLabel label =new JLabel("Введите длину масива");
JTextField  jTextField1 =new JTextField("",2);
JButton button = new JButton("Ввести");
GUI(){
Frame = getFrame();
Frame.add(jPanel);
jPanel.setBackground(Color.BLACK);
button.setFont(new Font("Arial", Font.ITALIC, 18));
jTextField1.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 18));
label.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 18));


jPanel.setLayout(new GridLayout(3,0,1,1));
jPanel.add(label);
jPanel.add(jTextField1);
jPanel.add(button);

button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {
if(a==0) {
if(logics.getcheck(jTextField1.getText())==true) {
    logics.Void1(jTextField1.getText());
    label.setText("Введите высоту масива");
    a++;
}else
    label.setText( "Ошибка((((( ");
}else if(a==1) {
if(logics.getcheck(jTextField1.getText())==true) {
    logics.Void2(jTextField1.getText());
    label.setText("Введите элементы через пробел ");
    a++;
} else
    label.setText( "Неувязочка товарищ ");
}
else if(a==2){
logics.Void4(jTextField1.getText());
a++;
}
if(a==3){
String message = "";
message += logics.getMessage();
JOptionPane.showMessageDialog(null, message, "Опа! Оно живое", JOptionPane.PLAIN_MESSAGE);
}
jTextField1.setText("");
}
});
jPanel.revalidate();
}
static JFrame getFrame(){
Frame.setVisible(true);
Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Frame.setTitle("Almost suicide but i dont want to die");
Toolkit toolkit = Toolkit.getDefaultToolkit();
Dimension dimension = toolkit.getScreenSize();
Frame.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 125, 400, 250);
return Frame;
}
}