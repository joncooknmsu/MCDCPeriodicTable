//
// JUnit tests for periodic table (elements) classification
// - tests beginning with "BB" are black-box average case tests
//   for some equivalence classes, but not all. The zero and 
//   hydrogen tests could also be considered boundary tests.
// - tests beginning with "MCDC" are tests created from the 
//   MC/DC analysis in the "pairsandtests.txt" file, for just
//   one if statement in the code.
// - always remember that no matter what method was used to 
//   create a test (BB, WB-statement, WB-branch, WB-MCDC),
//   the way to determine the correct outcome of a test is
//   by using the specification of what the code is supposed
//   to do!
//
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PeriodicTableTests {

@Test
void BBTestZero()
{
    assertEquals(PeriodicTable.Block.ERROR,
                 PeriodicTable.atomicBlock(0));
}

@Test
void BBTestHydrogenLoneNonMetal()
{
    assertEquals(PeriodicTable.Block.NONMETAL,
                 PeriodicTable.atomicBlock(1));
}

@Test
void BBTestSodiumAverageAlkaliMetal()
{
    assertEquals(PeriodicTable.Block.ALKALI_METAL,
                 PeriodicTable.atomicBlock(11));
}

@Test
void BBTestIronAverageTransitionMetal()
{
    assertEquals(PeriodicTable.Block.TRANSITION_METAL,
                 PeriodicTable.atomicBlock(26));
}

@Test
void BBTestNeonAverageNobleGas()
{
    assertEquals(PeriodicTable.Block.NOBLE_GAS,
                 PeriodicTable.atomicBlock(10));
}

@Test
void MCDCTestTableR2FFFT()
{
    assertNotEquals(PeriodicTable.Block.ALKALI_METAL,
                    PeriodicTable.atomicBlock(95));
}

@Test
void MCDCTestTableR4FFTT()
{
    assertEquals(PeriodicTable.Block.ALKALI_METAL,
                 PeriodicTable.atomicBlock(87));
}

@Test
void MCDCTestTableR7FTTF()
{
    assertEquals(PeriodicTable.Block.OTHER_METAL,
                 PeriodicTable.atomicBlock(83));
}

@Test
void MCDCTestTableR11TFTF()
{
    assertEquals(PeriodicTable.Block.HALOGEN,
                 PeriodicTable.atomicBlock(9));
}

@Test
void MCDCTestTableR12TFTT()
{
    assertEquals(PeriodicTable.Block.NONMETAL,
                 PeriodicTable.atomicBlock(15));
}

@Test
void MCDCTestTableR15TTTF()
{
    assertEquals(PeriodicTable.Block.ALKALI_METAL,
                 PeriodicTable.atomicBlock(19));
}

}
