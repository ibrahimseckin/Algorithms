using System;
using System.Collections.Generic;

namespace Sorting
{
    class InsertionSort
    {
        static public void insertionSort<T>(List<T> data)
        {
            for (int i = 1; i < data.Count;i++)
            {
                T tmp = data[i];
                for (int j = i-1; j >= 0; j--)
                {
                    if (Comparer<T>.Default.Compare(tmp, data[j]) < 0)
                    {
                        data[j+1] = data[j];
                        data[j] = tmp;
                    }
                }
            }
        }

        static public void insertionSort<T>(T[] data)
        {
            for (int i = 1; i < data.Length; i++)
            {
                T tmp = data[i];
                for (int j = i - 1; j >= 0; j--)
                {
                    if (Comparer<T>.Default.Compare(tmp, data[j]) < 0)
                    {
                        data[j + 1] = data[j];
                        data[j] = tmp;
                    }
                }
            }
        }


    }
}
