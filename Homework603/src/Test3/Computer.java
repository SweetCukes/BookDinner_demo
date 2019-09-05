package Test3;

public class Computer {
	private IMobileStorage _usbDrive;

    public IMobileStorage get_usbDrive() {
        return _usbDrive;
    }

    public void set_usbDrive(IMobileStorage _usbDrive) {
        this._usbDrive = _usbDrive;
    }

    public Computer(IMobileStorage _usbDrive) {
        this._usbDrive = _usbDrive;
    }
  


    public void ReadData(){
        this._usbDrive.read();
    }	
    
    public void WriteData(){
        this._usbDrive.write();
    }
    public Computer(){}
    
  
}

