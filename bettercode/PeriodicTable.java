//
// Periodic Table Calculator
// - see https://en.wikipedia.org/wiki/Periodic_table#Classification_of_elements
//

import java.util.Set;

public class PeriodicTable {

public enum Block { NONMETAL, ALKALI_METAL, TRANSITION_METAL, OTHER_METAL, 
                    METALLOID, NOBLE_GAS, HALOGEN, LANTHANIDE, ACTINIDE, ERROR}

static class BlockSet
{
    String name;
    Block block;
    Set elements;
    public BlockSet(String name, Block block, Set elements)
    {
        this.name = name;
        this.block = block;
        this.elements = elements;
    }
    public String toString() { return name; }
    public boolean contains(int element) { return elements.contains(element); }
};

public static final Set<BlockSet> Table = Set.of(
    new BlockSet("NonMetals", Block.NONMETAL, Set.of(1,6,7,8,15,16,34)),
    new BlockSet("Alkali Metals", Block.ALKALI_METAL, Set.of(3,11,19,37,55,87,
                 4,12,20,38,56,88)),
    new BlockSet("Transition Metals", Block.TRANSITION_METAL, Set.of(21,22,23,
                 24,25,26,27,28,29,30,39,40,41,42,43,44,45,46,47,48,72,73,74,
                 75,76,77,78,79,80,104,105,106,107,108,109,110,111,112)),
    new BlockSet("Other Metals", Block.OTHER_METAL, Set.of(13,31,49,50,81,82,
                 83,84,113,114,115,116)),
    new BlockSet("Metalloids", Block.METALLOID, Set.of(5,14,32,33,51,52)),
    new BlockSet("Noble Gases", Block.NOBLE_GAS, Set.of(2,10,18,36,54,86,118)),
    new BlockSet("Halogens", Block.HALOGEN, Set.of(9,17,35,53,85,117))
    /** need to finish with LANTHANIDE and ACTINIDE sets **/
    );

public static Block atomicBlock(int atomicNumber)
{
    for (BlockSet group: Table) {
        if (group.contains(atomicNumber)) {
            return group.block;
        }
    }   
    return Block.ERROR;
}

public static void main(String[] args)
{
    int element;
    element = Integer.parseInt(args[0]);
    Block block = atomicBlock(element);
    System.out.println("element: " + element + " is in " + block);
}

/*** Not used yet
public enum Group { LI_GROUP, BE_GROUP, SC_GROUP, TI_GROUP, V_GROUP, CR_GROUP, MN_GROUP, FE_GROUP, CO_GROUP, NI_GROUP, CU_GROUP, ZN_GROUP, B_GROUP, C_GROUP, N_GROUP, O_GROUP, F_GROUP, HE_GROUP, ERROR}
***/

}
