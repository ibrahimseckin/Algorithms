﻿using System;
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
            for (int i = 0; i < 1000; i++)
            {
                int a = rd.Next(0, 1000000);
                asd.Add(a);
            }

            int[] adf = asd.ToArray();
            List<string> asds = new List<string>();
            asds.Add("asdb"); asds.Add("asdc"); asds.Add("sdaa"); asds.Add("safs");



            //InsertionSort.insertionSort(adf);
            //InsertionSort.insertionSort(asd);
            //InsertionSort.insertionSort(asds);

            QuickSort.quickSort(asd);
            QuickSort.quickSort(asds);
            QuickSort.quickSort(adf);
        }

    }

}
