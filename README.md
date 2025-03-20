# 💬 Real-Time WebSocket Chat Application

A simple real-time chat application built using Spring Boot WebSockets, with a modern chat UI and username support.
Messages are displayed with usernames, and users must enter their name before chatting.

## 🚀 Features

- ✅ Real-time messaging using WebSockets
- ✅ Username input before chatting
- ✅ Chat bubbles for messages
- ✅ Auto-scroll to latest messages
- ✅ Modern, responsive chat UI

## 📌 Tech Stack

- **Backend**: Spring Boot, WebSockets
- **Frontend**: HTML, CSS, JavaScript
- **Database (Optional for future enhancements)**: PostgreSQL/MongoDB

## 📂 Project Structure

```bash
src/main/java/com/example/chat/
  ├── config/                # WebSocket configuration
  ├── handler/               # WebSocket message handler
  ├── static/                # Frontend (HTML, CSS, JS)
  ├── ChatApplication.java   # Main Spring Boot application
src/main/resources/static/
  ├── index.html             # Chat UI
  ├── script.js              # Frontend WebSocket logic
  ├── styles.css             # Chat styling
```

## ⚙️ Setup & Run the Project

```bash
git clone https://github.com/Souravchwn/chitchat.git
cd chitchat
mvn clean install
mvn spring-boot:run
```

Open your browser and navigate to `http://localhost:9000/`.

## 📜 API Endpoints

| Endpoint | Method    | Description                                |
|----------|-----------|--------------------------------------------|
| `/chat`  | WebSocket | WebSocket endpoint for real-time messaging |

## 📌 Future Enhancements

- 🔹 Message persistence with database
- 🔹 Online user tracking
- 🔹 Private one-to-one messaging
- 🔹 Typing indicators
- 🔹 Message read receipts
- 🔹 Emoji support
- 🔹 File sharing (images, documents)
- 🔹 User authentication and authorization

## 📜 License

This project is open-source and free to use.
