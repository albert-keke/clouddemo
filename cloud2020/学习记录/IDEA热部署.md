1. adding devtlools to your project

   ```xml
   <!--热部署-->
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-devtools</artifactId>
               <scope>runtime</scope>
               <optional>true</optional>
           </dependency>
   ```

   

2. adding plugin to your pom.xml

   ```xml
   			<plugin>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-maven-plugin</artifactId>
                   <configuration>
                       <fork>true</fork>
                       <addResources>true</addResources>
                   </configuration>
               </plugin>
   ```

   

3. enabling automatic bulid

   ![1591457125394](H:\gitd\clouddemo\cloud2020\image\1591457125394.png)

4. update the value of

   快捷键 ctrl + shift + alt + /  选择 registry

   ![1591457312077](H:\gitd\clouddemo\cloud2020\image\1591457312077.png)