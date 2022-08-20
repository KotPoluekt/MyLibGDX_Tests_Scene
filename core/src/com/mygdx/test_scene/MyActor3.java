package com.mygdx.test_scene;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Align;

public class MyActor3 extends Actor {

    BitmapFont font;

    public MyActor3(int width, int height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        this.setX(x);
        this.setY(y);

        font = new BitmapFont();
        font.setColor(Color.RED);
        font.getData().setScale(2.0f);
        font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        font.draw(batch, "Test", 0, 0, 0, Align.right, false);
    }
}
