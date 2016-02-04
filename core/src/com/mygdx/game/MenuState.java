package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by CHESTER on 04.02.2016.
 */
public class MenuState extends State {
    private Texture bg;
    public MenuState(StateManager sm){
        super(sm);
        bg=new Texture("bg.png");
    }
    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        sb.begin();
        sb.draw(bg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
