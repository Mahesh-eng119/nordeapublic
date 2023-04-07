# NordeaProject
file conversion

# version
java-1.8
spring boot-2.7.11-SNAPSHOT

# dependency
JAXB -for the conversion of pojo to xml

# Running the jar
open the cmd the jar folder
# java -jar "jar file name" "input file path" "xml file path" "csv file path"


java -jar ./target/Text-Assessment-0.0.1-SNAPSHOT.jar ./src/main/resource/small.in ./src/main/resource/xmloutput.xml ./src/main/resource/csvoutput.csv

java -jar ./target/Text-Assessment-0.0.1-SNAPSHOT.jar ./src/main/resource/large.in ./src/main/resource/Lxmloutput.xml ./src/main/resource/Lcsvoutput.csv
