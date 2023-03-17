# test_euclidean.py

import unittest
from euclidean import euclidean
from euclideanRecursive import euclideanRecursive

class TestEuclidean(unittest.TestCase):
    
    def test_euclidean(self):
        self.assertEqual(euclidean(10, 25), 5)
        self.assertEqual(euclidean(14, 28), 14)
        self.assertEqual(euclidean(21, 28), 7)
        self.assertEqual(euclidean(18, 24), 6)
        self.assertEqual(euclidean(60, 48), 12)

    def test_euclidean(self):
        self.assertEqual(euclideanRecursive(10, 25), 5)
        self.assertEqual(euclideanRecursive(14, 28), 14)
        self.assertEqual(euclideanRecursive(21, 28), 7)
        self.assertEqual(euclideanRecursive(18, 24), 6)
        self.assertEqual(euclideanRecursive(60, 48), 12)   

if __name__ == '__main__':
    unittest.main()
