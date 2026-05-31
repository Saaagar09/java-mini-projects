🎵 Java Console Music Player

A simple console-based music player built in Java that plays .wav audio files from a local folder. It provides basic playback controls like play, pause, reset, and quit.

🚀 Features
▶️ Play audio
⏸ Pause audio
🔁 Reset track
❌ Quit player
📁 Loads audio from a relative folder path
🖥 Console-based user interface
🛠 Tech Stack
Java
Java Sound API (javax.sound.sampled)
📂 Project Structure
music-player/
│
├── MusicPlayer.java
├── songs/
│   └── CEO - Cheema Y.wav
├── README.md
⚙️ How It Works

The program loads a .wav file from the songs folder:

String path = "songs\\CEO - Cheema Y.wav";
Uses AudioInputStream to read the audio file
Uses Clip class to control playback
Takes user input from console to control the music
📌 Usage

When you run the program, you’ll see:

P = Play | S = Pause | R = Reset | Q = Quit
Controls:
P → Play music
S → Pause music
R → Reset music
Q → Quit player
⚠️ Important Notes
✔️ Only supports .wav audio format
✔️ Make sure the file exists inside the songs folder
✔️ Uses relative path, so project structure matters
❌ .mp3 is not supported by default Java Sound API
💡 Future Improvements
⏭ Add Next / Previous song functionality
📃 Playlist support (multiple songs from folder)
🔊 Volume control
🔀 Shuffle / Repeat modes
🖥 GUI version using Swing or JavaFX
👨‍💻 Author

Sagar
GitHub: https://github.com/Saaagar09

⭐ Support

If you like this project, consider giving it a star ⭐ and contributing!