def call(){
 deploy adapters: 
  [tomcat9(credentialsId: 'tomcat',
   path: '',
   url: 'http://192.168.29.127:9090/')],
   contextPath: '/usr/share/tomcat/webapps',
   onFailure: false,
   war: '**/target/*.war' 

}