using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class QuickSort
    {

        #region listVersion
        public static void quickSort<T>(List<T> data)
        {
            quickSort(data, 0, data.Count-1);
        }

        private static int divide<T>(List<T> list, int start, int end)
        {
            int i = start;
            int k = end;
            T pivot = list[((start + end) / 2)];

                while (k >= i)
                {
                    while (Comparer<T>.Default.Compare(list[i], pivot) < 0)
                        i++; //index of the first number that is greater from pivot in left part
                    while (Comparer<T>.Default.Compare(list[k], pivot) > 0)
                        k--;

                    if (i <= k)
                    {
                        swap(list, i, k);
                        i++; k--;
                    }
                }
                //swap(numList, start, k);
                return i;     

        }


        private static void quickSort<T>(List<T> numList, int start, int end)
        {
            int index = divide(numList, start, end);
            if (start < index - 1) quickSort(numList, start, index - 1);
            if (index < end)       quickSort(numList, index, end);
        }

        private static void swap<T>(List<T> numList, int first, int second)
        {

            T temp = numList[first];
            numList[first] = numList[second];
            numList[second] = temp;
        }
           
        #endregion 


    #region arrayVersion

          public static void quickSort<T>(T[] data)
        {
            quickSort(data, 0, data.Length-1);
        }

        private static int divide<T>(T [] list, int start, int end)
        {
            int i = start;
            int k = end;
            T pivot = list[((start + end) / 2)];

                while (k >= i)
                {
                    while (Comparer<T>.Default.Compare(list[i], pivot) < 0)
                        i++; //index of the first number that is greater from pivot in left part
                    while (Comparer<T>.Default.Compare(list[k], pivot) > 0)
                        k--;

                    if (i <= k)
                    {
                        swap(list, i, k);
                        i++; k--;
                    }
                }
                //swap(numList, start, k);
                return i;     

        }


        private static void quickSort<T>(T[] numList, int start, int end)
        {
            int index = divide(numList, start, end);
            if (start < index - 1) quickSort(numList, start, index - 1);
            if (index < end)       quickSort(numList, index, end);
        }

        private static void swap<T>(T [] numList, int first, int second)
        {

            T temp = numList[first];
            numList[first] = numList[second];
            numList[second] = temp;
        }


    #endregion

    }

}
