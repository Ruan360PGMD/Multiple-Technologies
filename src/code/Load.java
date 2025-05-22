package code;

import mindustry.ctype.ContentList;
import block.pers;
public class Load implements ContentList {

    public static Block fontSinal, blocoControleArmazenamento;

    @Override
    public void load() {
        fontSinal = new FontSinal();
        blocoControleArmazenamento = new BlocoControleArmazenamento("test");
    }
}