package koda.poa;

import com.badlogic.gdx.Screen;

public class PlayScreen implements Screen {

	GameLogic game;
	
	@Override
	public void render(float dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void show() {
		game = new GameLogic();
	}

	@Override
	public void hide() {
		dispose();
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
	
	}
}
