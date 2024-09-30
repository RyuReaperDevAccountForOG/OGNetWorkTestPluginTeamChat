# OGNetwork Test Plugin

## Overview
This is a test plugin for developers working on the OGNetwork Minecraft server, built using the Spigot API. This plugin integrates with Redis to enable real-time communication across multiple servers.

## Prerequisites
Before building the plugin, ensure you have the following installed:

- **Java JDK 17** or higher
- **Apache Maven**
- **Redis** (for the Redis setup)
- **Git** (to clone the repository)

## Cloning the Repository
First, clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/OGNetWorkTestPlugin.git
cd OGNetWorkTestPlugin
```
Building the Plugin
Navigate to the Project Directory: Open a terminal and navigate to the directory where you cloned the project.

Install Dependencies: Run the following command to install the required dependencies:
```
mvn clean install
```
This command compiles the plugin and downloads any dependencies defined in the pom.xml file.
Locate the Plugin JAR: After a successful build, the compiled JAR file will be located in the target directory.
Setting Up Redis
Install Redis: If you don't have Redis installed, you can follow the installation guide from the official Redis website.

Start Redis Server: Once installed, start your Redis server. Typically, you can do this by running:
```
redish-server
```
Configure Your Plugin: Before using the plugin, ensure that your Redis configuration matches your server setup. You may need to specify the Redis host and port in the plugin's configuration files.
Running the Plugin
Copy the JAR File: Move the generated JAR file from the target directory to your Minecraft server's plugins folder.

Start Your Minecraft Server: Launch your Minecraft server. The plugin should load automatically if placed correctly in the plugins folder.

Check for Errors: Monitor the console for any errors or logs that indicate whether the plugin has started correctly.
Troubleshooting
If the plugin fails to load, ensure that all dependencies are correctly installed and configured.
Check your Redis server status. Make sure it's running and accessible.
Review the server logs for any error messages related to the plugin.

```
MAKE SURE YOU CONFIGURE YOUR REDISH IN THE config.yml
Best Regards 
-  Ryu Reaper
```
