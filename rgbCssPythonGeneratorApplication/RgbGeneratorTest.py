import unittest

from RgbGenerator import generateRgb


class MyTestCase(unittest.TestCase):
    def test_something(self):
        request = "{'red': 100, 'green': 150, 'blue': 200, 'text': 'someText'}"
        self.assertEqual("rgb(100, 150, 200)", generateRgb(request))

if __name__ == '__main__':
    unittest.main()
