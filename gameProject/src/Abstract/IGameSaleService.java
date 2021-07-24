package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameSaleService {
	void salesGame(Player player,Game game,Campaign campaign);
}
