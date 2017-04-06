Anbei findest du den Code für eine kleine Fruchtliste. Diese ist nach dem Model-View-Controller-Pattern aufgebaut
Zudem verwendet sie beim Model das sog. Singleton-Pattern.
Hinweis: Diese Applikation lässt sich in BlueJ nicht starten. Verwende eine andere IDE, wie IntelliJ oder Netbeans.

# Aufgabe 1
Informiere dich im Internet über das Singleton und das MVC-Pattern.
Notiere dir die wichtigsten Vorteile und Einsatzzwecke der Patterns.

# Aufgabe 2
Ein großer Vorteil, auf den du bei deinen Recherchen zu MVC sicher gestoßen bist, ist die einfache
Austauschbarkeit der einzelnen Bestandteile (insbesondere Model und View). So kann auf Änderungen schnell reagiert werden.
Dir ist sicher aufgefallen, dass die Implementierung des Models über ein Array recht aufwändig ist (wenn nicht, suche den Grund).
Ändere die Implementierung des Models so ab, dass es eine Liste und kein Array mehr verwendet.
Hinweis: Die in diesem Beispiel verwendete MVC-Implementierung besitzt keine direkten Verknüpfungen zwischen dem Model und dem
View. Es läuft alles über den Controller.

# Aufgabe 3
Bis jetzt war es notwendig, wenn Änderungen am Model erfolgten, den Controller manuell anzuweisen, den View zu aktualisieren.
Diese Taktik ist natürlich fehleranfällig (der Zustand des Models könnte inkonsistent zur Anzeige sein) und umständlich.
Unter anderem für solche Fälle wurde das Observer/Observeable-Pattern erfunden. Informiere dich darüber im Internet
und implementiere den Controller als Observer und das Model als Observable, so das Änderungen am Model automatisch
vom Controller an den View weiter gereicht werden. Wenn du den Code ansiehst, wirst du erkennen, dass für diese Aufgabe
bereits einige Vorbereitungen getroffen wurden.
