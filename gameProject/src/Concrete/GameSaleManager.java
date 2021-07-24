package Concrete;

import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements IGameSaleService{
	
	@Override
	public void salesGame(Player player, Game game, Campaign campaign) {
		double discountedPrice = game.getGamePrice() - (game.getGamePrice()*(campaign.getCampaignDiscount()/100.0));
		System.out.println("Sat�n Al�nan Oyun Bilgileri");
		System.out.println("Oyun Ad�: " + game.getGameName());
		System.out.println("Oyun Fiyat� (�ndirimsiz): " + game.getGamePrice());
		System.out.println("Oyun �ndirimli Fiyat�: " + discountedPrice);
		System.out.println("Oyun T�r�: " + game.getTypeOfGame());
	}

}
