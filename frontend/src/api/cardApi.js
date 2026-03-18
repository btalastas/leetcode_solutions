const API_BASE = import.meta.env.VITE_API_BASE || "";

export async function getCards() {
  const response = await fetch(`${API_BASE}/api/problems`);
  if (!response.ok) {
    throw new Error(`API error ${response.status}`);
  }
  const data = await response.json();
  return Array.isArray(data) ? data : [];
}
