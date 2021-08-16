package com.prep.Trie;

public class DesignDictionary {

  public static void main(String[] args) {
    WordDictionary dictionary = new WordDictionary();
    WordDictionary.TrieNode trieNode = new WordDictionary.TrieNode();
    dictionary.addWord("bad",trieNode);
    dictionary.addWord("bag",trieNode);
    dictionary.addWord("back",trieNode);
    dictionary.addWord("word",trieNode);


    System.out.println(dictionary.searchInNode("ba",trieNode));

  }
}
