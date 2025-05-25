package Main;

import arc.Core;
import mindustry.mod.Mod;

import load.BlockLoad;

public class loadMod extends Mod {

    public loadMod() {
        Log.info("Meu mod foi carregado!");
    }

    @Override
    public void loadContent() {
        new BlockLoad().load();
    }
}