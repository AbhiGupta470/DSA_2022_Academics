class EFArrayDemo//Definition class
{
    int arr[];
    public EFArrayDemo()
    {
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //Method to traverse the array
    public void traverse()
    {
        for(int k:arr)
        {
            System.out.println(k);
        }
    }
    //method to insert values in the array in which throws keyword is not used
    public void insert1(int index,int value)
    {
        //index = 1
        // value = 56
        try
        {
            if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index] = value;
            }
            else
            {
                System.out.println("Already filled");
            }
        } catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid index");
        }
    }

    // method to print the value from array
    public void getValue(int index)
    {
        try{
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid index");
        }
    }

    //method to search the value in the array
    public void search(int value)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value)
            {
                System.out.println("Value found");
                return;//Used to come out directly from the loop
            }
        }
        System.out.println("Value not found"); //since the if conditions execute then this line will not execute
    }

    // method to delete the values from the array
    public void delete(int index)
    {
        try
        {
            arr[index]=Integer.MIN_VALUE;
        } catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid index");
        }
    }


    // method to delete the array
    public void deletearray()
    {
        arr = null;
    }
    //Performing use of throws keyword on a new insert method
    public void insert2(int index,int value) throws ArrayIndexOutOfBoundsException
    {
         if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index] = value;
            }
            else
            {
                System.out.println("Already filled");
            }

    }
}
class EFTest1 //Execution Class
{
    public static void main(String[] args) {
        EFArrayDemo obj = new EFArrayDemo();
        try
        {
            obj.traverse();
            obj.insert2(2,56);
        } catch(ArrayIndexOutOfBoundsException obj1)
        {
            System.out.println("Invalid Index");
        }
        obj.insert1(4,45);
        obj.delete(3);
        obj.getValue(2);
        obj.search(45);
        obj.deletearray();
    }
}
