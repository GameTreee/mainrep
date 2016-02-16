package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import GameEntities.Hero;

/**
 * Created by CHESTER on 16.02.2016.
 */
public class GameState extends State {
    private Texture hero_texture;
    private Hero hero;
    float dx=1,dy=0;
    public  GameState(StateManager sm){
        super(sm);
        hero_texture=new Texture("hero.png");
        hero=new Hero(100,100,hero_texture);

    }
    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            hero.setDirection(dx,dy);
            dx=dx*-1;

        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        hero.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.graphics.getGL20().glClearColor(0,1,0,1);
        hero.render(sb);
    }

    @Override
    public void dispose() {

    }

}
