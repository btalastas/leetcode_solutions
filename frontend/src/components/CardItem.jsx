import React from "react";
import { Card, CardContent, CardActions, Typography, Button } from "@mui/material";

export default function CardItem({ item, onShowRaw }) {
    return (
        <Card>
            <CardContent>
                <Typography variant="h6" gutterBottom>
                    {item.title ?? "Untitled"}
                </Typography>
                <Typography variant="body2" color="text.secondary" gutterBottom>
                    {item.summary ?? item.description ?? "No description"}
                </Typography>
                <Typography variant="body2">
                    Property 1: <strong>{item.amount ?? item.value ?? "N/A"}</strong>
                </Typography>
                <Typography variant="body2">
                    Property 2: <strong>{item.status ?? item.type ?? "N/A"}</strong>
                </Typography>
                <Typography variant="caption" color="text.secondary">
                    ID: {item.id ?? "unknown"}
                </Typography>
            </CardContent>
            <CardActions>
                <Button size="small" onClick={() => onShowRaw(item.methods?.[0]?.code)}>
                    Show Code Snippet
                </Button>
            </CardActions>
        </Card>
    );
}
