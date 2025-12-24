# LabysCoolfunctions

A feature-rich Minecraft 1.21.4 Fabric mod that enhances gameplay with cool and useful functions.

## Features

- **Custom Functions**: Extended functionality for command blocks and datapacks
- **Quality of Life Improvements**: Streamlined gameplay experience
- **Performance Optimizations**: Efficient code for smooth operation
- **Compatibility**: Works seamlessly with other Fabric mods
- **Customization Options**: Configurable settings to tailor your experience
- **Enhanced Commands**: Additional commands for better world manipulation

## Installation Guide

### Prerequisites

- **Java**: Java 21 or higher (required for Minecraft 1.21.4)
- **Fabric Loader**: Version 0.15.0 or higher
- **Minecraft**: Version 1.21.4

### Step-by-Step Installation

#### 1. Install Fabric Loader

1. Download the Fabric Installer from [fabricmc.net](https://fabricmc.net/)
2. Run the installer (select "Install client" for single-player)
3. Choose Minecraft version **1.21.4**
4. Complete the installation and close the installer

#### 2. Locate Your Mods Folder

- **Windows**: Navigate to `%APPDATA%\.minecraft\mods\`
- **Alternative**: Open Minecraft launcher → Installations → Edit → Open Folder → `mods` folder

#### 3. Install the Mod

1. Download the latest `labyscoolfunctions` JAR file
2. Copy the JAR file to your `mods` folder
3. Ensure the file is placed directly in the `mods` directory (not in a subfolder)

#### 4. Launch Minecraft

1. Open the Minecraft launcher
2. Select the **Fabric 1.21.4** profile from the version dropdown
3. Click Play
4. The mod will load automatically

### Verifying Installation

Once in-game:
1. Open the mods list (usually accessible from the main menu)
2. Search for "LabysCoolfunctions"
3. Verify that the mod appears in the list with a green checkmark

## Build Instructions (Windows 7-11)

### Prerequisites

- **Git**: Download from [git-scm.com](https://git-scm.com/download/win)
- **JDK 21+**: Download from [oracle.com](https://www.oracle.com/java/technologies/downloads/) or use [adoptium.net](https://adoptium.net/)
- **Gradle**: Usually included with the project (no separate installation needed)

### Building from Source

#### 1. Clone the Repository

```bash
git clone https://github.com/kanadianaz4-source/labyscoolfunctions.git
cd labyscoolfunctions
```

#### 2. Set Up Your Environment (Windows)

1. Right-click on the cloned folder and select "Open PowerShell window here"
2. Verify your Java installation:
   ```powershell
   java -version
   ```
   You should see Java 21 or higher

#### 3. Prepare the Build

```powershell
# Generate Fabric development environment
./gradlew genSources
```

#### 4. Build the Mod

```powershell
# Compile and build the JAR file
./gradlew build
```

The built JAR file will be located at:
```
build\libs\labyscoolfunctions-<version>.jar
```

#### 5. (Optional) Set Up Development Environment

**For IntelliJ IDEA:**

```powershell
./gradlew idea
```

Then open the project in IntelliJ IDEA.

**For Eclipse:**

```powershell
./gradlew eclipse
```

Then open the project in Eclipse.

#### 6. (Optional) Build and Run in Development

```powershell
# This will start a dev client with your mod loaded
./gradlew runClient
```

### Build Troubleshooting

| Issue | Solution |
|-------|----------|
| `gradlew command not found` | Ensure you're in the correct directory and use `.\gradlew` on PowerShell |
| Java version mismatch | Set `JAVA_HOME` environment variable or use the full path to JDK 21 |
| Gradle permission denied | Run PowerShell as Administrator |
| Build fails with dependency errors | Delete `.gradle` folder and run `./gradlew clean build` |

## Troubleshooting

### Game Won't Launch

**Problem**: Game crashes when launching with the mod installed

**Solutions**:
1. Verify you're using **Minecraft 1.21.4**
2. Ensure the mod JAR is in the correct `mods` folder
3. Delete the `mods` folder and reinstall the mod
4. Check game logs: `%APPDATA%\.minecraft\logs\latest.log`
5. Make sure you're using Fabric Loader version 0.15.0 or higher

### "Mod Incompatibility" Error

**Problem**: Error message about mod incompatibilities

**Solutions**:
1. Ensure no conflicting mods are installed
2. Remove mods one by one to identify the culprit
3. Check mod dependencies are all installed
4. Update all mods to their latest versions

### Missing Fabric API

**Problem**: Game crashes with "missing fabric-api" error

**Solutions**:
1. Download Fabric API from [modrinth.com](https://modrinth.com/mod/fabric-api)
2. Place `fabric-api` JAR in your `mods` folder
3. Ensure it's version 1.21.4 or later
4. Restart the game

### Performance Issues

**Problem**: Game lags or runs slowly with the mod installed

**Solutions**:
1. Lower your render distance and particle settings
2. Allocate more RAM to Minecraft (typically 4GB minimum)
3. Disable unnecessary mods if you have many installed
4. Update your GPU drivers
5. Remove any conflicting mods that affect rendering

### Crash Log Analysis

To diagnose issues:

1. Locate the crash report: `%APPDATA%\.minecraft\crash-reports\`
2. Open the latest crash report file
3. Look for the first error message and stack trace
4. Search for the error online or in the mod's issue tracker

### Commands Not Working

**Problem**: Mod functions/commands aren't responding

**Solutions**:
1. Verify the mod is loaded (check mod list in-game)
2. Ensure you have appropriate permissions
3. Check that datapacks are enabled if using custom functions
4. Reload the world or restart the game

### Still Having Issues?

If problems persist:

1. **Check the Issues Page**: Visit [github.com/kanadianaz4-source/labyscoolfunctions/issues](https://github.com/kanadianaz4-source/labyscoolfunctions/issues)
2. **Report a Bug**: Create a new issue with:
   - Your Windows version (7/8/10/11)
   - Java version
   - Minecraft and Fabric Loader versions
   - Crash logs (if applicable)
   - Step-by-step reproduction instructions
3. **Join Community Servers**: Get help from the Fabric community on Discord

## Requirements Summary

| Component | Version |
|-----------|---------|
| Minecraft | 1.21.4 |
| Fabric Loader | 0.15.0+ |
| Java | 21+ |
| Windows | 7, 8, 8.1, 10, 11 |

## Additional Resources

- [Fabric Documentation](https://fabricmc.net/wiki/)
- [Minecraft 1.21.4 Release Notes](https://minecraft.net/en-us/article/minecraft-java-edition-1.21.4)
- [Java Development Kit Downloads](https://www.oracle.com/java/technologies/downloads/)

## License

This project is provided as-is. See LICENSE file for details (if applicable).

## Contributing

Contributions are welcome! Please feel free to:
- Submit bug reports
- Suggest new features
- Create pull requests with improvements

---

**Last Updated**: December 24, 2025
