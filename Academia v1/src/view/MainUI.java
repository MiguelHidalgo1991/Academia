package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainUI extends JFrame {

	protected JPanel contentPane;
	protected JMenuItem mntmCreateStudent;
	protected JMenuItem mntmModifyStudents;
	protected JMenuItem mntmShowStudent;
	protected JMenuItem mntmDeleteStudent;

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnStudent = new JMenu("ESTUDIANTE");
		menuBar.add(mnStudent);

		mntmCreateStudent = new JMenuItem("Crear Estudiante");
		mnStudent.add(mntmCreateStudent);

		mntmModifyStudents = new JMenuItem("Modificar Estudiante");
		mnStudent.add(mntmModifyStudents);
		
		mntmShowStudent = new JMenuItem("Mostrar Estudiante");
		mnStudent.add(mntmShowStudent);
		
		mntmDeleteStudent = new JMenuItem("Borrar Estudiante");
		mnStudent.add(mntmDeleteStudent);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0 };
		gbl_contentPane.rowHeights = new int[] { 0 };
		gbl_contentPane.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
	}

}
