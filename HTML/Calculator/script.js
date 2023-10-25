let currentInput = '';
let currentResult = '';

function clearDisplay() {
    currentInput = '';
    currentResult = '';
    document.getElementById('display').value = '';
}

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById('display').value = currentInput;
}

function calculateResult() {
    try {
        currentResult = eval(currentInput);
        document.getElementById('display').value = currentResult;
        currentInput = currentResult.toString();
    } catch (error) {
        document.getElementById('display').value = 'Error';
    }
}
