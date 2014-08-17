using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class BubbleSort
    {

        public static void bubbleSort<T>(List<T> data)
        {
            for (int i = 0; i < data.Count; i++)
            {
                for (int j = 0; j < data.Count - 1; j++)
                {
                    if (Comparer<T>.Default.Compare(data[j],data[j + 1]) > 0 ) //if less indexed number is bigger than the number at right it swaps.
                        Utility.Swap(data, j, j + 1);
                }
            }
        }

        //bubble sort for array.
        public static void bubbleSort<T>(T [] data)
        {
            for (int i = 0; i < data.Length; i++)
            {
                for (int j = 0; j < data.Length - 1; j++)
                {
                    if (Comparer<T>.Default.Compare(data[j], data[j + 1]) > 0) //if less indexed number is bigger than the number at right it swaps.
                        Utility.Swap(data, j, j + 1);
                }
            }
        }

    }
}
