// Function to sort an array in descending order
function sortDescending() {
  const inputArray = document.getElementById("inputArray").value;
  const array = inputArray.split(",").map((item) => parseFloat(item.trim()));

  // Remove any NaN values from the array
  const validArray = array.filter((item) => !isNaN(item));

  const sortedArray = validArray.sort((a, b) => b - a);
  document.getElementById("result").textContent = sortedArray.join(", ");
}

// Add an event listener to the "Sort" button
document.getElementById("sortButton").addEventListener("click", sortDescending);
