package masterfile;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");}  catch (Exception ex) {ex.printStackTrace();}  
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth()-10;
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight()-45;
		setBounds(5, 5, (int) width, (int)height);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MEMBERS");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmMemberRegister = new JMenuItem("Member Register");
		mntmMemberRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MasterFileRegister op = new MasterFileRegister();
				op.setVisible(true);
			}
		});
		mnNewMenu.add(mntmMemberRegister);
		
		JMenuItem mntmCustomerRelationManager = new JMenuItem("Customer Relation MAnager");
		mntmCustomerRelationManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerRelationManager op = new CustomerRelationManager();
				op.setVisible(true);
			}
		});
		mnNewMenu.add(mntmCustomerRelationManager);
		
		JMenuItem mntmMembersMasterFile = new JMenuItem("Members MAster File");
		mnNewMenu.add(mntmMembersMasterFile);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
