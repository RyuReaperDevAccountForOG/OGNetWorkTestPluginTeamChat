## Team Chat Plugin

### Overview
This plugin allows players to form teams and communicate via a custom chat channel across multiple Minecraft servers using Redis for real-time communication. The plugin is built using Java and Spigot, with Redis facilitating cross-server messaging. It also includes commands to manage teams (create, join, leave, list) and communicate efficiently in team chat.

> **Watermark:** Created and Maintained by **RyuReaper**

---

### Features:
- Team-based chat system.
- Cross-server chat communication via Redis.
- Simple team management (create, join, leave teams).
- Optimized for low-latency communication across high player volumes.
- Supports Minecraft 1.21.1 API.
- Configurable Redis Setup via ingame.

---

### Prerequisites

Before building and deploying this plugin, ensure the following software is installed on your machine:

- **Java Development Kit (JDK) 17+** – Required to compile the plugin.
- **Apache Maven** – To handle dependencies and build the plugin.
- **Spigot 1.21.1** – Minecraft server API for plugin development.
- **Redis** – To handle real-time inter-server communication.
- **Git** – For source control.

---

### Installation

#### 1. Clone the Repository

First, clone this repository to your local environment:
```bash
git clone https://github.com/RyuReaperDevAccountForOG/OGNetWorkTestPluginTeamChat.git
cd OGNetWorkTestPluginTeamChat
```

#### 2. Build the Plugin

To compile and build the plugin JAR file, run Maven:
```bash
mvn clean package
```
This command compiles the source code, resolves dependencies, and packages the plugin into `target/TeamChatPlugin.jar`.

#### 3. Set Up Redis

Ensure Redis is installed and running on your server(s). Configure Redis connection details in `config.yml`.

#### 4. Deploy the Plugin

Copy `target/TeamChatPlugin.jar` to your Spigot server's `plugins/` directory.

#### 5. Start Your Minecraft Server

Start or restart your Minecraft server to load the plugin.

---

### Configuration

#### `config.yml`

```yaml
/redish <host> <port> <pass>
```

---

### Commands

- `/team create <name>` - Create a new team.
- `/team join <name>` - Join an existing team.
- `/team leave` - Leave your current team.
- `/team list` - List all teams.
- `/redis <host> <port> <pass>` - Configure Redis server

---

### GitHub Actions

This repository includes GitHub Actions (`build.yml`) for automated testing and building on push and pull request events.

---

### Issues and Support

For issues and support, please open an issue on [GitHub Issues](https://github.com/RyuReaperDevAccountForOG/OGNetWorkTestPluginTeamChat/issues).

---

### License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---
