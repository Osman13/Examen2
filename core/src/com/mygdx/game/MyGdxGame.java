package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
<<<<<<< HEAD
import com.badlogic.gdx.audio.Sound;
=======
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Random;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

public class MyGdxGame extends ApplicationAdapter {
	Random ran = new Random();
	SpriteBatch batch;
	Texture background,tijera1,piedra1,papel1,piedra2,papel2,tijera2;
	Texture ganador,perdedor,empate;

	boolean visibletijera1=false;
	boolean visiblepiedra1=false;
	boolean visiblepapel1=false;
	boolean visiblepiedra2=false;
	boolean visiblepapel2=false;
	boolean visibletijera2=false;
	boolean visibleganador = false;
	boolean visibleperdedor = false;
	boolean visibleempate = false;
	boolean click = true;
	int computer_choice = ran.nextInt(3)+1;

	@Override
	public void create () {
		batch = new SpriteBatch();
<<<<<<< HEAD
		Sound back = Gdx.audio.newSound(Gdx.files.internal("fire.ogg"));
		back.play(1.0f);
		background = new Texture("background.png");
		tijera1 = new Texture("tijera2.png");
		piedra1 = new Texture("piedra2.png");
		papel1 = new Texture("papel2.png");

		piedra2 = new Texture("piedra.png");
		papel2 = new Texture("papel.png");
		tijera2 = new Texture("tijera.png");

=======
		background = new Texture("background.png");
		tijera1 = new Texture("tijera.png");
		piedra1 = new Texture("piedra.png");
		papel1 = new Texture("papel.png");
		piedra2 = new Texture("piedra.png");
		papel2 = new Texture("papel.png");
		tijera2 = new Texture("tijera.png");
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
		ganador = new Texture("ganador.png");
		perdedor = new Texture("perdedor.png");
		empate = new Texture("empatado.png");

	}

	@Override
	public void render() {


		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(background, 0, 0);

		if (visibletijera1)

			batch.draw(tijera1, 0, 0);

		if (visiblepiedra1)

			batch.draw(piedra1, 0, 0);

		if (visiblepapel1)

			batch.draw(papel1, 0, 0);

		if (visiblepiedra2)

			batch.draw(piedra2, 350, 250);

		if (visiblepapel2)

			batch.draw(papel2, 350, 250);

		if (visibletijera2)

			batch.draw(tijera2, 350, 250);

		if (visibleganador)

			batch.draw(ganador, 12, 320);

		if (visibleperdedor)

			batch.draw(perdedor, 12, 320);

		if (visibleempate)

			batch.draw(empate, 12, 320);

		if(click) {
			if (Gdx.input.isKeyPressed(Input.Keys.A)) {
<<<<<<< HEAD
				Sound sound = Gdx.audio.newSound(Gdx.files.internal("Pop.ogg"));
				sound.play(1.0f);
=======
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
				visibletijera1 = true;
				switch (computer_choice) {
					case 1:
						visiblepiedra2 = true;
						break;

					case 2:
						visiblepapel2 = true;
						break;

					case 3:
						visibletijera2 = true;
						break;
				}
				if (computer_choice == 1) {
<<<<<<< HEAD
					Sound go = Gdx.audio.newSound(Gdx.files.internal("Game_Over.ogg"));
					go.play(1.0f);
					visibleperdedor = true;
				} else if (computer_choice == 2) {
					Sound yay = Gdx.audio.newSound(Gdx.files.internal("yay.wav"));
					yay.play(1.0f);
=======
					visibleperdedor = true;
				} else if (computer_choice == 2) {
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
					visibleganador = true;
				} else if (computer_choice == 3) {
					visibleempate = true;
				}
				click=false;
			}
		}

		if(click) {
			if (Gdx.input.isKeyPressed(Input.Keys.S)) {
<<<<<<< HEAD
				Sound sound = Gdx.audio.newSound(Gdx.files.internal("Pop.ogg"));
				sound.play(1.0f);
=======
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
				visiblepiedra1 = true;
				switch (computer_choice) {
					case 1:
						visiblepiedra2 = true;
						break;

					case 2:
						visiblepapel2 = true;
						break;

					case 3:
						visibletijera2 = true;
						break;
				}
				if (computer_choice == 1) {
					visibleempate = true;
				} else if (computer_choice == 2) {
<<<<<<< HEAD
					Sound go = Gdx.audio.newSound(Gdx.files.internal("Game_Over.ogg"));
					go.play(1.0f);
					visibleperdedor = true;
				} else if (computer_choice == 3) {
					Sound yay = Gdx.audio.newSound(Gdx.files.internal("yay.wav"));
					yay.play(1.0f);
=======
					visibleperdedor = true;
				} else if (computer_choice == 3) {
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
					visibleganador = true;
				}
				click=false;
			}
		}

		if(click) {
			if (Gdx.input.isKeyPressed(Input.Keys.D)) {
<<<<<<< HEAD
				Sound sound = Gdx.audio.newSound(Gdx.files.internal("Pop.ogg"));
				sound.play(1.0f);
=======
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
				visiblepapel1 = true;
				switch (computer_choice) {
					case 1:
						visiblepiedra2 = true;
						break;

					case 2:
						visiblepapel2 = true;
						break;

					case 3:
						visibletijera2 = true;
						break;
				}
				if (computer_choice == 1) {
					visibleganador = true;
<<<<<<< HEAD
					//visiblepiedra2 = true;
					Sound yay = Gdx.audio.newSound(Gdx.files.internal("yay.wav"));
					yay.play(1.0f);
				} else if (computer_choice == 2) {
					visibleempate = true;
					//visiblepapel2 = true;
				} else if (computer_choice == 3) {
					visibleperdedor = true;
					Sound go = Gdx.audio.newSound(Gdx.files.internal("Game_Over.ogg"));
					go.play(1.0f);
					//visibletijera2 = true;
=======
					visiblepiedra2 = true;
				} else if (computer_choice == 2) {
					visibleempate = true;
					visiblepapel2 = true;
				} else if (computer_choice == 3) {
					visibleperdedor = true;
					visibletijera2 = true;
>>>>>>> ec4835d6cf9c805f0acda3b78986100536e0ee32
				}
				click=false;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.R)) {
			visibletijera1 = false;
			visiblepiedra1 = false;
			visiblepapel1 = false;
			visiblepiedra2 = false;
			visiblepapel2 = false;
			visibletijera2 = false;
			visibleganador = false;
			visibleperdedor = false;
			visibleempate = false;
			click=true;
			randgen();
			//continue;
		}

		batch.end();
//		}

	}

	public int randgen()
	{
		computer_choice = ran.nextInt(3)+1;

		return computer_choice;
	}

}
