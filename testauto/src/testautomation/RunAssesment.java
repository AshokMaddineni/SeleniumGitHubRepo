package testautomation;

public class RunAssesment {

	public static void main(String[] args) throws InterruptedException {

		Assessment as = new Assessment();
		as.Launch();
		as.SampleText();
		as.NewTab();
		as.Submit();
		as.AlertBox();
		as.RadioButton();
		as.CheckBox();
		//as.DropDown();
		as.GenerateAlertBox();
		as.GenerateConfirmBox();
		//as.DragandDrop();
		//as.QuitBrowser();

	}

}
