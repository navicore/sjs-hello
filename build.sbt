name := "Sjshello"
enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

version := "1.0"

scalaVersion := "2.12.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
libraryDependencies ++=
  Seq(

    "org.akka-js" %%% "akkajsactor" % "1.2.5.12",
    "org.akka-js" %%% "akkajsactorstream" % "1.2.5.12",

    "org.akka-js" %%% "akkajstestkit" % "1.2.5.12" % "test",
    "org.akka-js" %%% "akkajsstreamtestkit" % "1.2.5.12" % "test"

  )


