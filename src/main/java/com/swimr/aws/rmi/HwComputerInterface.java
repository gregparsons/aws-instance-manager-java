package com.swimr.aws.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface HwComputerInterface extends Remote {

	/**
	 * Start the number of logical computers specified. They should be informed of the
	 * RMI registry/space url to call back to.
	 */
	boolean startLogicalComputers(int numComputers) throws RemoteException;

	List<String> getRunningProcessStrings() throws RemoteException;

	String getAwsInstanceId() throws RemoteException;
	Utils.Hw_Computer_Size getEc2Size() throws RemoteException;
}
