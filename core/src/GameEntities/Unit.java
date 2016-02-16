package GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by CHESTER on 16.02.2016.
 */
public abstract class Unit {
    protected float x;
    protected float y;
    protected float dx;
    protected float dy;
    protected Texture texture;


    public Unit(float x,float y,Texture t){
        this.x=x;
        this.y=y;
        this.texture=t;

    }

    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);

}
