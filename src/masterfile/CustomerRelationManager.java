package masterfile;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CustomerRelationManager extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRelationManager frame = new CustomerRelationManager();
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
	public CustomerRelationManager() {
		setTitle("Customer Relation Manager");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth()-408;
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight()-45;
		setBounds(200, 5, (int) width, (int)height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		scrollPane.setViewportView(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		desktopPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new MigLayout("", "[][242.00][][173.00]", "[][20.00][19.00][82.00]"));
		
		JLabel lblDateAndTime = new JLabel("Date and Time");
		panel_3.add(lblDateAndTime, "cell 0 0");
		
		textField = new JTextField();
		panel_3.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblContactMode = new JLabel("Contact Mode");
		panel_3.add(lblContactMode, "cell 2 0,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"On Phone"}));
		panel_3.add(comboBox, "cell 3 0,growx");
		
		JLabel lblPersonWhoCalled = new JLabel("Person Who called in");
		panel_3.add(lblPersonWhoCalled, "cell 0 1");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_3.add(textField_2, "cell 1 1,growx");
		
		JLabel lblCalledInAs = new JLabel("Called in as");
		panel_3.add(lblCalledInAs, "cell 2 1,alignx trailing");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"As Member"}));
		panel_3.add(comboBox_1, "cell 3 1,growx");
		
		JLabel lblCallingI = new JLabel("Calling For (Brief)");
		panel_3.add(lblCallingI, "cell 0 2");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Inquiry"}));
		panel_3.add(comboBox_2, "cell 1 2,growx");
		
		JLabel lblCallerRefferedTo = new JLabel("Caller Reffered to");
		panel_3.add(lblCallerRefferedTo, "cell 2 2");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"No one to reffer to"}));
		panel_3.add(comboBox_3, "cell 3 2,growx");
		
		JLabel lblWhatWasThe = new JLabel("What was the inquiry about");
		panel_3.add(lblWhatWasThe, "cell 0 3");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_3.add(scrollPane_2, "cell 1 3,grow");
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		JLabel lblCallerRefferedTo_1 = new JLabel("Caller Reffered to date");
		panel_3.add(lblCallerRefferedTo_1, "cell 2 3");
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		desktopPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new MigLayout("", "[fill][][][][][][]", "[34.00,fill]"));
		
		JButton btnNewItemctrl = new JButton("New Item [Ctrl+N]");
		panel_1.add(btnNewItemctrl, "cell 0 0,grow");
		
		JButton btnEditItemctrle = new JButton("Edit Item [Ctrl+E]");
		panel_1.add(btnEditItemctrle, "cell 1 0");
		
		JButton btnSaveItemctrls = new JButton("Save Item [Ctrl+S]");
		panel_1.add(btnSaveItemctrls, "cell 2 0");
		
		JButton btnDeleteItemctrld = new JButton("Delete Item [Ctrl+D]");
		panel_1.add(btnDeleteItemctrld, "cell 3 0");
		
		JButton btnCancelItemctrll = new JButton("Cancel Item [Ctrl+L]");
		panel_1.add(btnCancelItemctrll, "cell 4 0");
		
		JButton btnPrintReport = new JButton("Print Report");
		panel_1.add(btnPrintReport, "cell 5 0");
		
		JButton btnCloseesc = new JButton("Close [Esc]");
		panel_1.add(btnCloseesc, "cell 6 0");
		
		JPanel panel_2 = new JPanel();
		desktopPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new MigLayout("", "[grow]", "[200]"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, "cell 0 0,grow");
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}

}
