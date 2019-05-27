#!C:\devops\Groovy-3.0.0\bin groovy
// vars/dumpXampp
def call(String user,String pass = null ,String host, String port, String dbname, String dumpDir) {
  echo "cd /c/xampp/mysql/bin && ./mysqldump --user=${user} --password=${pass}
  --host=${host} --protocol=tcp --port=${port} --default-character-set=utf8 '${dbname}' > '${dumpDir}'"
}
