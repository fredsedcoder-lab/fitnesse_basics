### Java 25 project to make training with fitnesse

to run fitnesse wiki on port 9123 with test pages located in `src/test/fitnesse`:
```bash
java -cp "fitnesse-standalone.jar;target/classes;target/test-classes" fitnesseMain.FitNesseMain -p 9123 -d src/test/fitnesse
```
