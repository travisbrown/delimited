resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.jsuereth"       % "sbt-pgp"       % "1.0.0")
addSbtPlugin("com.github.gseitz"  % "sbt-release"   % "1.0.0")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"  % "0.5.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"       % "0.2.6")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"      % "1.0.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-ghpages"   % "0.5.4")
addSbtPlugin("org.scoverage"      % "sbt-scoverage" % "1.1.0")
addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"    % "0.3.3")
