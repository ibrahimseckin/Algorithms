using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class MergeSort
    {
        #region list version
        public static void mergeSort<T>(List<T> data)
        {
            MergeSortJob(data);
        }



        public static List<T> MergeSortJob<T>(List<T> data)
        {
            List<T> left = null;
            List<T> right = null;
            int leftPtr = 0, rightPtr = 0,cursor=0;
            if (data.Count > 1)
            {
                int half = (data.Count + 1) / 2;
                left =  MergeSortJob(data.GetRange(0, half));
                right = MergeSortJob(data.GetRange(half, data.Count - half));


                while (leftPtr < left.Count && rightPtr < right.Count)
                {
                    if (Comparer<T>.Default.Compare(left[leftPtr], right[rightPtr]) < 0)
                    {
                        data[cursor] = left[leftPtr];
                        leftPtr++; cursor++;
                    }

                    else
                    {
                        data[cursor] = right[rightPtr];
                        rightPtr++; cursor++;
                    }
                }


                while (cursor < data.Count)
                {
                    if (leftPtr < left.Count)
                    {
                        data[cursor] = left[leftPtr];
                        leftPtr++; cursor++;
                    }

                    else
                    {
                        data[cursor] = right[rightPtr];
                        rightPtr++; cursor++;
                    }
                }

            }

            return data;
        }

        #endregion

        #region array version

        public static void mergeSort<T>(T [] data)
        {
            MergeSortJob(data);
        }



        public static T [] MergeSortJob<T>(T [] data)
        {
            List<T> left = null;
            List<T> right = null;
            int leftPtr = 0, rightPtr = 0, cursor = 0;
            List<T> list = data.ToList<T>();
            if (data.Length > 1)
            {
                int half = (data.Length + 1) / 2;
                left = MergeSortJob(list.GetRange(0, half));
                right = MergeSortJob(list.GetRange(half, list.Count - half));


                while (leftPtr < left.Count && rightPtr < right.Count)
                {
                    if (Comparer<T>.Default.Compare(left[leftPtr], right[rightPtr]) < 0)
                    {
                        data[cursor] = left[leftPtr];
                        leftPtr++; cursor++;
                    }

                    else
                    {
                        data[cursor] = right[rightPtr];
                        rightPtr++; cursor++;
                    }
                }


                while (cursor < list.Count)
                {
                    if (leftPtr < left.Count)
                    {
                        data[cursor] = left[leftPtr];
                        leftPtr++; cursor++;
                    }

                    else
                    {
                        data[cursor] = right[rightPtr];
                        rightPtr++; cursor++;
                    }
                }

            }

            return list.ToArray();
        }

        #endregion
    }
}
