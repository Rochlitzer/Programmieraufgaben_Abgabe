library(ggplot2)

#a)
ggplot(iris, aes(x = Sepal.Length, y=Sepal.Width, col = Species)) + geom_point()

#b)
ggplot(iris, aes(x = Sepal.Length, y=Sepal.Width, col = Species, size=Petal.Width)) + geom_point()

#c)
ggplot(iris, aes(x = Species, fill=Species)) + geom_bar()

#c)
ggplot(data=iris,aes(x = Species,y = Sepal.Width)) + geom_boxplot(fill='pink')

#d)
ggplot(data=iris,aes(x = Sepal.Width, fill=Species)) + geom_density(alpha=0.3)

#e)
ggplot(data=iris,aes(x = Species,y = Sepal.Width,fill=Species)) + geom_violin() + geom_jitter()

#f)
ggplot(diamonds, aes(x = carat, y = price, colour=clarity)) +
  geom_point() +
  scale_x_continuous("Karat", breaks=c(3,4,5)) + facet_grid(color~cut)

#g)
dat <- read.csv(file.path("/Users/Rochi/Desktop/Programmier_Aufgaben_PR/Data Science (R)/Daten/EconomistData.csv")) 
label.these <- c("Germany", "Greece", "China","India", "Rwanda", "Spain", "France", "United States","Norway", "Singapore", "Switzerland")
pc1 <- ggplot(dat, aes(x = CPI, y = HDI, color = Region))
(pc1 <- pc1 + geom_point(shape = 1, size=2))

dd = dat[dat$Country %in% label.these , ]
pc2 <- pc1 
pc3 <- pc2 + geom_smooth(
    method = "gam",
    color = "red",
    formula = y~ 1+x+I(x*x), se = FALSE)
    pc4 <- pc3 + ggtitle("Koruption und Volktsirschaftliche entwicklung") 
    pc4 
