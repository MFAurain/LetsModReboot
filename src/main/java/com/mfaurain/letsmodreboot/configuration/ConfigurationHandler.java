package com.mfaurain.letsmodreboot.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        ///create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            ///Load the configuration file

            configuration.load();

            ///Read in Properties from configuration file

            configValue = configuration.get("forgecraft", "configValue", true, "This is an Example config Value").getBoolean(true);
        }
        catch (Exception e)
        {
            ///Log the Exception
        }
        finally
        {
            ///Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);

    }
}
