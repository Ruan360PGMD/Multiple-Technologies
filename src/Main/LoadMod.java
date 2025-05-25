package Main;

import arc.Core;
import mindustry.mod.Mod;

import load.BlockLoad;

public class LoadMod extends Mod {

    public LoadMod() {
        Log.info("Meu mod foi carregado!");
    }

    @Override
    public void loadContent() {
        new BlockLoad().load();
    }
}