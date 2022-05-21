#Author: afoc
Feature: Iniciar sesion Guru
  Yo como usuario
  Necesito iniciar sesion en Guru
  Para validar login

  Scenario Outline: Iniciar sesion de forma exitosa
    Given "Afoc" desea ir a la pagina de <url>
    When Ingresa nombre de usuario <user> y password <password>
    Then Valida que el titulo sea <msg>

    Examples:
      | url                          | user     | password | msg                  |
      | "http://demo.guru99.com/v4/" | "mgr123" | "mgr!23" | "Manger Id : mgr123" |