import unittest
from kgV import kgV

class TestSmallestCommonMultiple(unittest.TestCase):
    
    def test_skgV(self):
        self.assertEqual(kgV(2, 3), 6)
        self.assertEqual(kgV(3, 5), 15)
        self.assertEqual(kgV(4, 6), 12)
        self.assertEqual(kgV(12, 18), 36)
        self.assertEqual(kgV(15, 25), 75)

if __name__ == '__main__':
    unittest.main()
