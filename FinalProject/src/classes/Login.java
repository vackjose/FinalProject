package classes;
import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Login {

	protected Shell shell;
	private Text txtUsername;
	private Text txtPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(463, 310);
		shell.setText("Welcome to J&J Airlines - Login");
		
		txtUsername = new Text(shell, SWT.BORDER);
		txtUsername.setText("Username");
		txtUsername.setBounds(20, 47, 149, 19);
		
		txtPassword = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		txtPassword.setText("Password");
		txtPassword.setBounds(20, 107, 149, 19);
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(20, 87, 59, 14);
		lblPassword.setText("Password");
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(20, 27, 59, 14);
		lblUsername.setText("Username");
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if (username.equals("name") && (password.equals("Pass"))) {
					txtUsername.setText("Correct");
					txtPassword.setText("Correct");
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect Login");
			}
		});
		btnLogin.setBounds(75, 143, 94, 28);
		btnLogin.setText("Login");
		
		
		Link registrationPage = new Link(shell, SWT.NONE);
		registrationPage.setBounds(235, 222, 228, 15);
		registrationPage.setText("<a>New User? Click Here to Register</a>");
		

	}
}
