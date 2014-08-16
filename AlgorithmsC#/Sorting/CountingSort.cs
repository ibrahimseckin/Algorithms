using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class CountingSort
    {
        public static void countingSort(List<int> data)
        {
            int max = data.Max();
            int[] arry = new int[max+1];
            List<int> output = new List<int>();

            for (int i=0; i< arry.Length;i++)
                arry[i] = 0;

            foreach (int s in data)
                arry[s]++;


            data.Clear();

            for (int i = 0; i < arry.Length; i++)
            {
                if (arry[i] > 0)
                {
                    for (int j = 0; j < arry[i]; j++)
                        data.Add(i);
                }
            }
        }

        


    }
}
