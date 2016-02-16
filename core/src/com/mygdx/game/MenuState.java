package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.awt.Rectangle;
import java.security.Key;

/**
 * Created by CHESTER on 04.02.2016.
 */
public class MenuState extends State {


    private Texture bg;
    private Texture buttons;
    private TextureRegion startBtn,exitBtn;
    private Rectangle startRect,exitRect;
    public MenuState(StateManager sm){
        super(sm);

        buttons=new Texture("buttons.png");
        bg=new Texture("bg.png");
        startBtn=new TextureRegion(buttons,0,0,600,150);
        exitBtn=new TextureRegion(buttons,0,150,600,150);
    }
    @Override
    protected void handleInput() {
        if (Gdx.input.isTouched()){
            System.out.println("Touched");
            this.sm.pop();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        sb.begin();
        sb.draw(bg, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sb.draw(startBtn, MyGdxGame.WIDTH / 2 - startBtn.getRegionWidth() / 2 * 0.35f,
                MyGdxGame.HEIGHT / 2 + 50, 0, 0, startBtn.getRegionWidth(), startBtn.getRegionHeight(), 0.35f, 0.65f, 0);
        sb.draw(exitBtn,MyGdxGame.WIDTH/2-exitBtn.getRegionWidth()/2*0.35f,
                MyGdxGame.HEIGHT/2-150,0,0,exitBtn.getRegionWidth(),exitBtn.getRegionHeight(),0.35f,0.65f,0);
        /*sb.draw(exitBtn,MyGdxGame.WIDTH/2-150,
                MyGdxGame.HEIGHT/2,300,100);*/
        sb.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        buttons.dispose();

    }
}
