package Entities;

public class Game {
	private int gameId;
	private String gameName;
	private String typeOfGame;
	private double gamePrice;
	
	public Game(int gameId, String gameName, String typeOfGame, double gamePrice) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.typeOfGame = typeOfGame;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getTypeOfGame() {
		return typeOfGame;
	}

	public void setTypeOfGame(String typeOfGame) {
		this.typeOfGame = typeOfGame;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
}
