from token import COMMA
import unittest

class TestSplitMethod(unittest.TestCase):
    def test_split_by_default(self):
        self.assertEqual('Maks Pokrzywnicki'.split(), ['Maks', 'Pokrzywnicki'])
    
    def test_split_by_znak(self):
        self.assertEqual('Maks, Pokrzywnicki, klasa, 4TP'.split(', '), ['Maks', 'Pokrzywnicki', 'klasa', '4TP'])

if __name__ == '__main__':
    unittest.main()
    
