package edu.westga.recommender.gui;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingUtilities;


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
	private JRadioButton jRadioButton1;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JTextField jTextField1;
	private JTextField songNameTField;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField artistTField;
	private JRadioButton jRadioButton2;

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
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
				jPanel1.setLayout(jPanel1Layout);
				jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), "Recommend By:", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
				jPanel1.setEnabled(true);
				{
					jRadioButton1 = new JRadioButton();
					GroupLayout jRadioButton1Layout = new GroupLayout((JComponent)jRadioButton1);
					jRadioButton1.setLayout(null);
					jRadioButton1.setText("Artist");
					jRadioButton1Layout.setVerticalGroup(jRadioButton1Layout.createParallelGroup());
					jRadioButton1Layout.setHorizontalGroup(jRadioButton1Layout.createParallelGroup());
				}
				{
					jRadioButton2 = new JRadioButton();
					jRadioButton2.setText("Song");
				}
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup()
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))));
			}
			{
				artistTField = new JTextField();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Artist Name:");
			}
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
				{
					jTextField1 = new JTextField();
				}
				jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)));
				jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)));
			}
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(thisLayout.createSequentialGroup()
				    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
				    .addContainerGap(261, 261))
				.addGroup(thisLayout.createSequentialGroup()
				    .addPreferredGap(jPanel1, jLabel1, LayoutStyle.ComponentPlacement.INDENT)
				    .addGroup(thisLayout.createParallelGroup()
				        .addGroup(thisLayout.createSequentialGroup()
				            .addGroup(thisLayout.createParallelGroup()
				                .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
				                .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
				            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				            .addGroup(thisLayout.createParallelGroup()
				                .addComponent(artistTField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
				                .addComponent(songNameTField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
				        .addComponent(jPanel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				.addGap(26)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(artistTField, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel1, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(songNameTField, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel2, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(17)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {artistTField, songNameTField});
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {artistTField, songNameTField});
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
