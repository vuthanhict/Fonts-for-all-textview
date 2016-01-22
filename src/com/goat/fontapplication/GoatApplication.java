package com.goat.fontapplication;

import android.app.Application;

/**
 * 
 * @author Goat software
 * @since 22 January, 2016
 *
 */
public class GoatApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		// Font from assets: "assets/fonts"
		FontsOverride.setDefaultFont(getApplicationContext(), "DEFAULT", "fonts/Roboto-Regular.ttf");
        FontsOverride.setDefaultFont(getApplicationContext(), "MONOSPACE", "fonts/Roboto-Light.ttf");
        FontsOverride.setDefaultFont(getApplicationContext(), "SERIF", "fonts/RobotoCondensed-Bold.ttf");
        FontsOverride.setDefaultFont(getApplicationContext(), "SANS_SERIF", "fonts/RobotoCondensed-LightItalic.ttf");
	}

}
