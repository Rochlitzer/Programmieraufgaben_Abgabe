library(cluster)
library(ggplot2)

#1)

#a)
X <- rbind(matrix(rnorm(20*50, mean = 0), nrow = 20),
           matrix(rnorm(20*50, mean=0.7), nrow = 20), 
           matrix(rnorm(20*50, mean=1.4), nrow = 20))

#b)
X.pca = prcomp(X)$x
plot(X.pca[,1:2], col=c(rep(1,20), rep(2,20), rep(3,20)))

#c)
res = kmeans(X, centers = 3)
true_class = c(rep(1,20), rep(2,20), rep(3,20)) 
table(res$cluster, true_class)

#d)
res = kmeans(X, centers = 2)
true = c(rep(1,20), rep(2,20), rep(3,20)) 
table(res$cluster, true_class)

#e)
res = kmeans(X, centers = 4)
true = c(rep(1,20), rep(2,20), rep(3,20))
table(res$cluster, true_class)

#f)
res = kmeans(X.pca[,1:2], centers = 3) 
true = c(rep(1,20), rep(2,20), rep(3,20)) 
table(res$cluster, true_class)

#g)
res = kmeans(scale(X), centers = 3)
true = c(rep(1,20), rep(2,20), rep(3,20))
table(res$cluster, true_class)

#h)
withss = rep(NA,20)
for (k in 1:length(withss)) {
withss[k] = sum(kmeans(X,k)$withinss) }
plot(withss)


2)
#Daten Model Laden: Datei pfad einsetzen

fil = file.path("Downloads/Daten-20180603/WineKMC.Rdata")
load(fil)

head(offers, n = 4)
head(transactions, n = 4)
dat_num[1:4, 1:5]

#c)
num_dat = dat_num[, 2:ncol(dat_num)] 
d=dist(num_dat)
res = cmdscale(d)
df = data.frame(res)
ggplot(data = df, aes(x = X1, y = X2)) +
  geom_point() +
  ggtitle("MDS")

# k-means mit 3 Clustern
set.seed(1)
cl3 <- kmeans(num_dat, 3)
df$cluster_k3 <- as.factor(cl3$cluster)

# k-means mit 5 Clustern
set.seed(1)
cl5 <- kmeans(num_dat, 5)
df$cluster_k5 <- as.factor(cl5$cluster)

# die verschiednenen Fomrmen ist die 5 Cluster lösung verschidene Farben sind als 3 Cluster lösung abgebildet
ggplot(data = df, aes(x = X1, y = X2, col = cluster_k3, shape = cluster_k5)) +
  geom_point() +
  ggtitle("MDS2")

# die 3 Clusterlösung schaut in diesem fall besser aus 

grpsKM3 = cl3$cluster
# Silhouette plot
plot(silhouette(grpsKM3, d))

# auch 3 Cluster sind nicht gerade vielverspächend

#c)
num_dat = dat_num[, 2:ncol(dat_num)] 
d=dist(num_dat)
c_res <- hclust(d, method = 'ward.D2') 
plot(c_res)

# nach der Herachischen Cluster analyse sind auch 3 cluster optimal

grps <- cutree(c_res, k = 3) table(grps)
plot(silhouette(grps, d))

#d)
sum(dat_num[, 2:ncol(dat_num)])
sum(dat_num[, 2:ncol(dat_num)] == 0)
dis <- daisy(as.matrix(dat_num[, 2:ncol(dat_num)]), type = list(asymm = 1:32))

c_res <- hclust(dis, method = 'ward.D2') 
plot(c_res)

#e)
grps <- cutree(c_res, k = 3)
table(grps)
plot(silhouette(grps, dis))

#f)
names(dat_num)
c3 <- dat_num[grps == 3, 2:ncol(dat_num)]
no_orders <- apply(c3, 2, sum)
sort(no_orders, decreasing = TRUE)

#Cluster 3 ist das homogenste und und Trinkt am liebsten Pinot Noir


#Zusatzaufgabe

#Kundensegmentierung

x <- rbind(matrix(rnorm(25*2,mean = 1, sd = 0.3),ncol = 2),
           matrix(rnorm(25*2,mean = 5, sd = 0.3),ncol = 2))

View(x)
hc.complete = hclust(dist(x), method = "complete")
par(mfrow = c(1,3))
plot(hc.complete, main = "Complete Linkage", xlab="", sub="",cex =.9 )

hc.single = hclust(dist(x), method = "single")
plot(hc.complete, main = "Single Linkage", xlab="", sub="",cex =.9 )


hc.average = hclust(dist(x), method = "average")
plot(hc.complete, main = "Average Linkage", xlab="", sub="",cex =.9 )
