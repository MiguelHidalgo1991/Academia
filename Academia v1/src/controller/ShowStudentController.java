package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Student;
import view.ShowStudentUI;

@SuppressWarnings("serial")
public class ShowStudentController extends ShowStudentUI {

	StudentManager gestStudent;
	Student student;

	/**
	 * Create the panel.
	 */
	public ShowStudentController(StudentManager s) {
		gestStudent = s;
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				student = gestStudent.getStudent(txtDni.getText());

				if (student != null) {
					txtDni.setText("");
					txtName.setText(student.getName());
					txtSurnames.setText(student.getSurname());
					txtDniDelete.setText(student.getDni());
					
					SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
					Date d = student.getDateOfBirth();
					String fecha = dateN.format(d);
					txtDateOfBirth.setText(fecha);
					
					txtObservations.setText(student.getObservation());

					System.out.println(student.getIdentificador());

				} else {
					JOptionPane.showMessageDialog(ShowStudentController.this, "El estudiante que busca no existe",
							"Error", JOptionPane.WARNING_MESSAGE);
					txtDni.setText("");

					txtName.setText("");
					txtSurnames.setText("");
					txtDniDelete.setText("");
					txtDateOfBirth.setText("");
					txtObservations.setText("");

				}
			}
		});

	}

}
