#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]) {
  char *str_param = argv[1];
  char *sep = argv[2];
  char *str;

  if (argc < 3) {
    printf ("Correct usage: %s string separator\n", argv[0]);
    exit(EXIT_FAILURE);
  }

  for (str = strtok(str_param, sep); str; str = strtok(NULL, sep)) {
    printf("%s\n", str);
  }

  return EXIT_SUCCESS;
}
