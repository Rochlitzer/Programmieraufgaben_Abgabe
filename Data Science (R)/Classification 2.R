library(lattice)
library(ggplot2)
library(caret)
library(rpart)
install.packages("caret")
install.packages("e1071")

#Aufgabe 2

a)
#Dateipfad eingeben leider habe ich keine Churn Datensatz mehr 
churn <- read.table("/Users/Rochi/Library/Containers/com.apple.mail/Data/Library/Mail Downloads/99AAB9D6-1E67-46FF-A3F9-C6B9FB647B55/ÜbungenDataScience/Churn.rdat"), sep="", header = TRUE)
datenset = churn

training = datenset[1:2667,]#80% der Daten zum trainieren
test = datenset[2668:3333,]#20% der Daten zum testen

#DecisionTree
library(rpart)

dtraining = rpart(as.factor(Churn) ~.,training)
plot(dtraining,margin=0.2, uniform=TRUE)
text(dtraining, use.n = TRUE)

dtest = rpart(as.factor(Churn) ~.,test)
plot(dtest,margin=0.2, uniform=TRUE)
text(dtest, use.n = TRUE)

auswertung = predict(dtraining,Churn,type = 'class')
mean (auswertung == Churn$Churn)

#RandomForest
library(randomForest)
install.packages("randomForest")

fit = randomForest(as.factor(Churn) ~.,training)
resultClass = predict(fit,Churn,type = 'class')
resultProb = predict(fit,Churn,type = 'prob')

mean(resultClass == Churn$Churn)
mean(resultProb == Churn$Churn)

#ConfusionMatrix
confusionMatrix(resultClass,Churn$Churn)