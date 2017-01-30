package masterfile;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class MasterFileRegister extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterFileRegister frame = new MasterFileRegister();
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
	public MasterFileRegister() {
		setTitle("Master File Register");
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
		panel.setLayout(new MigLayout("", "[][][][][][][][][]", "[42.00][grow]"));
		
		JButton btnNewButton = new JButton("Select [F8]");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton, "cell 0 0,grow");
		
		JButton btnSearchf = new JButton("Search [F12]");
		panel.add(btnSearchf, "cell 1 0,grow");
		
		JButton btnDetailsf = new JButton("Details [F5]");
		panel.add(btnDetailsf, "cell 2 0,grow");
		
		JButton btnFilterf = new JButton("Filter[F6]");
		panel.add(btnFilterf, "cell 3 0,grow");
		
		JButton btnReportsf = new JButton("Reports[F9]");
		panel.add(btnReportsf, "cell 4 0,grow");
		
		JButton btnReloadctrl = new JButton("Reload[Ctrl+R]");
		panel.add(btnReloadctrl, "cell 5 0,grow");
		
		JButton btnCustomizef = new JButton("Customize[F7]");
		panel.add(btnCustomizef, "cell 6 0,grow");
		
		JButton btnPhotof = new JButton("Photo[F1]");
		panel.add(btnPhotof, "cell 7 0,grow");
		
		JButton btnExitesc = new JButton("Exit[Esc]");
		panel.add(btnExitesc, "cell 8 0,grow");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, "cell 0 1 9 1,grow");
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		desktopPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new MigLayout("", "[][][][][][][][]", "[][][]"));
		
		JLabel lblNewLabel = new JLabel("Tip: Double click on the column header to sort the record based on that column ");
		panel_1.add(lblNewLabel, "cell 0 0 4 1");
		
		JButton button = new JButton("<<Previous 100");
		panel_1.add(button, "cell 0 1");
		
		JButton btnNext = new JButton("Next 100>>");
		panel_1.add(btnNext, "cell 1 1");
		
		JButton btnPrintStatements = new JButton("Print Statements");
		panel_1.add(btnPrintStatements, "cell 3 1,alignx right");
		
		JButton btnViewStatements = new JButton("View Statements");
		panel_1.add(btnViewStatements, "cell 4 1");
		
		JButton btnDivdSlips = new JButton("Divd. Slips");
		panel_1.add(btnDivdSlips, "cell 5 1");
		
		JButton btnSendEmails = new JButton("Send Email(s)");
		panel_1.add(btnSendEmails, "cell 6 1");
		
		JLabel lblOutOf = new JLabel("1 out of 300 records");
		panel_1.add(lblOutOf, "cell 7 1");
		
		JButton btnPrintEnvelopes = new JButton("Print Envelopes");
		panel_1.add(btnPrintEnvelopes, "cell 0 2");
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox, "cell 1 2");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Envelope 10"}));
		btnPrintStatements.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

}
