import unittest

class TestJoinMethod(unittest.TestCase):
    def test_join_by_default(self):
        self.assertEqual(' '.join(['Maksymilian', 'Pokrzywnicki']), 'Maksymilian Pokrzywnicki')

    def test_join_by_znak(self):
        self.assertEqual(','.join(['Pracownia', 'Testowania', 'i', 'Projektowania', 'Aplikacji']), 'Pracownia,Testowania,i,Projektowania,Aplikacji')

if __name__ == '__main__':
    unittest.main()