import React, { useEffect, useState } from "react";
import {
  Button,
  Container,
  Typography,
  CircularProgress,
  Grid,
  Dialog,
  DialogTitle,
  DialogContent,
  DialogActions,
} from "@mui/material";
import CardItem from "./components/CardItem";
import { getCards } from "./api/cardApi";
import { formatCodeSnippet, renderJavaCode } from "./utils/codeHighlight.jsx";

function App() {
  const [items, setItems] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);
  const [selectedCode, setSelectedCode] = useState("");

  const fetchCards = async () => {
    setLoading(true);
    setError(null);
    try {
      const data = await getCards();
      setItems(data);
    } catch (err) {
      setError(err.message || "Unknown error");
      setItems([]);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchCards();
  }, []);

  const showRaw = (code) => {
    setSelectedCode(formatCodeSnippet(code));
  };

  return (
    <Container maxWidth="md" style={{ marginTop: "2rem" }}>
      <Typography variant="h4" gutterBottom>
        Spring API Cards Practice
      </Typography>
      <Button variant="contained" onClick={fetchCards} disabled={loading} sx={{ mb: 2 }}>
        Refresh Cards
      </Button>

      {loading && (
        <div style={{ display: "flex", alignItems: "center", gap: 8 }}>
          <CircularProgress size={20} />
          <Typography>Loading cards...</Typography>
        </div>
      )}

      {error && (
        <Typography variant="body1" color="error" sx={{ mb: 2 }}>
          API error: {error}
        </Typography>
      )}

      {!loading && items.length === 0 && !error && (
        <Typography variant="body1" color="text.secondary" sx={{ mb: 2 }}>
          No cards returned yet. Click refresh.
        </Typography>
      )}

      <Grid container spacing={2}>
        {items.map((item) => (
          <Grid size={{ xs: 12, sm: 6 }} key={item.id ?? item.title ?? JSON.stringify(item)}>
            <CardItem item={item} onShowRaw={showRaw} />
          </Grid>
        ))}
      </Grid>

      <Dialog
        open={Boolean(selectedCode)}
        onClose={() => setSelectedCode("")}
        fullWidth
        maxWidth="md"
      >
        <DialogTitle>Java</DialogTitle>
        <DialogContent dividers>
          <pre
            className="code-snippet"
          >
            <code>{renderJavaCode(selectedCode)}</code>
          </pre>
        </DialogContent>
        <DialogActions>
          <Button onClick={() => setSelectedCode("")}>Close</Button>
        </DialogActions>
      </Dialog>
    </Container>
  );
}

export default App;
