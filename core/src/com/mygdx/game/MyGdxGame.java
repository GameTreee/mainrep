package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private StateManager sm;
	@Override
	public void create () {
		batch = new SpriteBatch();
		sm=new StateManager();
		Gdx.gl.glClearColor(0.35f, 0.33f, 0.87f, 1);
		Gdx.graphics.setWindowedMode(640,480);
		sm.push(new MenuState(sm));
	}

	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.update(Gdx.graphics.getDeltaTime());
		sm.render(batch);
	}
}
