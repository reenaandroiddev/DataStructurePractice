package com.prep.Trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Here we need to first add a word to the dictionary and the search
 * Here will make use trie which will help us to add / search word at each tree node.
 * So no need to keep searching for each word
 *
 * Time Complexity O (M) for adding word because in case of new word we need to add complete tree of length M
 * Time Complexity for Search, Time complexity
 *
 * While searching we search for each ch from word if that character is present then will return true else false
 * There is one more condition here that we need what if user enters
 *
 *
 *
 */

public class WordDictionary {

  // Add word
  // To add node we need to pass the trie
  // which is say root and need to check whether
  // have character present in that node


  public void addWord(String word, TrieNode trieNode) {
    TrieNode node = trieNode;

    for (char ch : word.toCharArray()) {
      if (!node.children.containsKey(ch)) {
        node.children.put(ch, new TrieNode());
      }
      node = node.children.get(ch);
    }
    node.word = true;
  }


// How you do search method
//
// TrieNode
  // Id node.children
  // Check if

  /**
   *
   * @param word
   * @param trieNode
   * @return
   *      b
   *     /
   *    b
   *   /  \
   *  c    a
   */

//  public boolean searchWord(String word, TrieNode trieNode) {
//
//    TrieNode node = trieNode;
//    for (int i = 0; i < word.length(); i++) {
//      char ch = word.charAt(i);
//      if (!node.children.containsKey(ch)) {
//        if (ch == '.') {
//          // Need to look for its sub strings
//
//          for (char chx : node.children.keySet()) {
//            // Need to return all children
//            TrieNode child = node.children.get(chx);
//            if (searchWord(word.substring(i + 1), child)) {
//              return true;
//            }
//          }
//        } else {
//          return false;
//        }
//      } else {
//        node = node.children.get(ch);
//      }
//    }
//
//
//    return false;
//  }

  /** Returns if the word is in the node. */
  public boolean searchInNode(String word, TrieNode node) {
    for (int i = 0; i < word.length(); ++i) {
      char ch = word.charAt(i);
      if (!node.children.containsKey(ch)) {
        // if the current character is '.'
        // check all possible nodes at this level
        if (ch == '.') {
          for (char x : node.children.keySet()) {
            TrieNode child = node.children.get(x);
            if (searchInNode(word.substring(i + 1), child)) {
              return true;
            }
          }
        }
        // if no nodes lead to answer
        // or the current character != '.'
        return false;
      } else {
        // if the character is found
        // go down to the next level in trie
        node = node.children.get(ch);
      }
    }
    return node.word;
  }


  // Search Word

  public static class TrieNode
  {

    //
    Map<Character,TrieNode> children = new HashMap<>();
    boolean word = false; // Why we need this and where are we using it

    // Empty Constructor
    public TrieNode()
    {

    }

  }
}

