import java.rmi.RemoteException;

import Adapter.MernisServiceAdapter;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Player player = new Player(1, "Halil ibrahim", "KURT", "123456789", 2021, "halil@gmail.com");

		Game game = new Game(1, "Grand Theft Auto V", "Aksiyon - Macera", 100.0);

		Campaign campaign = new Campaign(1, "Yaz Kampanyasý", 20, "18/09/2021");

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);

		System.out.println("**************");

		GameSaleManager gameSaleManager = new GameSaleManager();
		if (playerManager.isCheckPlayer()) {
			gameSaleManager.salesGame(player, game, campaign);
		}
	}

}
