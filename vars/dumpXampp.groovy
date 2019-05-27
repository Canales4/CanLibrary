#!C:\devops\Groovy-3.0.0\bin groovy
// vars/dumpXampp
def call(String user, String host, String port, String dbname, String dumpDir, String pass = null) {
  if(pass = null){
    sh "cd /c/xampp/mysql/bin && ./mysqldump --user=${user} --host=${host} --protocol=tcp --port=${port} --default-character-set=utf8 ${dbname} > ${dumpDir}"
  }else{
    sh "cd /c/xampp/mysql/bin && ./mysqldump --user=${user} --password=${pass} --host=${host} --protocol=tcp --port=${port} --default-character-set=utf8 ${dbname} > ${dumpDir}"
  }
}
