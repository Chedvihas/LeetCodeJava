# Add all changes and commit
cd /Users/chedvi/IdeaProjects/LeetCodeJava


commitmessage=$(
git status --porcelain | \
awk 'BEGIN { found = 0 } \
/^??/ { newfiles = newfiles " " $2; found = 1 } \
/^ M / { modified = modified "" $2; found = 1 } \
/^ D / { deleted = deleted "" $2; found = 1 } \
END { \
    if (found == 1) { \
        if (length(newfiles) > 0) { printf " Added : %s", newfiles } \
        if (length(modified) > 0) { printf " | Updated : %s", modified } \
        if (length(deleted) > 0) { printf " | Deleted : %s|", deleted } \
        print "" \
    } \
}'
)

git -C /Users/chedvi/IdeaProjects/LeetCodeJava add .
current_datetime=$(date +"%dth %b %I:%M %p")
git -C /Users/chedvi/IdeaProjects/LeetCodeJava commit -m "$commitmessage"
git -C /Users/chedvi/IdeaProjects/LeetCodeJava push --set-upstream origin main
# Push changes to remote repository
git -C /Users/chedvi/IdeaProjects/LeetCodeJava push # Replace 'main' with your branch name if necessary