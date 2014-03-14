import java.io.File
import play.Project._

name := "j"

version := "1.0-SNAPSHOT"

resolvers += Resolver.file("LocalIvy", file(Path.userHome + File.separator + ".ivy2" + File.separator + "local"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  "com.typesafe" %% "play-plugins-mailer" % "2.2.2"
)

play.Project.playJavaSettings