package Client;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ChatTabPane extends JPanel implements ActionListener, MouseListener{
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */


	/**
	 * Creates new form NewJPanel
	 */
	public ChatTabPane(ClientNet x, int roomid) {
//		System.out.println(roomid);
		clientnet = x;
		chatRoomid = roomid;
		initComponents();
	}

	/**	
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		base_Pane = new javax.swing.JPanel();
		UserOnline_ScrollPane = new javax.swing.JScrollPane();
		//UserOnline_jTextArea = new javax.swing.JTextArea();
		UserOnlineLabel = new javax.swing.JLabel();
		Chat_ScrollPane = new javax.swing.JScrollPane();
		Chat_jEditorPane = new javax.swing.JEditorPane();
		Message_Pane = new javax.swing.JPanel();
		Emoji_Button = new javax.swing.JButton();
		TextColor_Button = new javax.swing.JButton();
		Underline_ToggleButton = new javax.swing.JToggleButton();
		Italic_ToggleButton = new javax.swing.JToggleButton();
		Bold_ToggleButton = new javax.swing.JToggleButton();
		Message_ScrollPane = new javax.swing.JScrollPane();
		Message_EditorPane = new javax.swing.JEditorPane();

		//friend is add here
		JPanel1 = new JPanel(new BorderLayout());   		    
		JPanel2 = new JPanel(new GridLayout(50,1,4,4));
		JLabel [] jbls1=new JLabel[5];
		for(int i=0;i<jbls1.length;i++){ 
			jbls1[i]=new JLabel( i+1+"", new ImageIcon(),JLabel.LEFT);
			jbls1[i].addMouseListener(this);
			JPanel2.add(jbls1[i]);

		}
		JPanel2.setBackground(Color.WHITE);
		UserOnline_ScrollPane = new JScrollPane(JPanel2);		
		UserOnline_ScrollPane = new JScrollPane(JPanel2);	
		JPanel1.add(UserOnline_ScrollPane,"Center");

		UserOnlineLabel.setText("User Online");

		Chat_jEditorPane.setEditable(false);
		Chat_jEditorPane.setContentType("text/html"); // NOI18N
		Chat_jEditorPane.setPreferredSize(new java.awt.Dimension(0, 0));
		Chat_jEditorPane.setRequestFocusEnabled(false);
		Chat_ScrollPane.setViewportView(Chat_jEditorPane);

		Emoji_Button.setText("Emoji");
		Emoji_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Emoji_ButtonActionPerformed(evt);
			}
		});

		TextColor_Button.setText("Color");
		TextColor_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TextColor_ButtonActionPerformed(evt);
			}
		});

		Underline_ToggleButton.setText("U");
		Underline_ToggleButton.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				Underline_ToggleButtonItemStateChanged(evt);
			}
		});

		Italic_ToggleButton.setText("I");
		Italic_ToggleButton.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				Italic_ToggleButtonItemStateChanged(evt);
			}
		});

		Bold_ToggleButton.setText("B");
		Bold_ToggleButton.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				Bold_ToggleButtonItemStateChanged(evt);
			}
		});

		Message_ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Message_ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

		Message_EditorPane.setContentType("text/html"); // NOI18N
		Message_EditorPane.setMinimumSize(new java.awt.Dimension(10, 25));
		Message_EditorPane.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				Message_EditorPaneKeyPressed(evt);
			}
		});
		Message_ScrollPane.setViewportView(Message_EditorPane);

		javax.swing.GroupLayout Message_PaneLayout = new javax.swing.GroupLayout(Message_Pane);
		Message_Pane.setLayout(Message_PaneLayout);
		Message_PaneLayout.setHorizontalGroup(
				Message_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(Message_PaneLayout.createSequentialGroup()
						.addComponent(Bold_ToggleButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Italic_ToggleButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Underline_ToggleButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(TextColor_Button)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Emoji_Button)
						.addGap(0, 0, Short.MAX_VALUE))
				.addComponent(Message_ScrollPane)
				);
		Message_PaneLayout.setVerticalGroup(
				Message_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Message_PaneLayout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(Message_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Bold_ToggleButton)
								.addComponent(TextColor_Button)
								.addComponent(Italic_ToggleButton)
								.addComponent(Underline_ToggleButton)
								.addComponent(Emoji_Button))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Message_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(43, 43, 43))
				);

		javax.swing.GroupLayout base_PaneLayout = new javax.swing.GroupLayout(base_Pane);
		base_Pane.setLayout(base_PaneLayout);
		base_PaneLayout.setHorizontalGroup(
				base_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(base_PaneLayout.createSequentialGroup()
						.addComponent(Chat_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(base_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(base_PaneLayout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(UserOnlineLabel)
										.addGap(95, 95, 95))
								.addGroup(base_PaneLayout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(UserOnline_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
										.addContainerGap())))
				.addComponent(Message_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		base_PaneLayout.setVerticalGroup(
				base_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(base_PaneLayout.createSequentialGroup()
						.addGroup(base_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(base_PaneLayout.createSequentialGroup()
										.addComponent(UserOnlineLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(UserOnline_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(Chat_ScrollPane))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Message_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 790, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(base_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 511, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(base_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				);
	}// </editor-fold>                        

	private void Emoji_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
		Message_EditorPane.setText("<img src='https://cdn.psychologytoday.com/sites/default/files/blogs/38/2008/12/2598-75772.jpg'/>");
	}                                            

	private void TextColor_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
		Color getColor = JColorChooser.showDialog(null, "Color Selector",Color.BLACK);
		try{
			String x = "<p style=\"margin-top: 0\"><font color=rgb(";
			Pattern pat4 = Pattern.compile("\\d+");
			Matcher m = pat4.matcher(getColor.toString());
			//System.out.print("Printing from Color: " + removeHeader(message_jEditorPane.getText()));
			while(m.find()){
				x += m.group()+ ",";
			}
			x = x.substring(0, x.length()-1);
			x += "\">" + removeHeader(Message_EditorPane.getText()) + "</font></p>";

			Message_EditorPane.setText(x);
		}
		catch(NullPointerException e){

		}
	}                                                

	private void Underline_ToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {                                                        
		if(evt.getStateChange()==ItemEvent.SELECTED){
			Message_EditorPane.setText("<html><u>"+Message_EditorPane.getText()+"</u></html>");
		} else if(evt.getStateChange()==ItemEvent.DESELECTED){
			Message_EditorPane.setText(removeUnderline(Message_EditorPane.getText()));
		}
	}                                                       

	private void Italic_ToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {                                                     
		if(evt.getStateChange()==ItemEvent.SELECTED){
			Message_EditorPane.setText("<html><i>"+Message_EditorPane.getText()+"</i></html>");
		} else if(evt.getStateChange()==ItemEvent.DESELECTED){
			Message_EditorPane.setText(removeItalic(Message_EditorPane.getText()));
		}
	}                                                    

	private void Bold_ToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
		if(evt.getStateChange()==ItemEvent.SELECTED){
			Message_EditorPane.setText("<html><b>"+Message_EditorPane.getText()+"</b></html>");
		} else if(evt.getStateChange()==ItemEvent.DESELECTED){
			Message_EditorPane.setText(removeBold(Message_EditorPane.getText()));
		}
	}                                                  

	private void Message_EditorPaneKeyPressed(java.awt.event.KeyEvent evt) {//Message get send                                              
		if (evt.getKeyCode()==KeyEvent.VK_ENTER){
			//            if(isConnected()){
			//                Client.send(message_jEditorPane.text);
			//            }
			//System.out.println(message_jEditorPane.getText());

			addStringtoChat(LoginPane.Username + ": " +Message_EditorPane.getText().replaceAll("</*html>|</*head>|</*body>|\n|\r|<p style=\"margin-top: 0\">|</p>","").trim()); //add send to

			evt.consume();
			String tosend = LoginPane.Username + ": " + Message_EditorPane.getText().replaceAll("</*html>|</*head>|</*body>|\n|\r|<p style=\"margin-top: 0\">|</p>","").trim();
			clientnet.Send(tosend,chatRoomid);
			Message_EditorPane.setText("");
			
			
			resetToggleButton();
		}
	}                                             
	private StringBuffer _globalStr = new StringBuffer("");
	protected void addStringtoChat(String str){
		str = removeHeader(str) + "<br>";
		_globalStr.append(str);
		Chat_jEditorPane.setText(_globalStr.toString());
	}   
	private static String _str1 = "<html>(.|\\n|\\r)*0\">"; 
	private static String _str2 = "<\\/p>(.|\\n|\\r)*<\\/html>"; 
	private static String _str3 = "(\\w|<)(\\w|.|\\s)*"; 
	private static Pattern pat1 = Pattern.compile(_str1);
	private static Pattern pat2 = Pattern.compile(_str2);
	private static Pattern pat3 = Pattern.compile(_str3);

	private String removeHeader(String str){
		Matcher m = pat1.matcher(str);
		str = m.replaceAll("");
		m = pat2.matcher(str);        
		str = m.replaceAll("");
		m = pat3.matcher(str);
		if (m.find()){
			str = m.group(0);
			if (str != null && str.length() > 0) {
				str = str.substring(0, str.length());
			}
		}
		return str;
	}
	private void resetToggleButton(){
		Bold_ToggleButton.setSelected(false);
		Underline_ToggleButton.setSelected(false);
		Italic_ToggleButton.setSelected(false);
	}
	private String removeBold(String str){
		return (str.replace("<b>", "").replace("</b>", ""));
	}
	private String removeUnderline(String str){
		return (str.replace("<u>", "").replace("</u>", ""));
	}
	private String removeItalic(String str){
		return (str.replace("<i>", "").replace("</i>", ""));
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		if(arg0.getClickCount()==2){
			String friendNo = ((JLabel)arg0.getSource()).getText();
			System.out.println("you want to talk with "+friendNo+"");
			//new QqChat (friendNo);
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

		JLabel jl=(JLabel)arg0.getSource();
		jl.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {

		JLabel jl=(JLabel)arg0.getSource();
		jl.setForeground(Color.black);

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	// Variables declaration - do not modify                     
	private javax.swing.JToggleButton Bold_ToggleButton;
	private javax.swing.JScrollPane Chat_ScrollPane;
	private javax.swing.JEditorPane Chat_jEditorPane;
	private javax.swing.JButton Emoji_Button;
	private javax.swing.JToggleButton Italic_ToggleButton;
	private javax.swing.JEditorPane Message_EditorPane;
	private javax.swing.JPanel Message_Pane;
	private javax.swing.JScrollPane Message_ScrollPane;
	private javax.swing.JButton TextColor_Button;
	private javax.swing.JToggleButton Underline_ToggleButton;
	private javax.swing.JLabel UserOnlineLabel;
	private javax.swing.JScrollPane UserOnline_ScrollPane;
	//	private javax.swing.JTextArea UserOnline_jTextArea;
	private javax.swing.JPanel base_Pane;
	private JPanel JPanel1;
	private JPanel JPanel2;
	private JPanel JPanel3;
	private ClientNet clientnet;
	protected int chatRoomid;
	// End of variables declaration                   

}


