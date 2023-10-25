// Function to reverse a word
function reverseWord(word) {
  return word.split("").reverse().join("");
}

// Function to reverse every word in a sentence
function reverseSentence() {
  const inputSentence = document.getElementById("sentence").value;
  const words = inputSentence.split(" ");
  const reversedWords = words.map(reverseWord);
  const reversedSentence = reversedWords.join(" ");
  document.getElementById("result").textContent = reversedSentence;
}

// Add event listener to the "Reverse" button
document
  .getElementById("reverseButton")
  .addEventListener("click", reverseSentence);
