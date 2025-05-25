package load;

import mindustry.world.Block;
import mindustry.ctype.ContentList;

import block.BlocoControleArmazenamento;

public class BlockMod implements ContentList {

    public static Block blockArmazen;

    @Override
    public void load() {
        // Aqui vamos só inicializar o bloco simples (sem configurar ainda)
        blockArmazen = new BlocoControleArmazenamento("Bloco-Controle-Armazenamento");
    }
}