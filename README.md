# EIST Project Repository

This repository contains multiple Java projects for EIST exercises and exams.

## Structure
- Each subfolder is a separate Java project (e.g., `eist22exambridgepatterntest-ge42bax`, `eist22h01e02-ge42bax`, etc.).
- Each project uses Gradle for build management.

## Cleaning Up Submodules
If you ever see folders showing as empty or as submodules on GitHub, follow these steps to convert them to regular folders and keep your repository clean:

1. Remove all nested git repositories and submodule references:
    ```sh
    find . -mindepth 2 -name .git -type d -exec rm -rf {} +
    find . -name ".gitmodules" -delete
    find . -name ".gitattributes" -delete
    git ls-files --stage | grep "^160000" | awk '{print $4}' | xargs git rm --cached
    find . -name ".gitignore" -not -path "./.git/*" -delete
    ```
2. Add all files as regular files:
    ```sh
    git add .
    git commit -m "Convert submodules to regular folders and add all files"
    git push origin main
    ```
3. Add a `.gitignore` to keep your repo clean (see included template).

## .gitignore Template
See the `.gitignore` file in the root for recommended ignores for IDE, build, OS, and temp files.

---

**Why?**
- Keeps your repository free from IDE, build, and OS-specific junk.
- Only your source code, documentation, and essential config files are tracked.