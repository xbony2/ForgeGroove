# ForgeGroove
Groovy for Forge? Because let's be honest, screw Kotlin. Any language that uses the word "fun" as a keyword isn't worth using, no way José.

## Does this even work?
I mean, I dunno.

## How can I use this?
Not really sure to be honest, I haven't really released and tested it, but probably something like this.

```groovy
buildscript {
	repositories {
	mavenCentral() //You gonna want this
	//...
	}
}

apply plugin: 'groovy'
//...

dependencies {
	compiles files("libs/forgegroove-1.0.0a.jar") //Yeah hokay homie, I don't have a maven, I don't know how to use maven, I don't even know how to spell maven. In theory CurseForge has an automatic maven or somethin' but not even Jesus can help you figure out how to use that. Just download the damn file or something. Not like this is experimental anyway.
}

//...
```
