package xbony2.forgegroove

import java.lang.reflect.Field
import java.lang.reflect.Method

import net.minecraftforge.fml.common.FMLModContainer
import net.minecraftforge.fml.common.ILanguageAdapter
import net.minecraftforge.fml.common.ModContainer
import net.minecraftforge.fml.relauncher.Side

/**
 * This might work.
 * 
 * @author xbony2
 *
 */
class GroovyAdapter implements ILanguageAdapter {

	@Override
	Object getNewInstance(FMLModContainer container, Class<?> objectClass, ClassLoader classLoader, Method factoryMarkedMethod) throws Exception {
		factoryMarkedMethod != null ? factoryMarkedMethod.invoke(null) : objectClass.newInstance()
	}

	@Override
	boolean supportsStatics(){ true } //Why not

	@Override
	void setProxy(Field target, Class<?> proxyTarget, Object proxy) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		target.set null, proxy
	}

	@Override
	void setInternalProxies(ModContainer mod, Side side, ClassLoader loader){
		// There's not "objects" or something like in Scala so not gonna do anything.
	}
}
