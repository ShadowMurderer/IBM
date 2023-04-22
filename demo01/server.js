const express = require('express');
const app = express();

// Define routes
app.get('/', (req, res) => {
  res.send('Hello, World!');
});

// Serve static files from the "public" directory
// app.use(express.static('/CodeRun-IBM/demo-frontend/src/pages/FirstPage.js'));


// Start the server
const port = 3000;
app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});
