package GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by CHESTER on 16.02.2016.
 */
public class Hero extends Unit {

    public Hero(float x, float y, Texture t){
        super(x,y,t);
        this.dx=0;
        this.dy=0;
    }
    @Override
    public void update(float dt) {
        x+=dx;
        y+=dy;
    }
    public void setDirection(float dx,float dy){
        this.dx=dx;
        this.dy=dy;
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(this.texture, x, y);
        sb.end();
    }
}
