# Getting Helloworld setup on wsl2

Open the WSL2 ubuntu distro terminal.

## 1. Setting up Java on distro
Let us first setup java on the distro

### 1.1 Install JRE

```bash
sudo apt install default-jre -y
```

### 1.2 Install JDK

```bash
sudo apt install default-jdk -y
```


## 2. Running Helloworld
Lets now get our Helloworld program running on our distro 

### 2.1 Change the directory
To access our local machine directory **from** our `ubuntu distro` we need to change the directory
```bash
 cd /mnt/e/jedox
```

### 2.2 Compile Helloworld.java

```bash
javac helloworld/HelloWorld.java
```
Once compiled you will be able to see .class and .java files in `helloworld` directory

### 2.3 Run Helloworld.java

```bash
java helloworld/HelloWorld
```
You will be able to see **Helloworld** as output

