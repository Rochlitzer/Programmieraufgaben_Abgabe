library(MASS) # Krabbendaten
library(rpart)
library(lattice)
library(ggplot2)
library(caret)
install.packages("caret")
install.packages("e1071")

#a)

t1 <- rpart(sex ~., data=crabs) class(t1)
plot(t1, margin=0.2, uniform=TRUE)
text(t1,use.n=TRUE)

table(predict(t1,type="class"),crabs$sex)
require(caret)


table(crabs$sex)

b)
#Die Weibchen sind durch schwarze/ Männchen rot
plot(crabs$RW, crabs$CL,pch=19,col=crabs$sex)
legend("bottomright", legend = c("Männlich", "Weiblich"), fill = c(2,1))

c)
str(crabs)


# Berechnung der Hauptkomponenten
pca <- prcomp(crabs[,4:8]) 
summary(pca)

plot(pca$x[,1],pca$x[,2],pch=19,col=crabs$sex)


d)
dim(crabs)
crabs2 <- cbind(crabs,pca$x) 
dim(crabs2)
names(crabs2)

t2 = rpart(sex ~ .,data=crabs2) 
t2
plot(t2,margin=0.2, uniform=TRUE) 
text(t2)
confusionMatrix(predict(t2,type="class"), as.factor(crabs2$sex))


t3 <- rpart(sex ~ PC1+PC2+PC3+PC4+PC5,data=crabs2)
plot(t3, margin=0.2, uniform=TRUE) text(t3,use.n=TRUE)

plot(pca$x[,2],pca$x[,3],pch=19,col=crabs$sex)
abline(v=0.02025)

table(predict(t3,type="class"),crabs$sex)

confusionMatrix(predict(t2,type="class"),crabs$sex)


