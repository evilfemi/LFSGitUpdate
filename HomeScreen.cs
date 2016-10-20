
using System;
using System.IO;

namespace FileIOApplication
{
   class Program
   {
      static void Main(string[] args)
      {
         FileStream F = new FileStream("test.dat", FileMode.OpenOrCreate, FileAccess.ReadWrite);
         for (int i = 1; i <= 20; i++)
         {
            F.WriteByte((byte)i);
         }

         //This forked version is tracking origin/master
         
         F.Position = 0;
         for (int i = 0; i <= 20; i++)
         {
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
                Console.WriteLine('This line is used to test');
                ///This is another line of comment
                ///Console.WriteLine('This line is used to test')
            Console.Write(F.ReadByte() + " ");
         }
         F.Close();
         Console.ReadKey();
      }
   }
}