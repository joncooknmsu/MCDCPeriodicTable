//
// Periodic Table Calculator
// - see https://en.wikipedia.org/wiki/Periodic_table#Classification_of_elements
//

public class PeriodicTable {

public enum Block { NONMETAL, ALKALI_METAL, TRANSITION_METAL, OTHER_METAL, 
                    METALLOID, NOBLE_GAS, HALOGEN, LANTHANIDE, ACTINIDE, ERROR}

public static Block atomicBlock(int atomicNumber)
{
    if (atomicNumber < 1 || atomicNumber > 130)
        return Block.ERROR;
    if (atomicNumber >= 57 && atomicNumber <= 71)
        return Block.LANTHANIDE;
    if (atomicNumber >= 89 && atomicNumber <= 103)
        return Block.ACTINIDE;
    if ((atomicNumber <= 19 && atomicNumber % 8 == 3) || 
        (atomicNumber <= 87 && atomicNumber % 8 == 7))
        return Block.ALKALI_METAL;
    if ((atomicNumber <= 10 && atomicNumber % 8 == 2) || 
        (atomicNumber >= 18 && atomicNumber % 9 == 0))
        return Block.NOBLE_GAS;
    if (atomicNumber == 1 || atomicNumber == 6 || 
        ((atomicNumber+1) % 8 == 0 && atomicNumber < 16) ||
        ((atomicNumber) % 8 == 0 && atomicNumber < 35))
        return Block.NONMETAL;
    if (atomicNumber >=21 && atomicNumber <= 112)
        return Block.TRANSITION_METAL;
    if (atomicNumber >=13 && atomicNumber <= 116)
        return Block.OTHER_METAL;
    return Block.ERROR;
}


public static void main(String[] args)
{
    int element;
    element = Integer.parseInt(args[0]);
    Block block = atomicBlock(element);
    System.out.println("element: " + element + " is in " + block);
}

/*** Not used for now
public enum Group { LI_GROUP, BE_GROUP, SC_GROUP, TI_GROUP, V_GROUP, CR_GROUP, MN_GROUP, FE_GROUP, CO_GROUP, NI_GROUP, CU_GROUP, ZN_GROUP, B_GROUP, C_GROUP, N_GROUP, O_GROUP, F_GROUP, HE_GROUP, ERROR}
***/

}
