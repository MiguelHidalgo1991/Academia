package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.MainUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MainController extends MainUI {

	private JPanel contentPane;
	private StudentManager gestStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainController frame = new MainController();
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
	public MainController() {
		mntmDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToDeleteStudent();
			}
		});
		mntmShowStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToShowStudent();
			}
		});
		mntmModifyStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToModifyStudent();
			}
		});
		mntmCreateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeToCreateStudent();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		gestStudent = new StudentManagerImpl();

	}

	protected void changeToDeleteStudent() {
		cambiarPanel(new DeleteStudentController(gestStudent));

	}

	protected void changeToShowStudent() {
		cambiarPanel(new ShowStudentController(gestStudent));

	}

	protected void changeToCreateStudent() {
		cambiarPanel(new CreateStudentController(gestStudent));
	}

	protected void changeToModifyStudent() {
		cambiarPanel(new ModifyStudentController(gestStudent));
	}

	private void cambiarPanel(JPanel nuevoPanel) {
		contentPane = null;
		contentPane = nuevoPanel;
		this.setContentPane(contentPane);
		this.validate();
	}
}
