package PreviousProblems;

import java.util.Stack;

public class Histogram {

    public static void main(String[] args) {

        int arr[]={2,1,5,6,2,3};

//        int ngr[]=ngr(arr);
//        int nsr[]=nsr(arr);
//          int ngl[]=ngl(arr);
          int nsl[]=nsl(arr);

        for(int i: nsl)
        {
            System.out.print(i+" ");
        }

    }

    public static int [] ngr(int arr[])
    {
//      Go from left to Right
        int ngrArray[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);  // pushing the index
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                ngrArray[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ngrArray[st.peek()]=-1;
            st.pop();
        }
        return ngrArray;

    }


    public static int [] ngl(int arr[])
    {
//      Go from Right to left
        int nglArray[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);  // pushing the index
        for(int i=arr.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                nglArray[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nglArray[st.peek()]=-1;
            st.pop();
        }
        return nglArray;

    }

    public static int [] nsr(int arr[])
    {
//      Go from left to Right
        int nsrArray[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);  // pushing the index
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                nsrArray[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nsrArray[st.peek()]=-1;
            st.pop();
        }
        return nsrArray;
    }

    public static int [] nsl(int arr[])
    {
//        Go from Right to left
        int nslArray[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);  // pushing the index
        for(int i=arr.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                nslArray[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nslArray[st.peek()]=-1;
            st.pop();
        }
        return nslArray;

    }



}


