import React from "react";
import "./../App.css";
/** Material UI Components */
import { Box, Button, Typography } from "@mui/material";
/** Image Assets */
import logoIBM from "./../assets/ibm-logo-e.png";
import logoCode from "./../assets/coderunlogo.png";

const SecondPage = () => {
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
      <Box
        sx={{
          display: "flex",
          gap: "2em",
          flexDirection: "column",
          alignItems: "center",
        }}
      >
        <Typography variant="h4" sx={{ fontWeight: "700", marginTop: "2em" }}>
          This is your playground, to express yourself!
        </Typography>
        <Typography variant="h5" sx={{ fontWeight: "700" }}>
          🎊 Enjoy! 🎊
        </Typography>
        <Button
          variant="contained"
          onClick={() => {
            window.location.href = "/";
          }}
        >
          Go back to the first page
        </Button>
      </Box>
    );
  };
  //#endregion

  return (
    <Box className="default-page">
      {renderHeader()} {renderBody()}
    </Box>
  );
};

export default SecondPage;
