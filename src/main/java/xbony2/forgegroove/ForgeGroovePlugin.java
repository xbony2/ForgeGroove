package xbony2.forgegroove;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

/**
 * This is needed to make sure Forge Groove and Groovy are loaded before anything else.
 * 
 * This class is sort of copied from <a href="https://github.com/shadowfacts/Forgelin/blob/e0209c61b274471a117b50515d926149476517ed/src/main/java/net/shadowfacts/forgelin/preloader/ForgelinPlugin.java">this</a>
 * 
 * @author xbony2
 *
 */
public class ForgeGroovePlugin implements IFMLLoadingPlugin {

	@Override
	public String[] getASMTransformerClass(){
		return new String[0];
	}

	@Override
	public String getModContainerClass(){
		return null;
	}

	@Override
	public String getSetupClass(){
		return "xbony2.forgegroove.ForgeGrooveSetup";
	}

	@Override
	public void injectData(Map<String, Object> data){}

	@Override
	public String getAccessTransformerClass(){
		return null;
	}
}
