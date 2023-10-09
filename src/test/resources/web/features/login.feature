@account
Feature: Como usuario deseo poder probar el login

  Background: El usuario ingresa a la pagina practice automationtesting
    Given el usuario se encuentra en la pagina

  @login
  Scenario Outline: Login exitoso a la cuenta
    When el usuario hace click en MyAccount
    And el usuario ingresa <mail> y <contrasenia> validos
    And el usuario hace click en Login
    Then valida que esta con su <usuario>
    Examples:
      | mail              | contrasenia  | usuario |
      | xnahuex@gmail.com | ASDasd123!$% | xnahuex |

  @lostPassword
  Scenario Outline: Login fallido por contraseña incorrecta
    When el usuario hace click en MyAccount
    And el usuario ingresa <mail> o <contrasenia> incorrectos
    And el usuario hace click en Login
    Then valida que <aviso> aparezca
    Examples:
      | mail              | contrasenia | aviso               |
      | xnahuex@gmail.com | 123123      | Lost your password? |