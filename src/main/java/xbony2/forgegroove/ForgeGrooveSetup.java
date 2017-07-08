package xbony2.forgegroove;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLCallHook;

/**
 * This is needed to make sure Forge Groove and Groovy are loaded before anything else.
 * 
 * This class is sort of copied from <a href="https://github.com/shadowfacts/Forgelin/blob/e0209c61b274471a117b50515d926149476517ed/src/main/java/net/shadowfacts/forgelin/preloader/ForgelinSetup.java">this</a>
 * 
 * @author xbony2
 *
 */
public class ForgeGrooveSetup implements IFMLCallHook {

	@Override
	public Void call() throws Exception{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data){
		ClassLoader loader = (ClassLoader)data.get("classLoader");
		try{
			loader.loadClass("xbony2.forgegroove.GroovyAdapter");
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
}
