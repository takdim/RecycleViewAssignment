package com.example.tugas5;

import java.util.ArrayList;

public class HeroesData {
    private static String Judul [] = {
            "Gintama",
            "One Piece",
            "Kimi No Nawa",
            "Yuru Camp"
    };

    private static String Genre [] = {

            "Comedy",
            "Action",
            "Slice of Life",
            "Slice of Life"
    };

    private static String Descrition [] = {
            "After joining the resistance against the bakufu, Gintoki and the gang are in hiding, along with Katsura and his Joui rebels. The Yorozuya is soon approached by Nobume Imai and two members of the Kiheitai, who explain that the Harusame pirates have turned against 7th Division Captain Kamui and their former ally Takasugi. The Kiheitai present Gintoki with a job: find Takasugi, who has been missing since his ship was ambushed in a Harusame raid. Nobume also makes a stunning revelation regarding the Tendoushuu, a secret organization pulling the strings of numerous factions, and their leader Utsuro, the shadowy figure with an uncanny resemblance to Gintoki's former teacher",
            "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.",
            "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.",
            "While the perfect getaway for most girls her age might be a fancy vacation with their loved ones, Rin Shima's ideal way of spending her days off is camping alone at the base of Mount Fuji. From pitching her tent to gathering firewood, she has always done everything by herself, and has no plans of leaving her little solitary world."
    };

    private  static  int HeroImages[] = {
            R.drawable.gintama,
            R.drawable.one_piece,
            R.drawable.kimi_no_nawa,
            R.drawable.yuru_camp


    };

    public static ArrayList<Hero> getListData(){
      ArrayList<Hero> list = new ArrayList<>();
      for (int position = 0; position < Judul.length; position++){
          Hero hero = new Hero();
          hero.setName(Judul[position]);
          hero.setGenre(Genre[position]);
          hero.setDetail(Descrition[position]);
          hero.setPhoto(HeroImages[position]);
          list.add(hero);
      }
      return list;
    };
}
