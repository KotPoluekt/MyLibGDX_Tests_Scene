package com.mygdx.test_scene;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class MyGdxGame extends ApplicationAdapter {
	private Stage stage;

	private Label lbText;
	
	@Override
	public void create () {
		stage = new Stage(new ExtendViewport(9,16));
		Gdx.input.setInputProcessor(stage);

		Gdx.app.log("TRATATA", "Bottom black bar = " + stage.getViewport().getBottomGutterHeight());
		Gdx.app.log("TRATATA", "Top black bar = " + stage.getViewport().getTopGutterHeight());
		Gdx.app.log("TRATATA", "Screen height = " + stage.getViewport().getScreenHeight());
		Gdx.app.log("TRATATA", "World height = " + stage.getViewport().getWorldHeight());

		Vector2 vector2 = stage.getViewport().unproject(new Vector2(0, 120));
		Gdx.app.log("TRATATA", "vector2 = " + vector2);

		//stage.addActor(new MyActor(9, 16, 0, 0, Color.BROWN));
		stage.addActor(new MyActor1(1, 1, 0, 0, Color.PURPLE));
		stage.addActor(new MyActor1(1, 1, 1, 1, Color.CORAL));
		stage.addActor(new MyActor1(1, 1, 2, 2, Color.GREEN));

		stage.addActor(new MyActor2(2, 2, 4, 4));

		stage.addActor(new MyActor3(1, 1, 4, 7));

		lbText = new Label("Test",
				new Label.LabelStyle(new FreeTypeFontGenerator(Gdx.files.internal("fonts/Roboto-Regular.ttf")).
						generateFont(new FreeTypeFontGenerator.FreeTypeFontParameter()), Color.BLACK));

		lbText.setPosition(4, 10);
		stage.addActor(lbText);
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		stage.act();
		stage.draw();
	}
	
	@Override
	public void dispose () {
		stage.dispose();
	}
}
