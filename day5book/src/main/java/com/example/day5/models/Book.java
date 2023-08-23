package com.example.day5.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private
int id;
float price;
String bookName;
String authorName;
int ratings;
String description;
String genre;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public String getBookName() {
return bookName;
}
public void setBookName(String bookName) {
this.bookName = bookName;
}
public String getAuthorName() {
return authorName;
}
public void setAuthorName(String authorName) {
this.authorName = authorName;
}
public int getRatings() {
return ratings;
}
public void setRatings(int ratings) {
this.ratings = ratings;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public String getGenre() {
return genre;
}
public void setGenre(String genre) {
this.genre = genre;
}

}