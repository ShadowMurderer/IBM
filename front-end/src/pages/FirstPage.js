import React, { useState } from "react";
import { getDog } from "../api/dog-api";
import "./../App.css";
/** Material UI Components */
import { Box, Button, Typography } from "@mui/material";
/** Image Assets */
import logoIBM from "./../assets/ibm-logo-e.png";
import logoCode from "./../assets/coderunlogo.png";

function FirstPage() {
  const [dogImage, setDogImage] = useState("");

  //#region handle Events
  const handleNextPage = () => {
    window.location.href = "/second";
  };

  const handleRequest = async () => {
    const result = await getDog();
    setDogImage(result.message);
  };
  //#endregion

  //#region render page content
  const renderHeader = () => {
    return (
      <Box sx={{ display: "flex", justifyContent: "space-between" }}>
        <img className="logo" src={logoIBM} alt="logo" />
        <img className="logo" src={logoCode} alt="logoCode" />
      </Box>
    );
  };

  const renderBody = () => {
    return (
      <>
        <Box
          sx={{
            display: "flex",
            gap: "2em",
            flexDirection: "column",
            alignItems: "center",
          }}
        >
          <Typography variant="h4" sx={{ fontWeight: "700", marginTop: "2em" }}>
            Welcome to CodeRun in IBM 🐝
          </Typography>
          <Typography variant="h4">
            Here is something to make you smile! 🫶🏼
          </Typography>
          <Button variant="contained" onClick={handleRequest}>
            Press Me!
          </Button>
          <img className="custom-image" src={dogImage} />
        </Box>
        <Box className="container">
          <Button variant="contained" onClick={handleNextPage}>
            Next Page
          </Button>
        </Box>
      </>
    );
  };
  //#endregion

  return (
    <Box className="default-page">
      {renderHeader()}
      {renderBody()}
    </Box>
  );
}

export default FirstPage;
