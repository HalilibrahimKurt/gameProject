package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface IPlayerService {
	void add(Player player) throws NumberFormatException, RemoteException;
	void delete(Player player);
	void update(Player player);
}
