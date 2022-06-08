# Setup a Maven Project on WSL2

Let us setup a Maven Project on WSL2 

## Install Maven 
`opt` as **reserved for the installation of add-on application software packages.**

```
cd /opt/
sudo wget https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.tar.gz

sudo tar -xf apache-maven-3.8.5-bin.tar.gz
sudo mv apache-maven-3.8.5/ apache-maven/
sudo update-alternatives --install /usr/bin/mvn maven /opt/apache-maven/bin/mvn 1001

```

## Add Environment Variables
- Add JAVAHOME and MAVEN as environment variables

```
sudo cp maven.sh /etc/profile.d/
sudo chmod +x /etc/profile.d/maven.sh
source /etc/profile.d/maven.sh
```