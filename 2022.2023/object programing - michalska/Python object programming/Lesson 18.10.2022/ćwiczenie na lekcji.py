import unittest
 
class TestUpper(unittest.TestCase):
    def test_case_1(self):
        self.assertEqual(3, 4)
 
    def test_case_2(self):
        self.assertAlmostEqual(3.5 , 3.51)
 
    def test_case_3(self):
        self.assertTrue('ABC'.upper())
        self.assertFalse('ABC'.upper())
 
 
if __name__ == '__main__':
    unittest.main()