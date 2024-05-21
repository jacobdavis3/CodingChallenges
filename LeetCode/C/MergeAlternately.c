/*******************************************************************************************************
 * 
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 *******************************************************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char * mergeAlternately(char * word1, char * word2) {
    // Create space for char *solution
    size_t len = strlen(word1) + strlen(word2);
    char *solution = (char *)malloc((len + 1) * sizeof(char));
    
    // Check for failed malloc
    if (solution == NULL)
        exit(EXIT_FAILURE);
    solution[0] = '\0';

    while (*word1 != '\0' && *word2 != '\0') {
       strncat(solution, word1, 1);
       strncat(solution, word2, 1);
       word1++;
       word2++;
    }

    // Either word1 or word2 is going to be used up
    // So cat the rest of the remaining word
    if (*word1 == '\0')
        strcat(solution, word2);
    else if (*word2 == '\0')
        strcat(solution, word1);

    // Add null byte at end
    solution[len] = '\0';
    
    return solution;
}

int main() {
    
    // Test Case 1
    char *word1 = "abc";
    char *word2 = "pqr";
    char *solution = mergeAlternately(word1, word2);
    printf("Solution should be apbqcr and is %s\n", solution);
    free(solution);
        
    // Test Case 2
    word1 = "ab";
    word2 = "pqrs";
    solution = mergeAlternately(word1, word2);
    printf("Solution should be apbqrs and is %s\n", solution);
    free(solution);

    // Test Case 3
    word1 = "abcd";
    word2 = "pq";
    solution = mergeAlternately(word1, word2);
    printf("Solution should be apbqcd and is %s\n", solution);
    free(solution);

    return EXIT_SUCCESS;
}