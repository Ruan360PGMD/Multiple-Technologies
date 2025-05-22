package blocks.pers;

import mindustry.world.Block;
import mindustry.world.BlockGroup;
import mindustry.world.Tile;
import mindustry.world.blocks.Building;
import mindustry.type.Item;
import mindustry.content.Items;
import mindustry.ctype.Content;
import mindustry.ctype.ContentList;
import mindustry.Vars;
import mindustry.gen.Call;

public class FontSinal extends Block{
        super(name);

}


public class BlocoControleArmazenamento extends Block {

    public BlocoControleArmazenamento(String name) {
        super(name);

        this.update = true;
        this.hasItems = true;
        this.group = BlockGroup.transportation;
        this.solid = true;
        this.size = 1;
        this.itemCapacity = 100; // capacidade interna de itens
    }

    public class BlocoControleBuild extends Building {
        int timer = 0;

        @Override
        public void updateTile() {
            if (timer++ % 20 != 0) return; // a cada 20 ticks

            for (int i = 0; i < 4; i++) {
                Building vizinho = nearby(i);
                if (vizinho == null || vizinho.items == null) continue;

                for (Item item : content.items()) {
                    if (vizinho.items.has(item) && this.acceptItem(this, item)) {
                        vizinho.items.remove(item, 1);
                        this.items.add(item, 1);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public boolean outputsItems() {
        return true;
    }

    @Override
    public boolean hasLiquids() {
        return false;
    }

    @Override
    public void load() {
        super.load();
    }

    @Override
    public Building createBuilding() {
        return new BlocoControleBuild();
    }
}