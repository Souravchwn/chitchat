let socket;
let username;

function joinChat() {
    username = document.getElementById("username").value.trim();
    if (!username) {
        alert("Please enter your name!");
        return;
    }

    document.getElementById("name-container").style.display = "none";
    document.getElementById("chat-container").style.display = "flex";

    socket = new WebSocket("ws://localhost:9000/chat");

    socket.onopen = function () {
        console.log(username + " connected to chat!");
    };

    socket.onmessage = function (event) {
        displayMessage(event.data);
    };
}

function sendMessage() {
    let input = document.getElementById("message");
    let messageText = input.value.trim();
    if (!messageText) return;

    let fullMessage = username + ": " + messageText;
    socket.send(fullMessage);
    displayMessage(fullMessage, true);
    input.value = "";
}

function handleEnter(event) {
    if (event.key === "Enter") {
        sendMessage();
    }
}

function displayMessage(message, isUser) {
    let chatBox = document.getElementById("chat-box");
    let messageElement = document.createElement("div");
    messageElement.textContent = message;
    messageElement.classList.add("message");

    if (isUser) {
        messageElement.classList.add("user-message");
    } else {
        messageElement.classList.add("other-message");
    }
    chatBox.appendChild(messageElement);
    chatBox.scrollTop = chatBox.scrollHeight;
}
