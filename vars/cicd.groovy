def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,contextpath)
{
  "scp /home/ubuntu/.jenkins/workspace/Declerativepipelinewithsharedlibrary/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
def runselenium(path)
{
  sh "java -jar $path/testing.jar"
}
