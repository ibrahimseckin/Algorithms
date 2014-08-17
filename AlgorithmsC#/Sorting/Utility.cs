using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorting
{
    class Utility
    {
        public static void Swap<T>(List<T> data, int first, int second)
        {
            T temp = data[first];
            data[first]= data[second];
            data[second] = temp;
        }

        public static void Swap<T>(T [] data, int first, int second)
        {
            T temp = data[first];
            data[first] = data[second];
            data[second] = temp;
        }
    }
}
