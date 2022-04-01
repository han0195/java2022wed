package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) { // �׼ǹ�ư ���̵�
    	System.out.println(" ���̵�ã�� �������� �̵� ");
    	Login.instance.loadpage("/view/login/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" �н�����ã�� �������� �̵� ");
    	Login.instance.loadpage("/view/login/findpw.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" ȸ������ �������� �̵� ");
    	// *ȸ������ ��ư�� ������ login��Ʈ��Ŭ���� �� borderpane �����̳� center ������ ����
    	// ���� : �ٸ� Ŭ������ �����̳� ȣ�� 
//    		Login login = new Login(); // ���ο� �����̳� ���� [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// �ذ��� : ���� �����̳� �������� ��� !!!! -> this
    	Login.instance.loadpage("/view/login/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	String id = txtid.getText();
    	String pw = txtpassword.getText();
    	
    	login(id, pw);
    	
    	System.out.println(" �α���ó��");
    }
    
    public boolean login(String id, String password) {
		// 1. ��Ʈ�ѿ� �Էµ� �� ��������
    	String txid = txtid.getText();
		// 2. db��ü�� �޼ҵ� ȣ��
		String txpw = txtpassword.getText();
		// 3. ��� Ȯ��
		boolean result2 = MemberDao.memberDao.login(txid, password);
		if(result2) {
			//������ ��ȯ [�����ð�]
			// * �׽�Ʈ
			lblconfirm.setText("�α��μ���");
		}else {
			lblconfirm.setText("����] ��ġ�ϴ� ȸ�������� �����ϴ�");
		}
		return false;
	}
	
	
}










