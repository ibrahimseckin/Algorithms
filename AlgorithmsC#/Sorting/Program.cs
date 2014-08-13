using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> asd = new List<int>();
            Random rd = new Random();
            for (int i = 0; i < 10000; i++)
            {
                int a = rd.Next(0, 1000000); 
                asd.Add(a);
            }
                //InsertionSort.insertionSort(asd);
            int[] adf = asd.ToArray();
            InsertionSort.insertionSort(adf);
        }
    
    }

}
