import React from "react";
import { JAVA_KEYWORDS } from "../constants/javaKeywords";

export function formatCodeSnippet(value) {
  if (value == null) {
    return "No code available";
  }

  if (typeof value === "string") {
    return value.trim() || "No code available";
  }

  try {
    return JSON.stringify(value, null, 2);
  } catch {
    return String(value);
  }
}

export function renderJavaCode(code) {
  const pattern =
    /(\/\*[\s\S]*?\*\/|\/\/.*|"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'|@\w+|\b\d+(?:\.\d+)?\b|\b[A-Za-z_]\w*\b|\s+|.)/g;
  const tokens = code.match(pattern) ?? [];

  return tokens.map((token, index) => {
    let className = "code-default";

    if (/^\/\*/.test(token) || /^\/\//.test(token)) {
      className = "code-comment";
    } else if (/^"/.test(token) || /^'/.test(token)) {
      className = "code-string";
    } else if (/^@/.test(token)) {
      className = "code-annotation";
    } else if (/^\d/.test(token)) {
      className = "code-number";
    } else if (JAVA_KEYWORDS.has(token)) {
      className = "code-keyword";
    }

    return (
      <span key={`${token}-${index}`} className={className}>
        {token}
      </span>
    );
  });
}
