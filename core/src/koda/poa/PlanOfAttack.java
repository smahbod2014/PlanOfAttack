package koda.poa;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class PlanOfAttack extends Game {
	
	PlayScreen ps;
	
	@Override
	public void create() {
		ps = new PlayScreen();
		setScreen(ps);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
}
