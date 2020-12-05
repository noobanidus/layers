package noobanidus.mods.layers;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import noobanidus.mods.layers.setup.ClientInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("layers")
public class Layers {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "layers";

  public Layers() {
    DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ClientInit::init);
  }
}
