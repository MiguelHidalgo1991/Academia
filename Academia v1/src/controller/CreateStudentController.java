package controller;

import view.CreateStudentUI;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Student;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CreateStudentController extends CreateStudentUI {
	StudentManager gestStudent;

	/**
	 * Create the panel.
	 */
	public CreateStudentController(StudentManager s) {
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFrame f = new JFrame();
				txtDateOfBirth.setText(new DatePicker(f).setPickedDate());
				
			}
		});
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestStudent = s;
				Student student = gestStudent.createStudent(txtDni.getText(), txtName.getText(), txtSurnames.getText());

				SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
				Date com;
				try {
					com = dateN.parse(txtDateOfBirth.getText());
					student.setDateOfBirth(com);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				student.setObservation(txtObservations.getText());
				gestStudent.updateStudent(student);

				JOptionPane.showMessageDialog(CreateStudentController.this, "Estudiante creado con éxito");

				txtName.setText("");
				txtSurnames.setText("");
				txtDni.setText("");
				txtDateOfBirth.setText("");
				txtObservations.setText("");
			}
		});

	}

}
