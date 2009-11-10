package edu.westga.recommender.gui;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingUtilities;

import edu.wesga.recommender.model.ProcessResultSet;
import edu.wesga.recommender.model.Song;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private JPanel jPanel2;
	private JTextField songNameTField;
	private JLabel jLabel2;
	private JButton recommendButton;
	private AbstractAction RecommendAbstractAction1;
	private ProcessResultSet result;
	private JScrollPane jScrollPane1;
	private JTextArea recommendationTextArea;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
		this.result= new ProcessResultSet();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Song Name:");
			}
			{
				songNameTField = new JTextField();
			}
			{
				jPanel2 = new JPanel();
				GroupLayout jPanel2Layout = new GroupLayout((JComponent)jPanel2);
				jPanel2.setLayout(jPanel2Layout);
				jPanel2.setBorder(BorderFactory.createTitledBorder("Recommendations"));
				jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
					.addComponent(getJScrollPane1(), GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(5, 5));
				jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
					.addComponent(getJScrollPane1(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE));
			}
			{
				recommendButton = new JButton();
				recommendButton.setText("Recommend");
				recommendButton.setAction(getRecommendAbstractAction1());
			}
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(songNameTField, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(recommendButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 19, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 92, Short.MAX_VALUE))
				    .addComponent(jPanel2, GroupLayout.Alignment.LEADING, 0, 380, Short.MAX_VALUE)));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(20, 20)
				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(songNameTField, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
				    .addComponent(recommendButton, GroupLayout.Alignment.BASELINE, 0, 20, Short.MAX_VALUE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private AbstractAction getRecommendAbstractAction1() {
		if(RecommendAbstractAction1 == null) {
			RecommendAbstractAction1 = new AbstractAction("Recommend", null) {
				public void actionPerformed(ActionEvent evt) {
					
					result.work(songNameTField.getText());
					for(Song s : result.getList()){
					 getRecommendationArea().append(s.getArtistName()+","+" "+ s.getSongName()+ '\n');
						
					}
						
					
					
					
					
					
					
					
					
					
					
				}
			};
		}
		return RecommendAbstractAction1;
	}
	
	private JTextArea getRecommendationArea() {
		if(recommendationTextArea == null) {
			recommendationTextArea = new JTextArea();
			recommendationTextArea.setEditable(false);			

		}
		return recommendationTextArea;
	}
	
	private JScrollPane getJScrollPane1() {
		if(jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getRecommendationArea());
		}
		return jScrollPane1;
	}

}
