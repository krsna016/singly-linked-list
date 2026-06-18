# singly-linked-list

[![Language: Python](https://img.shields.io/badge/language-Python-blue.svg)]()
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![CI Pipeline](https://github.com/krsna016/singly-linked-list/actions/workflows/ci.yml/badge.svg)](https://github.com/krsna016/singly-linked-list/actions/workflows/ci.yml)
[![Security: CodeQL](https://github.com/krsna016/singly-linked-list/actions/workflows/codeql.yml/badge.svg)](https://github.com/krsna016/singly-linked-list/actions/workflows/codeql.yml)

Professional engineering repository configurations deployed inside your GitHub profile.

---

## 📝 Overview & Core Description
![Alt text](https://media.geeksforgeeks.org/wp-content/uploads/20220816144425/LLdrawio.png)

A comprehensive Java implementation of a Singly Linked List with various operations.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)

## Introduction

This repository provides a robust implementation of a Singly Linked List in Java. A Singly Linked List is a fundamental data structure where elements are stored in nodes, and each node points to the next node in the sequence.

## Features

- **Basic Operations:**
  - Add elements at the beginning (`add_first`)
  - Add elements at the end (`add_last`)
  - Remove elements from the beginning (`remove_first`)
  - Remove elements from the end (`remove_last`)
  - Add elements at any position (`add_any`)
  - Remove elements from any position (`remove_any`)
  - Reverse the linked list (`reverse`)
  - Search for a specific node (`search_node`)
- **Size and Empty Checks:**
  - Get the size of the list (`get_size`)
  - Check if the list is empty (`is_empty`)
- **Print Elements:**
  - Display the elements of the list (`print_element`)

## Getting Started

### Prerequisites

Ensure that you have the Java Development Kit (JDK) and Git installed on your machine.

### Clone the Repository

Run this into your command prompt / Terminal and open the file from the specific directory
```bash
git clone https://github.com/krsna016/singly-linked-list.git

---

## 🏛️ System Design & Folder Structure
```text
.github/                  # CI/CD pipelines, Dependabot, and Issue/PR schemas
.editorconfig             # Unified file formatting configuration
.gitattributes            # Normalization variables for LF line endings
.gitignore                # Local environment overrides and cache limits
.pre-commit-config.yaml   # Quality check execution triggers
LICENSE                   # Permissive open-source MIT License
Makefile                  # Development workspace orchestrator
CHANGELOG.md              # Historical version tracking
CONTRIBUTING.md           # Developer onboarding guidelines
CODE_OF_CONDUCT.md        # Communication guidelines
SECURITY.md               # Responsible vulnerability disclosures
```

---

## 🛠️ Tooling & Tech Stack
- **Primary Environment:** Python runtime.
- **Workflow Automation:** GitHub Actions CI, Dependabot, and CodeQL.
- **Standards Checkers:** Git `pre-commit` hook validations.

---

## ⚙️ Quickstart & Local Setup
1. Clone this repository locally:
   ```bash
   git clone https://github.com/krsna016/singly-linked-list.git
   cd singly-linked-list
   ```
2. Trigger the local setup runner:
   ```bash
   make help
   ```

---

## 📋 Security & Responsible Disclosure
For details on disclosing vulnerabilities or hardcoded secrets, refer directly to our [SECURITY.md](SECURITY.md) guidelines.

---

## 📜 License
This repository is licensed under the permissive **MIT License**. For details, see the [LICENSE](LICENSE) file.
