lazy val root = project.in(file(".")).enablePlugins(SbtIdeaPlugin)

ideaBuild in ThisBuild := "142-EAP-SNAPSHOT"

ideaExternalPlugins +=
  IdeaPlugin.Zip("scala-plugin", url("http://plugins.jetbrains.com/files/1347/20124/scala-intellij-bin-1.6.0.zip"))
