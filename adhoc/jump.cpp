#include <stdio.h>
#include <stdlib.h>
#include <setjmp.h>

// try catch in C

void jmpfunction(jmp_buf env_buf);

int main()
{
   int val;
   jmp_buf env_buffer;

   /* save calling environment for longjmp */
   val = setjmp( env_buffer );

   if( val != 0 )
   {
      printf("Returned from a longjmp() with value = %d\n", val);
      exit(0);
   }
   printf("Jump function call\n");
   jmpfunction( env_buffer );

   return(0);
}

void jmpfunction(jmp_buf env_buf)
{
   longjmp(env_buf, 42);
}
