//����   6 C  file_handling/WriteToFile  java/lang/Object <init> ()V Code
//  	   LineNumberTable LocalVariableTable this Lfile_handling/WriteToFile; main ([Ljava/lang/String;)V  java/io/File  myFiles/file1.txt
//     (Ljava/lang/String;)V  java/io/PrintWriter
//     (Ljava/io/File;)V  Hello world
//
//      write " Second line
//
//  $ %  close	 ' ) ( java/lang/System * + out Ljava/io/PrintStream;
// - / . java/io/FileNotFoundException 0 1 
//getMessage ()Ljava/lang/String;
// 3 5 4 java/io/PrintStream 6  println args [Ljava/lang/String; file1 Ljava/io/File; output Ljava/io/PrintWriter; e Ljava/io/FileNotFoundException; 
//StackMapTable 8 
//SourceFile WriteToFile.java !               /     *� �    
//                 
//   	       �     2� Y� L� Y+� M,� ,!� ,� #� M� &,� ,� 2�  
// # & -  
//   "    
// 
//   
//     #  '  1     *    2 7 8   
// ( 9 :    ; <  ' 
// = >  ?    � &  @   -
//  A    B