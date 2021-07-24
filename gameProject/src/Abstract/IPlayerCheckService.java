package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface IPlayerCheckService {
	boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException;
}
