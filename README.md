# ForgeGroove
Currently I would consider this to be experiment, but uh, Groovy for Forge. With this, you can easily make Minecraft mods using Groovy instead of Java (or another JVM language).

## Why use Groovy over Java? (or over Scala or Kotlin?)
Groovy is a lot like Java; in fact, most Java code would work just the same in Groovy, although it would be unGroovy-like. However, Groovy is simpler in many ways, and allows one to make more with less, with not much of a learning curve.

What about other JVM languages? One might like how Groovy is a bit closer in syntax than Scala and Kotlin ([see this page](http://groovy-lang.org/style-guide.html)) but it still allows for much simplification. Groovy's syntax might be less awkward in certain situations (*cough* Kotlin's naming with the `fun` keyword is dumb) and it has many nice things in its library.

## Does this even work? Examples?
Well, I think so. I'll be experimenting with it more later. No examples yet.

## How can I use this?
You should put this in your `builder.gradle`:

```groovy
buildscript {
	repositories {
	mavenCentral() //You gonna want this
	//...
	}
}

apply plugin: "groovy"
//...

dependencies {
	compile files("libs/forgegroove-1.0.0a.jar") //Yeah hokay homie, I don't have a maven, I don't know how to use maven, I don't even know how to spell maven. In theory CurseForge has an automatic maven or somethin' but not even Jesus can help you figure out how to use that. Just download the damn file or something. Not like this is experimental anyway.
	compile "org.codehaus.groovy:groovy-all:2.4.12" //Groovy is packed in Forge Groove but this is still required I believe.
}

//...
```

In your main class, you should include the following in your `@Mod` declaration:

```groovy
@Mod(modLanguageAdapter = "xbony2.forgegroove.GroovyAdapter")
```

Everything gradle-wise should be the same `/gradlew setupDecompWorkspace`, `/gradlew eclipse` (or whatever), `/gradlew build`, you can run all of that the same. IDE-wise, the [Eclipse Groovy Development Tools](https://github.com/groovy/groovy-eclipse) work very well for me, IntelliJ IDEA probably works fine, and you don't need to worry about messing with project stuff since Gradle will take care of that (at least for Eclipse, I would asssume so for IntelliJ IDEA as well). If you use a different IDE for modding, then good luck, you're on your own.

## Credits
This mod distributes Groovy (obviously), so huge credit to the hundreds of contributors behind [Apache Groovy](https://github.com/apache/groovy).

I looked at [Forgelin](https://github.com/shadowfacts/Forgelin) and Forge's [internal Java/Scala support](https://github.com/MinecraftForge/MinecraftForge/blob/1.12.x/src/main/java/net/minecraftforge/fml/common/ILanguageAdapter.java) in order to create this. You may notice that this project is remarkable similar in structure to those two. Thanks to the creators of those.


