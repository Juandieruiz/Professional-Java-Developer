# Manejo de Errores 

## Throwable
- La clase Padre de todos los tipos de errores.

- En Java tenemos dos tipos de problemas:
    - Excepciones (Exception) -checked exception-
    - Errores (Error) -unchecked exception-

## Error 

Este tipo de errores no se pueden controlar, por lo que se lanzan directamente.

- ExceptionIninitializerError
- StackOverflowError
- OutOfMemoryError

## Exception

En estas excepciones existen dos mundos, checked y unchecked.

### Checked Exception

Son problemas o expeciones donde tenemos que controlar el error.

- IOSException
  - FileNotFoundException : El archivo que estas tratando de abrir no existe.
  - FileSystemException

Errores como estos, desde el momento en el que invocas el metodo tenemos que definir el codigo para manejar el error y repsonsabilizarnos.

### Unchecked Exception

Son excepciones que no todas se pueden manejar, por lo que se lanzan directamente.

- NullPointerException
- IllegalArgumentException
- IlegalStateException
- SecurityException

Son errores donde si invocamos un metodo y ocurre una excepcion, el programa se cerrara.

> Documentación adjunta en la hoja de referencias (color-page:blue) in issues.

En los errores anteriores vistos se muestran algunas de las clases más importantes al momento de manejar errores:

- Thowable : Es la clase padre de todos los problemas que encontraremos al desarrollar aplicaciones en Java.
- Error : Se utiliza para representar situaciones inusuales de las que las aplicaciones no se puedan recuperar.
- Exception : Son errorres en tiempo de ejecucion de nuestros programas y se pueden clasificar de acuerdo a lo siguientes:
- ExceptionIninitializerError : Se produce cuando se produce un error en el inicializador de la clase.
  - Checked : Son excepciones que el compilador requiere que manejemos, las utilizamos cuando quien llama a nuestro metodo se puede recuperar de esta situacion.
  - Unchecked : Son excepciones que el compilador no requiere que manejemos, todas las excepciones que hereden de RuntimeException 
serán consideradas como unchecked. Las utilizaremos para representar problemas que resultan de errores de programación