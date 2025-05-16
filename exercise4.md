# Übung 5 – Konfigurationsmanagement

### Vorteile von Unit-Tests
Unit Tests sind ein Kernbestandteil für die moderne Softwareentwicklung & bringen einige Vorteile mit sich.

1. Frühzeitig Fehler finden
Unit Tests prüfen einzelne Methoden isoliert. Man erkennt dadurch den Fehler sofort beim Entwickeln undn icht erst beim Zusammensetzen des Programms.

2. Änderungen sicher durchführen
Man kann den Code ändern und hat die Sicherheit, dass der Code noch korrekt funktioniert, wenn alle Tests weiter grün sind.

3. Verhalten dokumentieren
Wenn Unit Tests gut geschrieben sind, dann zeigen sie, wie eine Methode gedacht ist. Zudem sehen andere Entwickler direkt, was ein Methodenaufruf mit bestimmten Eingaben tun soll.

4. Automatisierung von Qualitätssicherung
Man kann Unit Tests automatisch bei jedem Build oder Push laufen lassen. So wird vermieden, dass neue Fehler unbemerkt ins Programm kommen.
conflict


5. Modularisierung wird gefördert
Um etwas testbar zu machen, muss Code oft gut strukturiert, klein und unabhängig sein - dies verbessert automatisch die Codequalität.

6. Schnelle Rückmeldung
Im Gegensatz zum manuellem Testen oder Integrationstests laufen Unit Tests in Millisekunden.

### Überprüfte Testfälle
In meiner Test-Class werden zunächst Standardfälle, also Normalfälle, für jede Methode überprüft mit dem Ziel, dass die Methoden auch unter gewöhnlichen Bedingungen korrekt funktionieren.

Weiters wurden auch Randfälle bzw. Sonderfälle überprüft, wie zum Beispiel eine Division durch Null, um zu sehen, ob der Code auch in Ausnahmesituationen korrekt reagiert.

Ebenso wurde auf Fehlerfälle, also ungültige Eingaben, überprüft, um sicherzustellen, dass der Code nicht abstürzt, sondern kontrolliert auf Fehler reagiert.

Auch die Mischung verschiedener Eingaben wurde getestet, um zu prüfen, dass die Rechenlogik auch bei negativen oder gemischten Zahlen korrekt arbeitet.
