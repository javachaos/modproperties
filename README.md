# Mod Properties
## Quick Start

1. Example:

```java
   //Initialize the PropertyManager class.
   public static final PropertyManager PROPERTIES = new PropertyManager(MODID);
   
   @Override
   public void onInitialize() {
        //Look in MODID.properties file for property enable.xyz.biome if it does not exist default to true
        booleanValue = PROPERTIES.getBooleanProperty("enable.xyz.biome", true);
            
        //Look in MODID.properties file for property xyz.spawn.chance if the value does not exist default to 1000
        intValue = PROPERTIES.getIntegerProperty("xyz.spawn.chance", 1000);
   }
   
```
