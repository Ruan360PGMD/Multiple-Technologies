package load;

import mindustry.world.Block;
import mindustry.ctype.ContentList;

import blocks.BlocoControleArmazenamento;

public class BlockLoad implements ContentList {

    public static Block blockArmazen;

    @Override
    public void load() {
        // Aqui vamos só inicializar o bloco simples (sem configurar ainda)
        blockArmazen = new BlocoControleArmazenamento("Bloco-Controle-Armazenamento");
    }
}