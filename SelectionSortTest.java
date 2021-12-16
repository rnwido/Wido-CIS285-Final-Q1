import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	void test() {
		testPositive();
		testNegative();
		testMixed();
	}

	public SelectionSortTest() {
	}
	SelectionSort temp = new SelectionSort();

    public void testPositive() {
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        temp.sort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        temp.sort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
    
    public void testMixed() {
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -2;
        Sortedarr[4] = 7;

        temp.sort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
}
