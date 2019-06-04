@tag
Feature: Aanvraag maken voor GrofVuilOphaal

  @tag1
  Scenario Outline: Burger heer dient aanvraag in voor grofvuilophaal
    Given gebruiker opent de website amstelveen.nl
    Then gebruiker klikt op icoon Afval en grofvuil
    Then gebruiker klikt op knop Afspraak maken grofvuil ophalen
    Then gebruiker klikt op knop Regelen zonder inloggen
    Then gebruiker kiest Aanhef dhr bij Aanhef
    Then gebruiker vult "<Voorletters>"  in veld Voorletters
    Then gebruiker vult "<Voorvoegsels>" in veld Voorvoegsel
    Then gebruiker vult "<Achternaam>" in veld Achternaam
    Then gebruiker vult "<email>" in veld Email
    Then gebruiker vult "<Telefoon>" in veld Telefoon
    Then gebruiker vult in straat
    Then gebruiker vult in nummer
    # Then gebruiker vult in Postcode
    # Then gebruiker vult in Plaats
    Then gebruiker vult in Eventuele "<beschrijving>" van de locatie
    Then gebruiker kiest voor bij Uw meldingSoort afvalHuishoudelijk Brandbaar
    Then gebruiker kiest bij Huishoudelijk Brandbaar voor Papier & karton
    Then gebruiker selecteert in dropdownListKeuze ophaaldatum voor een datum
    Then gebruiker selecteert in dropdownList'Omvang in kubieke voor een meter
    # Then gebruiker vult in Test bij veld Toelichting melding
    Then gebruiker vinkt bij Heeft u een Amstelveenpas? voor Nee
    Then gebruiker vinkt bij Mogen wij u informeren over deze zaak? voor Nee
    Then gebruiker vinkt aan bij ondertekening
    Then gebruiker klikt op knop Indienen
    Then browser suit af.

    Examples: 
      | Voorletters | Voorvoegsels | Achternaam | email                 | Telefoon | beschrijving   | meter | Toelichting     |
      | T           | Van der      | Tester01   | testet@amstelveen.com | 01234568 | Test voor 2.13 |     1 | UpgradeTest2.13 |
    #  | E           | der          | Tester02   | testee@amstelveen.com | 01334468 | Test voor 2.13 |     4 | UpgradeTest2.13 |
     # | S           | ter          | Tester03   | testes@amstelveen.com | 01435568 | Test voor 2.13 |     3 | UpgradeTest2.13 |
     # | T           | de           | Tester04   | testet@amstelveen.com | 01435448 | Test voor 2.13 |     2 | UpgradeTest2.13 |

 