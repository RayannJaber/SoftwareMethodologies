import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class returnToMainMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			SoftwareMethodologies window = new SoftwareMethodologies();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
