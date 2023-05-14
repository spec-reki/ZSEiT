using System;
using System.IO;

class HangmanGame
{
    private string[] words; // Baza haseł
    private string wordToGuess;
    private char[] guessedLetters;
    private int maxErrors;
    private int errors;
    
    public HangmanGame()
    {
        words = new string[] { "java", "python", "csharp", "javascript", "ruby" }; // Przykładowa baza haseł
        maxErrors = 8;
    }
    
    public void LoadWordsFromFile(string filename)
    {
        try
        {
            words = File.ReadAllLines(filename);
        }
        catch (Exception e)
        {
            Console.WriteLine("Błąd podczas wczytywania pliku z hasłami: " + e.Message);
        }
    }
    
    public void StartNewGame()
    {
        Random random = new Random();
        wordToGuess = words[random.Next(words.Length)];
        guessedLetters = new char[wordToGuess.Length];
        errors = 0;
        
        Console.WriteLine("\nWisielec - zgadnij hasło!");
        Console.WriteLine("\nLiczba błędów: {0}/{1}", errors, maxErrors);
        
        while (true)
        {
            Console.Write("Hasło do zgadnięcia: ");
            for (int i = 0; i < wordToGuess.Length; i++)
            {
                if (guessedLetters[i] == '\0')
                {
                    Console.Write("*");
                }
                else
                {
                    Console.Write(guessedLetters[i]);
                }
            }
            
            Console.WriteLine();
            Console.Write("Podaj literę: ");
            char input = Console.ReadLine()[0];
            
            if (!char.IsLetter(input))
            {
                Console.WriteLine("\nBłąd! Podaj literę.");
                continue;
            }
            
            if (IsLetterGuessed(input))
            {
                Console.WriteLine("\nTa litera została już podana.");
                continue;
            }
            
            bool letterFound = false;
            for (int i = 0; i < wordToGuess.Length; i++)
            {
                if (char.ToLower(wordToGuess[i]) == char.ToLower(input))
                {
                    guessedLetters[i] = input;
                    letterFound = true;
                }
            }
            
            if (!letterFound)
            {
                errors++;
                Console.WriteLine("\nNie ma takiej litery.");
            }
            
            Console.WriteLine("\nLiczba błędów: {0}/{1}", errors, maxErrors);
            
            if (errors >= maxErrors)
            {
                Console.WriteLine("Przegrałeś! Hasło to: {0}", wordToGuess);
                break;
            }
            
            if (Array.IndexOf(guessedLetters, '\0') == -1)
            {
                Console.WriteLine("Wygrałeś! Hasło to: {0}", wordToGuess);
                break;
            }
        }
    }
    
    private bool IsLetterGuessed(char letter)
    {
        foreach (char guessedLetter in guessedLetters)
        {
            if (char.ToLower(guessedLetter) == char.ToLower(letter))
            {
                return true;
            }
        }
        return false;
    }
}

class Program
{
    static void Main(string[] args)
    {
        HangmanGame hangman = new HangmanGame();

        bool exit = false;

        while (!exit)
        {
            Console.WriteLine("1 - Graj dalej");
            Console.WriteLine("2 - Koniec programu");
            Console.Write("Wybierz opcję: ");
            string input = Console.ReadLine();

            switch (input)
            {
                case "1":
                    hangman.StartNewGame();
                    break;
                case "2":
                    exit = true;
                    break;
                default:
                    Console.WriteLine("Nieprawidłowa opcja. Spróbuj ponownie.");
                    break;
            }

            Console.WriteLine();
        }

        Console.WriteLine("Bye bye!");
    }
}