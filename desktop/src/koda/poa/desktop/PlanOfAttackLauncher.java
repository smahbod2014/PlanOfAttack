package koda.poa.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import koda.poa.PlanOfAttack;

public class PlanOfAttackLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 960;
		config.height = 540;
		config.y = 30;
		config.title = "Plan of Attack";
		new LwjglApplication(new PlanOfAttack(), config);
	}
}
