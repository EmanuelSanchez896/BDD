import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Tabla {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla window = new Tabla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tabla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(10, 20, 293, 480);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel NombreAlumno = new JLabel("Nombre");
		NombreAlumno.setBounds(23, 20, 84, 31);
		panel.add(NombreAlumno);
		
		JLabel ApellidoAlumno = new JLabel("Apellido");
		ApellidoAlumno.setBounds(23, 77, 45, 13);
		panel.add(ApellidoAlumno);
		
		JLabel CedulaAlumno = new JLabel("Cedula");
		CedulaAlumno.setBounds(23, 113, 45, 13);
		panel.add(CedulaAlumno);
		
		JLabel Carrera = new JLabel("Carrera");
		Carrera.setBounds(23, 159, 45, 13);
		panel.add(Carrera);
		
		textField = new JTextField();
		textField.setBounds(96, 26, 170, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 74, 170, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 110, 170, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 156, 170, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setBounds(198, 232, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(107, 232, 85, 21);
		panel.add(btnNewButton_1);
		
		 JButton btnNewButton_2 = new JButton("Guardar");
	        btnNewButton_2.setBounds(12, 232, 85, 21);
	        btnNewButton_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String nombre = textField.getText();
	                String apellido = textField_1.getText();
	                int edad = Integer.parseInt(textField_2.getText());
	                String cedula = textField_3.getText();
	                String carrera = textField_4.getText();
	                String materia = textField_5.getText();

	                Database db = new Database();
	                db.insertarAlumno(nombre, apellido, edad, cedula, carrera, materia);
	            }
	        });
	        panel.add(btnNewButton_2);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(338, 20, 430, 480);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(31, 36, 389, 407);
		panel_1.add(table);
		frame.setBounds(100, 100, 810, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
