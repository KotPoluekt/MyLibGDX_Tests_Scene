package com.mygdx.test_scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class MyActor2 extends Actor {

    private Texture texture;

    public MyActor2(int width, int height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        this.setX(x);
        this.setY(y);
        texture = new Texture(Gdx.files.internal("test2.png"));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
